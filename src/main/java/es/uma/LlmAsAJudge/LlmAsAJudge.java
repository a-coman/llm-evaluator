package es.uma.LlmAsAJudge;

import es.uma.Table;
import es.uma.Utils;
import es.uma.LlmAsAJudge.JudgeUtils.Section;
import es.uma.LlmAsAJudge.JudgeUtils.WorkItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LlmAsAJudge {

    private static final Model MODEL = Model.QWEN_4B;

    private static void judgeBySystem(String modeTitle, String dataset,
            Map<String, Map<String, List<String>>> paths,
            boolean includeCategoryInResponses) {

        if (paths == null || paths.isEmpty()) {
            return;
        }

        String outDir = null;
        StringBuilder responsesMd = new StringBuilder();
        StringBuilder resultsMd = new StringBuilder();

        // Counts per system
        Map<String, LongAdder> realisticBySystem = new ConcurrentHashMap<>();
        Map<String, LongAdder> unrealisticBySystem = new ConcurrentHashMap<>();
        Map<String, LongAdder> unknownBySystem = new ConcurrentHashMap<>();

        // Collect non-fatal errors instead of throwing from worker threads
        ConcurrentLinkedQueue<String> errors = new ConcurrentLinkedQueue<>();

        try {
            // Derive output directory from any .soil path.
            // Works for:
            // - Simple: .../Simple/<system>/<date>/<gen>/output.soil (levelsUp=3 =>
            // <system>/)
            // - CoT: .../CoT/<system>/<date>/<gen>/<category>.soil (levelsUp=3 =>
            // <system>/)
            String firstPath = paths.values().iterator().next().values().iterator().next().get(0);
            outDir = JudgeUtils.deriveOutDirFromAnyPath(firstPath, 4);

            // Responses markdown: contains all systems
            responsesMd.append("# ")
                    .append(modeTitle)
                    .append(" / ")
                    .append(dataset)
                    .append(" / ")
                    .append(MODEL.name())
                    .append("\n\n");

            List<String> orderedSystems = new ArrayList<>(paths.keySet());
            Collections.sort(orderedSystems);

            for (String system : orderedSystems) {
                Map<String, List<String>> genMap = paths.get(system);
                if (genMap == null || genMap.isEmpty()) {
                    continue;
                }

                String domainModelPath = "src/main/resources/prompts/" + system.toLowerCase() + "/diagram.use";
                String domainModel;
                try {
                    domainModel = Utils.readFile(domainModelPath);
                } catch (Exception e) {
                    errors.add("Failed to read domain model for system '" + system + "' at " + domainModelPath
                            + ": " + e.getMessage());
                    continue;
                }

                // Initialize counters
                LongAdder realistic = new LongAdder();
                LongAdder unrealistic = new LongAdder();
                LongAdder unknown = new LongAdder();
                realisticBySystem.put(system, realistic);
                unrealisticBySystem.put(system, unrealistic);
                unknownBySystem.put(system, unknown);

                responsesMd.append("# ").append(system).append("\n\n");

                // Flatten all gens/files into per-file work items (so we can parallelize per
                // file)
                List<WorkItem> work = new ArrayList<>();
                for (Map.Entry<String, List<String>> entry : genMap.entrySet()) {
                    String gen = entry.getKey();
                    List<String> soilFiles = entry.getValue();
                    if (soilFiles == null || soilFiles.isEmpty()) {
                        continue;
                    }

                    for (String filePath : soilFiles) {
                        work.add(JudgeUtils.toWorkItem(system, gen, filePath, includeCategoryInResponses));
                    }
                }

                // Judge *each soil file* in parallel
                ConcurrentLinkedQueue<Section> sections = new ConcurrentLinkedQueue<>();
                ThreadLocal<IJudge> judgeByThread = ThreadLocal.withInitial(() -> Llms.getAgent(IJudge.class, MODEL));
                work.parallelStream().forEach(item -> {
                    try {
                        String instance = Utils.readFile(item.filePath());
                        String response = judgeByThread.get().chat(domainModel, instance);

                        String label = JudgeUtils.extractResponseLabelOrThrow(response, item.context());
                        if ("Realistic".equalsIgnoreCase(label)) {
                            realistic.increment();
                        } else if ("Unrealistic".equalsIgnoreCase(label)) {
                            unrealistic.increment();
                        } else if ("Unknown".equalsIgnoreCase(label)) {
                            unknown.increment();
                        }

                        StringBuilder md = new StringBuilder();
                        md.append("## ").append(item.sectionName()).append("\n\n");
                        md.append(response).append("\n\n");
                        sections.add(new Section(item.sortKey(), md.toString()));

                        System.out.println("Judged: " + item.system() + "/" + item.gen() + "/" + item.filePath());

                    } catch (Exception e) {
                        String msg = "Error judging " + item.system() + "/" + item.gen() + " (" + item.filePath()
                                + "): "
                                + e.getClass().getSimpleName() + " - " + e.getMessage();
                        errors.add(msg);

                        StringBuilder md = new StringBuilder();
                        md.append("## ").append(item.sectionName()).append("\n\n");
                        md.append("**ERROR**: ").append(msg).append("\n\n");
                        sections.add(new Section(item.sortKey(), md.toString()));
                    }
                });

                // Append this system's sections in a stable order (gen/category)
                List<Section> ordered = new ArrayList<>(sections);
                ordered.sort((a, b) -> a.sortKey().compareToIgnoreCase(b.sortKey()));
                for (Section s : ordered) {
                    responsesMd.append(s.markdown());
                }
            }

            // Build results table by system (even if partial)
            List<String> systems = new ArrayList<>(realisticBySystem.keySet());
            Collections.sort(systems);

            Table resultsTable = JudgeUtils.buildSystemResultsTable(modeTitle + " / " + MODEL.name(), systems,
                    realisticBySystem, unrealisticBySystem, unknownBySystem);

            resultsMd.append("# ")
                    .append(modeTitle)
                    .append(" / ")
                    .append(dataset)
                    .append(" / ")
                    .append(MODEL.name())
                    .append("\n\n");
            resultsMd.append(resultsTable.toMarkdown()).append("\n");

        } finally {
            // Always attempt to save whatever we have.
            // If outDir couldn't be derived, fall back to a deterministic location.
            String safeOutDir = JudgeUtils.computeSafeOutDir(outDir, dataset, modeTitle, MODEL.name());

            Utils.saveFile(responsesMd.toString(), safeOutDir, "judge-responses.md", false);

            if (resultsMd.length() > 0) {
                Utils.saveFile(resultsMd.toString(), safeOutDir, "judge-results.md", false);
            } else {
                Utils.saveFile(
                        "# " + modeTitle + " / " + MODEL.name()
                                + "\n\n(No results generated; run may have failed early.)\n",
                        safeOutDir, "judge-results.md", false);
            }

            // Save logs even on failure
            Logger.save(safeOutDir, "judge-logs.md", false);

            if (!errors.isEmpty()) {
                StringBuilder errMd = new StringBuilder();
                JudgeUtils.appendErrorsMarkdown(errMd, errors);
                Utils.saveFile(errMd.toString(), safeOutDir, "judge-errors.md", false);
            }
        }
    }

    private static void judgeSimple(String dataset) {
        judgeBySystem("Simple", dataset, Utils.getPaths("Simple", dataset), false);
    }

    private static void judgeCoT(String dataset) {
        judgeBySystem("CoT", dataset, Utils.getPaths("CoT", dataset), true);
    }

    public static void judge(String dataset) {
        judgeSimple(dataset);
        judgeCoT(dataset);
    }

    // Main method for testing
    public static void main(String[] args) {
        judge("GPT5-exp1");
    }
}

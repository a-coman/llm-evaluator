package es.uma.LlmAsAJudge;

import es.uma.Table;
import es.uma.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LlmAsAJudge {

    private static final Model MODEL = Model.QWEN_4B;

    private static final Pattern RESPONSE_PATTERN = Pattern
            .compile("(?im)^\\*\\*Response\\*\\*:\\s*(Realistic|Unrealistic)\\b");

    private static String extractResponseLabelOrThrow(String response, String context) {
        Matcher m = RESPONSE_PATTERN.matcher(response == null ? "" : response);
        if (!m.find()) {
            throw new IllegalArgumentException("Missing '**Response**: Realistic|Unrealistic' for " + context);
        }
        return m.group(1);
    }

    private static String deriveOutDirFromAnyPath(String anySoilPath, int parentLevelsUp) {
        File dir = new File(anySoilPath);
        for (int i = 0; i < parentLevelsUp; i++) {
            dir = dir.getParentFile();
            if (dir == null) {
                throw new IllegalArgumentException(
                        "Cannot derive output directory from path: " + anySoilPath + " (levels=" + parentLevelsUp
                                + ")");
            }
        }
        return dir.getPath() + "/";
    }

    private static Table buildSystemResultsTable(String title, List<String> systems,
            Map<String, LongAdder> realisticBySystem,
            Map<String, LongAdder> unrealisticBySystem) {

        String[] rowsHeader = new String[systems.size() + 1];
        String[] columnsHeader = { "Realistic", "Unrealistic", "Success Rate" };
        float[][] tableData = new float[systems.size() + 1][3];

        float totalRealistic = 0.0f;
        float totalUnrealistic = 0.0f;

        for (int i = 0; i < systems.size(); i++) {
            String system = systems.get(i);

            LongAdder r = realisticBySystem.get(system);
            LongAdder u = unrealisticBySystem.get(system);

            float realistic = r == null ? 0.0f : r.floatValue();
            float unrealistic = u == null ? 0.0f : u.floatValue();
            float total = realistic + unrealistic;

            rowsHeader[i] = system;
            tableData[i][0] = realistic;
            tableData[i][1] = unrealistic;
            tableData[i][2] = total == 0.0f ? 0.0f : (100.0f * (realistic / total));

            totalRealistic += realistic;
            totalUnrealistic += unrealistic;
        }

        int totalRow = systems.size();
        rowsHeader[totalRow] = "Total";
        tableData[totalRow][0] = totalRealistic;
        tableData[totalRow][1] = totalUnrealistic;
        float grandTotal = totalRealistic + totalUnrealistic;
        tableData[totalRow][2] = grandTotal == 0.0f ? 0.0f : (100.0f * (totalRealistic / grandTotal));

        return new Table(title, rowsHeader, columnsHeader, tableData);
    }

    private static void judgeBySystem(String modeTitle, String dataset,
            Map<String, Map<String, List<String>>> paths,
            boolean includeCategoryInResponses) {

        if (paths == null || paths.isEmpty()) {
            return;
        }

        String outDir = null;
        StringBuffer responsesMd = new StringBuffer();
        StringBuffer resultsMd = new StringBuffer();

        // Counts per system
        Map<String, LongAdder> realisticBySystem = new ConcurrentHashMap<>();
        Map<String, LongAdder> unrealisticBySystem = new ConcurrentHashMap<>();

        // Collect non-fatal errors instead of throwing from worker threads
        ConcurrentLinkedQueue<String> errors = new ConcurrentLinkedQueue<>();

        try {
            // Derive output directory from any .soil path.
            String firstPath = paths.values().iterator().next().values().iterator().next().get(0);
            outDir = deriveOutDirFromAnyPath(firstPath, 3);

            // Responses markdown: contains all systems
            responsesMd.append("# ").append(modeTitle).append(" / ").append(MODEL.name()).append("\n\n");

            for (String system : paths.keySet()) {
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
                realisticBySystem.put(system, realistic);
                unrealisticBySystem.put(system, unrealistic);

                responsesMd.append("# ").append(system).append("\n\n");

                genMap.entrySet().stream().parallel().forEach(entry -> {
                    String gen = entry.getKey();
                    List<String> soilFiles = entry.getValue();
                    if (soilFiles == null || soilFiles.isEmpty()) {
                        return;
                    }

                    // Build a whole block locally, then append once (prevents interleaving)
                    StringBuilder localBlock = new StringBuilder();

                    for (String filePath : soilFiles) {
                        try {
                            String instance = Utils.readFile(filePath);
                            IJudge judge = Llms.getAgent(IJudge.class, MODEL);
                            String response = judge.chat(domainModel, instance);

                            String label;
                            String sectionName;
                            if (includeCategoryInResponses) {
                                String category = new File(filePath).getName().replaceFirst("(?i)\\.soil$", "");
                                label = extractResponseLabelOrThrow(response, system + "/" + gen + "/" + category);
                                sectionName = gen + " / " + category;
                            } else {
                                label = extractResponseLabelOrThrow(response, system + "/" + gen);
                                sectionName = gen;
                            }

                            if ("Realistic".equalsIgnoreCase(label)) {
                                realistic.increment();
                            } else {
                                unrealistic.increment();
                            }

                            localBlock.append("## ").append(sectionName).append("\n\n");
                            localBlock.append(response).append("\n\n");

                            System.out.println("Judged: " + system + "/" + gen + "/" + filePath);

                        } catch (Exception e) {
                            String msg = "Error judging " + system + "/" + gen + " (" + filePath + "): "
                                    + e.getClass().getSimpleName() + " - " + e.getMessage();
                            errors.add(msg);

                            localBlock.append("## ").append(gen);
                            if (includeCategoryInResponses) {
                                String category = new File(filePath).getName().replaceFirst("(?i)\\.soil$", "");
                                localBlock.append(" / ").append(category);
                            }
                            localBlock.append("\n\n");
                            localBlock.append("**ERROR**: ").append(msg).append("\n\n");
                        }
                    }

                    
                    responsesMd.append(localBlock);
                });
            }

            // Build results table by system (even if partial)
            List<String> systems = new ArrayList<>(realisticBySystem.keySet());
            Collections.sort(systems);

            Table resultsTable = buildSystemResultsTable(modeTitle + " / " + MODEL.name(), systems,
                    realisticBySystem, unrealisticBySystem);

            resultsMd.append("# ").append(modeTitle).append(" / ").append(MODEL.name()).append("\n\n");
            resultsMd.append(resultsTable.toMarkdown()).append("\n");

            if (!errors.isEmpty()) {
                responsesMd.append("\n# Errors\n\n");
                for (String err : errors) {
                    responsesMd.append("- ").append(err).append("\n");
                }
                responsesMd.append("\n");
            }

        } finally {
            // Always attempt to save whatever we have.
            // If outDir couldn't be derived, fall back to a deterministic location.
            String safeOutDir = (outDir != null) ? outDir : ("./judge-output/" + modeTitle + "/" + MODEL.name() + "/");

            Utils.saveFile(responsesMd.toString(), safeOutDir, "judge-responses.md", false);

            // Save results if we managed to build any; otherwise save an error stub so the
            // run is visible.
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
        }
    }

    public static void testPrompts() {

        final Map<String, String> PREFIX_TO_DOMAIN = new HashMap<>();

        PREFIX_TO_DOMAIN.put("s", "statemachine");
        PREFIX_TO_DOMAIN.put("b", "bank");
        PREFIX_TO_DOMAIN.put("p", "pickupnet");
        PREFIX_TO_DOMAIN.put("h", "hotelmanagement");

        final String OUTPUT_PATH = "src/main/java/es/uma/LlmAsAJudge/PromptTestInstances/Outputs/" + Utils.getTime()
                + "/";
        final String INSTANCES_PATH = "src/main/java/es/uma/LlmAsAJudge/PromptTestInstances/Instances/";
        final String PROMPTS_PATH = "src/main/resources/prompts/";

        ConcurrentLinkedQueue<String> errors = new ConcurrentLinkedQueue<>();

        // Clear the responses file first
        Utils.saveFile("", OUTPUT_PATH, "responses-" + MODEL.name() + ".md", false);

        try {
            File instancesDir = new File(INSTANCES_PATH);
            File[] soilFiles = Utils.getAllSoilFiles(instancesDir);

            if (soilFiles == null || soilFiles.length == 0) {
                throw new RuntimeException("No .soil files found in the Instances directory or its subdirectories.");
            }

            Arrays.stream(soilFiles).parallel().forEach(soilFile -> {
                try {
                    IJudge judge = Llms.getAgent(IJudge.class, MODEL);

                    String fileName = soilFile.getName();
                    String prefix = fileName.substring(0, 1);
                    String domainName = PREFIX_TO_DOMAIN.get(prefix);

                    if (domainName == null) {
                        // Don't throw: record error and continue
                        errors.add("Unknown prefix for file: " + fileName);
                        return;
                    }

                    String domainModelPath = PROMPTS_PATH + domainName + "/diagram.use";
                    String domainModel = Utils.readFile(domainModelPath);
                    String objectModelWithComments = Utils.readFile(soilFile.getPath());
                    String objectModel = Utils.removeComments(objectModelWithComments);

                    String response = judge.chat(domainModel, objectModel);

                    // Append to responses.md with title
                    String content = "# " + fileName + "\n\n" + response + "\n\n";
                    synchronized (LlmAsAJudge.class) {
                        Utils.saveFile(content, OUTPUT_PATH, "responses-" + MODEL.name() + ".md", true);
                    }

                    System.out.println("Processed: " + fileName + " with domain: " + domainName);

                } catch (Exception e) {
                    errors.add("Failed processing " + soilFile.getName() + ": " + e.getClass().getSimpleName()
                            + " - " + e.getMessage());
                }
            });

            // Create results table (guarded so we still save logs/errors if parsing fails)
            try {
                String title = MODEL.name();
                String[] rowsHeader = { "Realistic", "Unrealistic", "Success Rate" };
                String[] columnsHeader = { "Real", "Synthetic", "Simple", "CoT" };
                float[][] tableData = getResults(Utils.readFile(OUTPUT_PATH + "responses-" + MODEL.name() + ".md"));
                Table resultsTable = new Table(title, rowsHeader, columnsHeader, tableData);

                Utils.saveFile(resultsTable.toString(), OUTPUT_PATH, "results-" + MODEL.name() + ".md", false);
            } catch (Exception e) {
                errors.add("Failed generating results table: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }

        } finally {
            if (!errors.isEmpty()) {
                StringBuilder errMd = new StringBuilder();
                errMd.append("# Errors\n\n");
                for (String err : errors) {
                    errMd.append("- ").append(err).append("\n");
                }
                errMd.append("\n");

                // Save alongside outputs so you can see what got skipped/failed
                Utils.saveFile(errMd.toString(), OUTPUT_PATH, "errors-" + MODEL.name() + ".md", false);
            }

            // Save logs even if anything failed above
            Logger.save(OUTPUT_PATH, "logs-" + MODEL.name() + ".md", false);
        }
    }

    private static float[][] getResults(String responses) {
        float[][] results = new float[3][4]; // rows: [0]=Realistic, [1]=Unrealistic, [2]=SuccessRate;
                                             // cols: [0]=Real, [1]=Synthetic, [2]=Simple, 3=CoT

        // Column indices map: 0=Real, 1=Synthetic, 2=Simple, 3=CoT
        Map<String, Integer> idToColumn = new HashMap<>();

        // Real = s1, s4, p3, p7, b2, b7, h1, h5
        for (String id : new String[] { "s1", "s4", "p3", "p7", "b2", "b7", "h1", "h5" })
            idToColumn.put(id, 0);
        // Synthetic = s0, s7, p0, p2, b4, b6, h4, h6
        for (String id : new String[] { "s0", "s7", "p0", "p2", "b4", "b6", "h4", "h6" })
            idToColumn.put(id, 1);
        // Simple = s3, s5, p1, p5, b0, b3, h0, h2
        for (String id : new String[] { "s3", "s5", "p1", "p5", "b0", "b3", "h0", "h2" })
            idToColumn.put(id, 2);
        // CoT = s2, s6, p4, p6, b1, b5, h3, h7
        for (String id : new String[] { "s2", "s6", "p4", "p6", "b1", "b5", "h3", "h7" })
            idToColumn.put(id, 3);

        Pattern headerPattern = Pattern.compile("(?m)^#\\s+([^\\r\\n]+)\\s*$");
        Pattern responsePattern = Pattern.compile("(?im)^\\*\\*Response\\*\\*:\\s*(Realistic|Unrealistic)\\b");

        Matcher headerMatcher = headerPattern.matcher(responses);

        List<Integer> headerStarts = new ArrayList<>();
        List<Integer> headerEnds = new ArrayList<>();
        List<String> headerNames = new ArrayList<>();

        while (headerMatcher.find()) {
            headerStarts.add(headerMatcher.start());
            headerEnds.add(headerMatcher.end());
            headerNames.add(headerMatcher.group(1).trim());
        }

        for (int i = 0; i < headerNames.size(); i++) {
            int blockStart = headerEnds.get(i);
            int blockEnd = (i + 1 < headerStarts.size()) ? headerStarts.get(i + 1) : responses.length();
            String name = headerNames.get(i);

            // Normalize "p3.soil" -> "p3"
            String id = name.trim().replaceFirst("(?i)\\.soil\\s*$", "");

            Integer col = idToColumn.get(id);
            if (col == null) {
                throw new IllegalArgumentException("Unknown instance id '" + id + "' (from header '" + name + "').");
            }

            String block = responses.substring(blockStart, blockEnd);
            Matcher respMatcher = responsePattern.matcher(block);
            if (!respMatcher.find()) {
                throw new IllegalArgumentException("Missing **Response** line for '" + name + "'.");
            }

            String label = respMatcher.group(1);
            if ("Realistic".equalsIgnoreCase(label)) {
                results[0][col] += 1.0f;
            } else {
                results[1][col] += 1.0f;
            }
        }

        // Success rate:
        // - Real column: Realistic / (Realistic + Unrealistic)
        // - Synthetic column: Unrealistic / (Realistic + Unrealistic)
        // - Simple column: Realistic / (Realistic + Unrealistic)
        // - CoT column: Realistic / (Realistic + Unrealistic)
        for (int c = 0; c < 4; c++) {
            float realistic = results[0][c];
            float unrealistic = results[1][c];
            float total = realistic + unrealistic;

            if (total == 0.0f) {
                results[2][c] = 0.0f;
                continue;
            }

            float numerator = (c == 1) ? unrealistic : realistic; // Synthetic col = 1
            results[2][c] = 100.0f * (numerator / total);
        }

        return results;
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

package es.uma.LlmAsAJudge;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.uma.Table;
import es.uma.Utils;
import es.uma.LlmAsAJudge.JudgeUtils.Section;

public class TestIJudgePrompts {

    private static final Model MODEL = Model.QWEN_4B;

    private static float[][] getResults(String responses) {
        float[][] results = new float[4][4]; // rows: [0]=Realistic, [1]=Unrealistic, [2]=Unknown, [3]=SuccessRate;
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
        Pattern responsePattern = Pattern.compile("(?im)^\\*\\*Response\\*\\*:\\s*(Realistic|Unrealistic|Unknown)\\b");

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
            } else if ("Unrealistic".equalsIgnoreCase(label)) {
                results[1][col] += 1.0f;
            } else {
                results[2][col] += 1.0f;
            }
        }

        // Success rate:
        // - Real column: Realistic / (Realistic + Unrealistic + Unknown)
        // - Synthetic column: Unrealistic / (Realistic + Unrealistic + Unknown)
        // - Simple column: Realistic / (Realistic + Unrealistic + Unknown)
        // - CoT column: Realistic / (Realistic + Unrealistic + Unknown)
        for (int c = 0; c < 4; c++) {
            float realistic = results[0][c];
            float unrealistic = results[1][c];
            float unknown = results[2][c];
            float total = realistic + unrealistic + unknown;

            if (total == 0.0f) {
                results[3][c] = 0.0f;
                continue;
            }

            float numerator = (c == 1) ? unrealistic : realistic; // Synthetic col = 1
            results[3][c] = 100.0f * (numerator / total);
        }

        return results;
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


        try {
            File instancesDir = new File(INSTANCES_PATH);
            File[] soilFiles = Utils.getAllSoilFiles(instancesDir);

            if (soilFiles == null || soilFiles.length == 0) {
                throw new RuntimeException("No .soil files found in the Instances directory or its subdirectories.");
            }

            ConcurrentLinkedQueue<Section> sections = new ConcurrentLinkedQueue<>();

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

                    // Collect response; we will sort and write once
                    String content = "# " + fileName + "\n\n" + response + "\n\n";
                    sections.add(new Section(fileName.toLowerCase(), content));

                    System.out.println("Processed: " + fileName + " with domain: " + domainName);

                } catch (Exception e) {
                    errors.add("Failed processing " + soilFile.getName() + ": " + e.getClass().getSimpleName()
                            + " - " + e.getMessage());
                }
            });

            // Write responses in a stable order
            List<Section> ordered = new ArrayList<>(sections);
            ordered.sort((a, b) -> a.sortKey().compareToIgnoreCase(b.sortKey()));
            StringBuilder allResponses = new StringBuilder();
            for (Section s : ordered) {
                allResponses.append(s.markdown());
            }
            Utils.saveFile(allResponses.toString(), OUTPUT_PATH, "responses-" + MODEL.name() + ".md", false);

            // Create results table (guarded so we still save logs/errors if parsing fails)
            try {
                String title = MODEL.name();
                String[] rowsHeader = { "Realistic", "Unrealistic", "Unknown", "Success Rate" };
                String[] columnsHeader = { "Real", "Synthetic", "Simple", "CoT" };
                float[][] tableData = getResults(Utils.readFile(OUTPUT_PATH + "responses-" + MODEL.name() + ".md"));
                Table resultsTable = new Table(title, rowsHeader, columnsHeader, tableData);

                Utils.saveFile(resultsTable.toMarkdown(), OUTPUT_PATH, "results-" + MODEL.name() + ".md", false);
            } catch (Exception e) {
                errors.add("Failed generating results table: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }

        } finally {
            if (!errors.isEmpty()) {
                StringBuilder errMd = new StringBuilder();
                JudgeUtils.appendErrorsMarkdown(errMd, errors);

                // Save alongside outputs so you can see what got skipped/failed
                Utils.saveFile(errMd.toString(), OUTPUT_PATH, "judge-errors.md", false);
            }

            // Save logs even if anything failed above
            Logger.save(OUTPUT_PATH, "logs-" + MODEL.name() + ".md", false);
        }
    }

    public static void main(String[] args) {
        testPrompts();
    }
}

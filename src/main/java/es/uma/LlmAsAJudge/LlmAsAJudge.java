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

public class LlmAsAJudge {

    public static void testPrompts() {

        final Model MODEL = Model.GEMINI_3_PRO;

        final Map<String, String> PREFIX_TO_DOMAIN = new HashMap<>();

        PREFIX_TO_DOMAIN.put("s", "statemachine");
        PREFIX_TO_DOMAIN.put("b", "bank");
        PREFIX_TO_DOMAIN.put("p", "pickupnet");
        PREFIX_TO_DOMAIN.put("h", "hotelmanagement");

        final String OUTPUT_PATH = "src/main/java/es/uma/LlmAsAJudge/PromptTestInstances/Outputs/" + Utils.getTime() + "/";
        final String INSTANCES_PATH = "src/main/java/es/uma/LlmAsAJudge/PromptTestInstances/Instances/";
        final String PROMPTS_PATH = "src/main/resources/prompts/";

        // Clear the responses file first
        Utils.saveFile("", OUTPUT_PATH, "responses-" + MODEL.name() + ".md", false);

        File instancesDir = new File(INSTANCES_PATH);
        File[] soilFiles = Utils.getAllSoilFiles(instancesDir);

        if (soilFiles == null || soilFiles.length == 0) {
            throw new RuntimeException("No .soil files found in the Instances directory or its subdirectories.");
        }

        Arrays.stream(soilFiles).parallel().forEach(soilFile -> {
            IJudge judge = Llms.getAgent(IJudge.class, MODEL);

            String fileName = soilFile.getName();
            String prefix = fileName.substring(0, 1);
            String domainName = PREFIX_TO_DOMAIN.get(prefix);

            if (domainName == null) {
                throw new RuntimeException("Unknown prefix for file: " + fileName);
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

        });

        // Create results table
        String title = MODEL.name();
        String[] rowsHeader = { "Realistic", "Unrealistic", "Success Rate" };
        String[] columnsHeader = { "Real", "Synthetic", "Simple", "CoT" };
        float[][] tableData = getResults(Utils.readFile(OUTPUT_PATH + "responses-" + MODEL.name() + ".md"));
        Table resultsTable = new Table(title, rowsHeader, columnsHeader, tableData);

        Utils.saveFile(resultsTable.toString(), OUTPUT_PATH, "results-" + MODEL.name() + ".md", false);

        // Save logs
        Logger.save(OUTPUT_PATH, "logs-" + MODEL.name() + ".md", false);
    }

    private static float[][] getResults(String responses) {
        float[][] results = new float[3][4]; // rows: [0]=Realistic, [1]=Unrealistic, [2]=SuccessRate;
                                             // cols: [0]=Real, [1]=Synthetic, [2]=Simple, [3]=CoT

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

    // Main method for testing
    public static void main(String[] args) {
        // Create results table
        final Model MODEL = Model.GEMINI_3_PRO;
        final String OUTPUT_PATH = "src/main/java/es/uma/LlmAsAJudge/PromptTestInstances/Outputs/" + "09-12-2025--22-03-16" + "/";
        String title = MODEL.name();
        String[] rowsHeader = { "Realistic", "Unrealistic", "Success Rate" };
        String[] columnsHeader = { "Real", "Synthetic", "Simple", "CoT" };
        float[][] tableData = getResults(Utils.readFile(OUTPUT_PATH + "responses-" + MODEL.name() + ".md"));
        Table resultsTable = new Table(title, rowsHeader, columnsHeader, tableData);

        System.out.println(resultsTable.toMarkdown());
        System.out.println("\n\n" + MODEL.name());
    }
}

package es.uma.Similarity;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uma.Utils;

public class Similarity {

    private static Map<String, SimilarityMetrics> acrossMetricsMap = new HashMap<>(); // key: system name

    private static final String interpretationText = """
            **Table values interpretation:**

            - **NaN** indicates the absence of attributes of that type.
            - **1.0** means that the attributes are completely **different**. 
            *(If there is only one attribute, it also returns 1.0)*
            - **0.0** means the attributes are entirely **identical**.
            """;

    private static String calculateSimpleSimilarities(Map<String, Map<String, List<String>>> simplePaths) {
        StringBuilder output = new StringBuilder();
        SimilarityMetrics experimentsMetrics = new SimilarityMetrics();

        output.append("# Simple\n\n");
        output.append(interpretationText).append("\n");
        for (String system : simplePaths.keySet()) {
            acrossMetricsMap.put(system, new SimilarityMetrics());
            output.append("## " + system + "\n\n");
            Map<String, List<String>> genMap = simplePaths.get(system);
            SimilarityMetrics systemMetrics = new SimilarityMetrics();

            output.append("| Generations | Numeric | StringEquals | StringLv |\n");
            output.append("|---|---|---|---|\n");

            // Within instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                List<String> stringAttributes = Utils.getStringAttributes(instance);

                SimilarityMetrics genMetrics = new SimilarityMetrics();
                genMetrics.addNumeric(numericAttributes);
                genMetrics.addStrings(stringAttributes);
                systemMetrics.addNumeric(numericAttributes);
                systemMetrics.addStrings(stringAttributes);

                System.out.println("Calculating within " + system + "/" + gen + "...");
                SimilarityResult result = genMetrics.calculate();
                output.append(result.toMarkdownRow(gen)).append("\n");

            }
            
            // Across instances
            System.out.println("Calculating across " + system + "...");
            SimilarityResult systemResult = systemMetrics.calculate();
            output.append(systemResult.toMarkdownRow("ALL Gen")).append("\n\n");

            experimentsMetrics.addNumeric(systemMetrics.getNumericAttributes());
            experimentsMetrics.addStrings(systemMetrics.getStringAttributes());

            acrossMetricsMap.get(system).aggregate(systemMetrics);
        }

        System.out.println("Calculating across ALL Experiments...");
        SimilarityResult experimentsResult = experimentsMetrics.calculate();

        output.append("## ALL Experiments\n\n");
        output.append("| ALL Experiments | Numeric | StringEquals | StringLv |\n");
        output.append("|---|---|---|---|\n");
        output.append(experimentsResult.toMarkdownRow("ALL Systems")).append("\n\n");

        return output.toString().trim();
    }

    private static String calculateCoTSimilarities(Map<String, Map<String, List<String>>> cotPaths) {
        StringBuilder output = new StringBuilder();
        SimilarityMetrics experimentsMetrics = new SimilarityMetrics();

        output.append("# CoT\n\n");
        output.append(interpretationText).append("\n");
        
        for (String system : cotPaths.keySet()) {
            Map<String, List<String>> genMap = cotPaths.get(system);
            SimilarityMetrics systemMetrics = new SimilarityMetrics();

            output.append("## " + system + "\n\n");

            // Generation
            for (String gen : genMap.keySet()) {
                List<String> categoryFiles = genMap.get(gen);
                SimilarityMetrics genMetrics = new SimilarityMetrics();
                
                output.append("| " + gen + " | Numeric | StringEquals | StringLv |\n");
                output.append("|---|---|---|---|\n");

                // Category
                for (String filePath : categoryFiles) {
                    String instance = Utils.readFile(filePath);
                    String category = new File(filePath).getName().replace(".soil", "");

                    List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                    List<String> stringAttributes = Utils.getStringAttributes(instance);

                    SimilarityMetrics categoryMetrics = new SimilarityMetrics();
                    categoryMetrics.addNumeric(numericAttributes);
                    categoryMetrics.addStrings(stringAttributes);
                    genMetrics.addNumeric(numericAttributes);
                    genMetrics.addStrings(stringAttributes);
                    systemMetrics.addNumeric(numericAttributes);
                    systemMetrics.addStrings(stringAttributes);
                    experimentsMetrics.addNumeric(numericAttributes);
                    experimentsMetrics.addStrings(stringAttributes);

                    System.out.println("Calculating within " + system + "/" + gen + "/" + category + "...");
                    SimilarityResult categoryResult = categoryMetrics.calculate();
                    output.append(categoryResult.toMarkdownRow(category)).append("\n");

                }

                // Calculate within-generation similarities
                System.out.println("Calculating across " + system + "/" + gen + "...");
                SimilarityResult genResult = genMetrics.calculate();
                output.append(genResult.toMarkdownRow("ALL Categories")).append("\n\n");

                systemMetrics.addNumeric(genMetrics.getNumericAttributes());
                systemMetrics.addStrings(genMetrics.getStringAttributes());
                experimentsMetrics.addNumeric(genMetrics.getNumericAttributes());
                experimentsMetrics.addStrings(genMetrics.getStringAttributes());
            }

            System.out.println("Calculating across " + system + "...");
            SimilarityResult systemResult = systemMetrics.calculate();

            output.append("| ALL Generations | Numeric | StringEquals | StringLv |\n");
            output.append("|---|---|---|---|\n");
            output.append(systemResult.toMarkdownRow("ALL Generations")).append("\n\n");

            experimentsMetrics.addNumeric(systemMetrics.getNumericAttributes());
            experimentsMetrics.addStrings(systemMetrics.getStringAttributes());

            acrossMetricsMap.get(system).aggregate(systemMetrics);
        }

        // System.out.println("Calculating across ALL Systems...");
        // SimilarityResult experimentsResult = experimentsMetrics.calculate();

        // output.append("## ALL Experments\n\n");
        // output.append("| ALL Systems | Numeric | StringEquals | StringLv |\n");
        // output.append("|---|---|---|---|\n");
        // output.append(experimentsResult.toMarkdownRow("ALL Systems"));

        return output.toString().trim();
    }

    private static String calculateCombined() {
        StringBuilder output = new StringBuilder();

        // Across systems
        output.append("# Across Systems\n");
        output.append(interpretationText).append("\n");
        for (String system : acrossMetricsMap.keySet()) {
            SimilarityMetrics systemMetrics = acrossMetricsMap.get(system);
            output.append("## " + system + "\n");
            output.append("|  Across Systems | Numeric | StringEquals | StringLv |\n");
            output.append("|---|---|---|---|\n");
            output.append(systemMetrics.calculate().toMarkdownRow("ALL Generations")).append("\n");
        }

        return output.toString().trim();
    }

    public static void calculateSimilarities() {
        
        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT");
        System.out.println("SimplePaths:\n" + simplePaths + "\n\n");
        System.out.println("CoTPaths:\n" + cotPaths + "\n\n");
        
        String simpleoutput = calculateSimpleSimilarities(simplePaths);
        Utils.saveFile(simpleoutput, "./src/main/java/es/uma/Similarity/", "simpleDifference.md", false);
        
        String cotoutput = calculateCoTSimilarities(cotPaths);
        Utils.saveFile(cotoutput, "./src/main/java/es/uma/Similarity/", "cotDifference.md", false);

        String combinedOutput = calculateCombined();
        Utils.saveFile(combinedOutput, "./src/main/java/es/uma/Similarity/", "combinedDifference.md", false);
    }
}
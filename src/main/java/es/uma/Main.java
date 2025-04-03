package es.uma;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    private static Map<String, SimilarityMetrics> acrossMetricsMap = new HashMap<>(); // key: system name

    private static final String interpretationText = """
            **Table values interpretation:**

            - **NaN** indicates the absence of attributes of that type.
            - **1.0** means that the attributes are completely **different**. 
            *(If there is only one attribute, it also returns 1.0)*
            - **0.0** means the attributes are entirely **identical**.
            """;

    private Map<String, Map<String, List<String>>> getPaths(String type) {
        Map<String, Map<String, List<String>>> simplePaths = new HashMap<>();
        Map<String, Map<String, List<String>>> cotPaths = new HashMap<>();
        String datasetRoot = "./src/main/resources/dataset";
        File rootDir = new File(datasetRoot);
        for (File categoryDir : rootDir.listFiles()) {
            if (categoryDir.isDirectory()) {
                if (categoryDir.getName().equals("Simple")) {
                    processSimpleDirectory(categoryDir, simplePaths);
                } else if (categoryDir.getName().equals("CoT")) {
                    processCotDirectory(categoryDir, cotPaths);
                }
            }
        }

        switch (type) {
            case "Simple":
                return simplePaths;
            case "CoT":
                return cotPaths;
            default:
                throw new RuntimeException("Invalid type: " + type);
        }
    }

    private void processSimpleDirectory(File simpleDir, Map<String, Map<String, List<String>>> simplePaths) {
        for (File systemDir : simpleDir.listFiles()) {
            if (systemDir.isDirectory()) {
                for (File timestampDir : systemDir.listFiles()) {
                    if (timestampDir.isDirectory()) {
                        String systemKey = systemDir.getName();
                        Map<String, List<String>> genMap = new TreeMap<>(new GenComparator());
                        for (File genDir : timestampDir.listFiles()) {
                            if (genDir.isDirectory() && genDir.getName().startsWith("gen")) {
                                File outputFile = new File(genDir, "output.soil");
                                if (outputFile.exists()) {
                                    genMap.put(genDir.getName(), Collections.singletonList(outputFile.getAbsolutePath()));
                                }
                            }
                        }
                        simplePaths.put(systemKey, genMap);
                    }
                }
            }
        }
    }

    private void processCotDirectory(File cotDir, Map<String, Map<String, List<String>>> cotPaths) {
        for (File systemDir : cotDir.listFiles()) {
            if (systemDir.isDirectory()) {
                for (File timestampDir : systemDir.listFiles()) {
                    if (timestampDir.isDirectory()) {
                        String systemKey = systemDir.getName();
                        Map<String, List<String>> genMap = new TreeMap<>(new GenComparator());
                        for (File genDir : timestampDir.listFiles()) {
                            if (genDir.isDirectory() && genDir.getName().startsWith("gen")) {
                                List<String> categoryFiles = new ArrayList<>();
                                for (File file : genDir.listFiles()) {
                                    if (file.getName().endsWith(".soil") && !file.getName().contains("output") && !file.getName().contains("temp")) {
                                        categoryFiles.add(file.getAbsolutePath());
                                    }
                                }
                                genMap.put(genDir.getName(), categoryFiles);
                            }
                        }
                        cotPaths.put(systemKey, genMap);
                    }
                }
            }
        }
    }

    // Custom Comparator for numerical ordering of "genX" strings
    private static class GenComparator implements Comparator<String> {
        @Override
        public int compare(String gen1, String gen2) {
            // Extract numeric part after "gen"
            int num1 = Integer.parseInt(gen1.replace("gen", ""));
            int num2 = Integer.parseInt(gen2.replace("gen", ""));
            return Integer.compare(num1, num2);
        }
    }

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

    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> simplePaths = new Main().getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = new Main().getPaths("CoT");
        System.out.println("SimplePaths:\n" + simplePaths + "\n\n");
        System.out.println("CoTPaths:\n" + cotPaths + "\n\n");
        
        String simpleoutput = calculateSimpleSimilarities(simplePaths);
        Utils.saveFile(simpleoutput, "./", "simpleDifference.md", false);
        
        String cotoutput = calculateCoTSimilarities(cotPaths);
        Utils.saveFile(cotoutput, "./", "cotDifference.md", false);

        String combinedOutput = calculateCombined();
        Utils.saveFile(combinedOutput, "./", "combinedDifference.md", false);
    }
}
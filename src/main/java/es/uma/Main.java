package es.uma;

import java.io.File;
import java.util.*;

public class Main {

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
                        String systemKey = systemDir.getName() + "/" + timestampDir.getName();
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
                        String systemKey = systemDir.getName() + "/" + timestampDir.getName();
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
        StringBuffer output = new StringBuffer();
        List<Double> experimentsNumericAttributes = new ArrayList<>();
        List<String> experimentsStringAttributes = new ArrayList<>();

        for (String system : simplePaths.keySet()) {
            Map<String, List<String>> genMap = simplePaths.get(system);
            List<Double> systemNumericAttributes = new ArrayList<>();
            List<String> systemStringAttributes = new ArrayList<>();

            String systemName = system.substring(0, system.indexOf("/"));
            output.append("| " + systemName + " | Numeric | StringEquals | StringLv |\n");
            output.append("|---|---|---|---|\n");

            // Within instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                List<String> stringAttributes = Utils.getStringAttributes(instance);
                systemNumericAttributes.addAll(numericAttributes);
                systemStringAttributes.addAll(stringAttributes);
                System.out.println("Calculating within " + system + "/" + gen + "...");
                double numericSimilarity = Similarity.calculateNumeric(numericAttributes);
                double stringEqualsSimilarity = Similarity.calculateStringEquals(stringAttributes);
                double stringLvSimilarity = Similarity.calculateStringLv(stringAttributes);

                output.append(String.format("| %s | %.4f | %.4f | %.4f |\n", 
                    gen, numericSimilarity, stringEqualsSimilarity, stringLvSimilarity));
            }

            // Across instances
            System.out.println("Calculating across " + system + "...");
            double systemNumericSimilarity = Similarity.calculateNumeric(systemNumericAttributes);
            double systemStringEqualSimilarity = Similarity.calculateStringEquals(systemStringAttributes);
            double systemStringLvSimilarity = Similarity.calculateStringLv(systemStringAttributes);

            output.append(String.format("| ALL Gen | %.4f | %.4f | %.4f |\n\n", 
                systemNumericSimilarity, systemStringEqualSimilarity, systemStringLvSimilarity));
            
            experimentsNumericAttributes.addAll(systemNumericAttributes);
            experimentsStringAttributes.addAll(systemStringAttributes);
        }

        System.out.println("Calculating across ALL Experiments...");
        double experimentsNumericSimilarity = Similarity.calculateNumeric(experimentsNumericAttributes);
        double experimentsStringEqualSimilarity = Similarity.calculateStringEquals(experimentsStringAttributes);
        double experimentsStringLvSimilarity = Similarity.calculateStringLv(experimentsStringAttributes);

        output.append("| ALL Experiments | Numeric | StringEquals | StringLv |\n");
        output.append("|---|---|---|---|\n");
        output.append(String.format("| ALL Systems | %.4f | %.4f | %.4f |\n\n", 
            experimentsNumericSimilarity, experimentsStringEqualSimilarity, experimentsStringLvSimilarity));
        
        return output.toString().trim();
    }

    
    private static String calculateCoTSimilarities(Map<String, Map<String, List<String>>> cotPaths) {
        StringBuffer output = new StringBuffer();
        List<Double> experimentsNumericAttributes = new ArrayList<>();
        List<String> experimentsStringAttributes = new ArrayList<>();

        output.append("# System\n\n"); 
        // System
        for (String system : cotPaths.keySet()) {
            Map<String, List<String>> genMap = cotPaths.get(system);
            List<Double> systemNumericAttributes = new ArrayList<>();
            List<String> systemStringAttributes = new ArrayList<>();

            String systemName = system.substring(0, system.indexOf("/"));
            output.append("## " + systemName + "\n\n");

            // Generation
            for (String gen : genMap.keySet()) {
                List<String> categoryFiles = genMap.get(gen);
                List<Double> genNumericAttributes = new ArrayList<>();
                List<String> genStringAttributes = new ArrayList<>();
                output.append("| " + gen + " | Numeric | StringEquals  | StringLv  |\n");
                output.append("|---|---|---|---|\n");

                // Category
                for (String filePath : categoryFiles) {
                    String instance = Utils.readFile(filePath);
                    String category = new File(filePath).getName().replace(".soil", "");

                    List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                    List<String> stringAttributes = Utils.getStringAttributes(instance);
                    
                    System.out.println("Calculating within " + system + "/" + gen + "/" + category + "...");
                    double numericSimilarity = Similarity.calculateNumeric(numericAttributes);
                    double stringEqualsSimilarity = Similarity.calculateStringEquals(stringAttributes);
                    double stringLvSimilarity = Similarity.calculateStringLv(stringAttributes);
                    
                    output.append(String.format("| %s | %.4f | %.4f | %.4f |\n", 
                        category, numericSimilarity, stringEqualsSimilarity, stringLvSimilarity));
                    
                    genNumericAttributes.addAll(numericAttributes);
                    genStringAttributes.addAll(stringAttributes);
                    systemNumericAttributes.addAll(numericAttributes);
                    systemStringAttributes.addAll(stringAttributes);
                    experimentsNumericAttributes.addAll(numericAttributes);
                    experimentsStringAttributes.addAll(stringAttributes);
                }

                // Calculate within-generation similarities
                System.out.println("Calculating across " + system + "/" + gen + "...");
                double genNumericSimilarity = Similarity.calculateNumeric(genNumericAttributes);
                double genStringEqualSimilarity = Similarity.calculateStringEquals(genStringAttributes);
                double genStringLvSimilarity = Similarity.calculateStringLv(genStringAttributes);

                systemNumericAttributes.addAll(genNumericAttributes);
                systemStringAttributes.addAll(genStringAttributes);
                experimentsNumericAttributes.addAll(genNumericAttributes);
                experimentsStringAttributes.addAll(genStringAttributes);

                output.append(String.format("| ALL Categories | %.4f | %.4f | %.4f |\n\n", 
                    genNumericSimilarity, genStringEqualSimilarity, genStringLvSimilarity));
            }

            System.out.println("Calculating across " + system + "...");
            double systemNumericSimilarity = Similarity.calculateNumeric(systemNumericAttributes);
            double systemStringSimilarity = Similarity.calculateStringEquals(systemStringAttributes);
            double systemStringLvSimilarity = Similarity.calculateStringLv(systemStringAttributes);

            experimentsNumericAttributes.addAll(systemNumericAttributes);
            experimentsStringAttributes.addAll(systemStringAttributes);

            output.append("| ALL Generations | Numeric | StringEquals | StringLv |\n");
            output.append("|---|---|---|---|\n");
            output.append(String.format("| ALL Generations | %.4f | %.4f | %.4f |\n\n", 
                systemNumericSimilarity, systemStringSimilarity, systemStringLvSimilarity));
        }

        // System.out.println("Calculating across ALL Systems...");
        // double experimentsNumericSimilarity = Similarity.calculateNumeric(experimentsNumericAttributes);
        // double experimentsStringSimilarity = Similarity.calculateStringEquals(experimentsStringAttributes);
        // double experimentsStringLvSimilarity = Similarity.calculateStringLv(experimentsStringAttributes);

        // output.append("# ALL Systems\n\n");
        // output.append("| ALL Systems | Numeric | StringEquals | StringLv |\n");
        // output.append("|---|---|---|---|\n");
        // output.append(String.format("| ALL Systems | %.4f | %.4f | %.4f |\n\n", 
        //     experimentsNumericSimilarity, experimentsStringSimilarity, experimentsStringLvSimilarity));

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
    }
}
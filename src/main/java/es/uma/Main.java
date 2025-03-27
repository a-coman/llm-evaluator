package es.uma;

import java.io.File;
import java.util.*;

public class Main {

    public Map<String, Map<String, List<String>>> getPaths(String type) {
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
                                    if (file.getName().endsWith(".soil") && !file.getName().contains("output")) {
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

    private static int calculateNumericSimilarity(List<Double> numericAttributes) {
        int sum = 0;
        int it = 0;
        for (int i = 0; i < numericAttributes.size(); i++) {
            for (int j = 0; j < numericAttributes.size(); j++) {
                if (numericAttributes.get(i) <= numericAttributes.get(j)) {
                    it += 1;
                    if (numericAttributes.get(i).equals(numericAttributes.get(j))) {
                        sum += 1;
                    }
                }
            }
        }
        return it == 0 ? 0 : sum / it;
    }

    private static int calculateEqualsStringSimilarity(List<String> stringAttributes) {
        int sum = 0;
        for (int i = 0; i < stringAttributes.size() / 2; i++)
            for (int j = stringAttributes.size() / 2; j < stringAttributes.size(); j++)
                sum += stringAttributes.get(i).equals(stringAttributes.get(j)) ? 1 : 0;
        return stringAttributes.size() == 0 ? 0 : sum / stringAttributes.size();
    }

    private static int calculateLvStringSimilarity(List<String> stringAttributes) {
        int sum = 0;
        for (int i = 0; i < stringAttributes.size() / 2; i++)
            for (int j = stringAttributes.size() / 2; j < stringAttributes.size(); j++)
                sum += Lv.computeLvDistance(stringAttributes.get(i), stringAttributes.get(j));
        return stringAttributes.size() == 0 ? 0 : sum / stringAttributes.size();
    }

    private static String calculateSimpleSimilarities(Map<String, Map<String, List<String>>> simplePaths) {
        StringBuffer results = new StringBuffer();

        for (String system : simplePaths.keySet()) {
            Map<String, List<String>> genMap = simplePaths.get(system);
            List<Double> allNumericAttributes = new ArrayList<>();
            List<String> allStringAttributes = new ArrayList<>();

            String systemName = system.substring(0, system.indexOf("/"));
            results.append("| " + systemName + " | Numeric | StringEquals similarity | StringLv similarity |\n");
            results.append("|---|---|---|---|\n");

            // Within instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                List<String> stringAttributes = Utils.getStringAttributes(instance);
                allNumericAttributes.addAll(numericAttributes);
                allStringAttributes.addAll(stringAttributes);
                int numericSimilarity = calculateNumericSimilarity(numericAttributes);
                int stringEqualsSimilarity = calculateEqualsStringSimilarity(stringAttributes);
                int stringLvSimilarity = calculateLvStringSimilarity(stringAttributes);
                System.out.println("Within " + system + "/" + gen + " Numeric similarity: " + numericSimilarity);
                System.out.println("Within " + system + "/" + gen + " StringEq. similarity: " + stringEqualsSimilarity);
                System.out.println("Within " + system + "/" + gen + " StringLv. similarity: " + stringLvSimilarity);

                results.append("| " + gen + " | " + numericSimilarity + " | " + stringEqualsSimilarity + " |" + stringLvSimilarity + " |\n");
            }

            // Across instances
            int allNumericSimilarity = calculateNumericSimilarity(allNumericAttributes);
            int allStringSimilarity = calculateEqualsStringSimilarity(allStringAttributes);
            int allStringLvSimilarity = calculateLvStringSimilarity(allStringAttributes);
            System.out.println("Across " + system + " Numeric similarity: " + allNumericSimilarity);
            System.out.println("Across " + system + " StringEq. similarity: " + allStringSimilarity);
            System.out.println("Across " + system + " StringLv. similarity: " + allStringLvSimilarity);

            results.append("| ALL | " + allNumericSimilarity + " | " + allStringSimilarity + " |" + allStringLvSimilarity + " |\n\n");
            
        }

        return results.toString().trim();
    }

    /*
    private static String calculateCoTSimilarities(Map<String, Map<String, List<String>>> cotPaths) {
        StringBuffer results = new StringBuffer();

        for (String system : cotPaths.keySet()) {
            Map<String, List<String>> genMap = cotPaths.get(system);
            Map<String, List<Double>> categoryToNumericAttributes = new HashMap<>();
            Map<String, List<String>> categoryToStringAttributes = new HashMap<>();
            List<Double> allNumericAttributes = new ArrayList<>();
            List<String> allStringAttributes = new ArrayList<>();

            String systemName = system.substring(0, system.indexOf("/"));
            results.append("## " + systemName + "\n\n");

            // Within instances
            for (String gen : genMap.keySet()) {
                List<String> categoryFiles = genMap.get(gen);
                List<Double> genNumericAttributes = new ArrayList<>();
                List<String> genStringAttributes = new ArrayList<>();

                // Collect attributes for all files in this generation
                for (String filePath : categoryFiles) {
                    String instance = Utils.readFile(filePath);
                    List<Double> numericAttributes = Utils.getNumericAttributes(instance);
                    List<String> stringAttributes = Utils.getStringAttributes(instance);
                    genNumericAttributes.addAll(numericAttributes);
                    genStringAttributes.addAll(stringAttributes);

                    String category = new File(filePath).getName().replace(".soil", "");
                    categoryToNumericAttributes.computeIfAbsent(category, k -> new ArrayList<>()).addAll(numericAttributes);
                    categoryToStringAttributes.computeIfAbsent(category, k -> new ArrayList<>()).addAll(stringAttributes);
                    allNumericAttributes.addAll(numericAttributes);
                    allStringAttributes.addAll(stringAttributes);
                }

                // Calculate within-generation similarities
                int numericSimilarity = calculateNumericSimilarity(genNumericAttributes);
                int stringEqualsSimilarity = calculateEqualsStringSimilarity(genStringAttributes);
                int stringLvSimilarity = calculateLvStringSimilarity(genStringAttributes);
                System.out.println("Within " + system + "/" + gen + " Numeric similarity: " + numericSimilarity);
                System.out.println("Within " + system + "/" + gen + " StringEq. similarity: " + stringEqualsSimilarity);
                System.out.println("Within " + system + "/" + gen + " StringLv. similarity: " + stringLvSimilarity);

                results.append("| " + gen + " | Numeric | StringEq | StringLv |\n");
                results.append("|---|---|---|---|\n");
                results.append("| ALL | " + numericSimilarity + " | " + stringEqualsSimilarity + " | " + stringLvSimilarity + " |\n\n");
            }

            // Across instances by category
            results.append("### Across Categories\n\n");
            for (String category : categoryToNumericAttributes.keySet()) {
                List<Double> numericAttributes = categoryToNumericAttributes.get(category);
                List<String> stringAttributes = categoryToStringAttributes.get(category);
                int numericSimilarity = calculateNumericSimilarity(numericAttributes);
                int stringEqualsSimilarity = calculateEqualsStringSimilarity(stringAttributes);
                int stringLvSimilarity = calculateLvStringSimilarity(stringAttributes);
                System.out.println("Across " + system + " " + category + " Numeric similarity: " + numericSimilarity);
                System.out.println("Across " + system + " " + category + " StringEq. similarity: " + stringEqualsSimilarity);
                System.out.println("Across " + system + " " + category + " StringLv. similarity: " + stringLvSimilarity);

                results.append("| " + category + " | " + numericSimilarity + " | " + stringEqualsSimilarity + " | " + stringLvSimilarity + " |\n");
            }

            // Overall across all instances
            int allNumericSimilarity = calculateNumericSimilarity(allNumericAttributes);
            int allStringSimilarity = calculateEqualsStringSimilarity(allStringAttributes);
            int allStringLvSimilarity = calculateLvStringSimilarity(allStringAttributes);
            System.out.println("Across " + system + " ALL Numeric similarity: " + allNumericSimilarity);
            System.out.println("Across " + system + " ALL StringEq. similarity: " + allStringSimilarity);
            System.out.println("Across " + system + " ALL StringLv. similarity: " + allStringLvSimilarity);

            results.append("| ALL | " + allNumericSimilarity + " | " + allStringSimilarity + " | " + allStringLvSimilarity + " |\n\n");
        }

        return results.toString().trim();
    }
    */

    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> simplePaths = new Main().getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = new Main().getPaths("CoT");
        System.out.println(simplePaths.keySet());
        String simpleResults = calculateSimpleSimilarities(simplePaths);
        Utils.saveFile(simpleResults, "./", "simpleResults.md", false);
        //String cotResults = calculateCoTSimilarities(cotPaths);
        //Utils.saveFile(cotResults, "./", "cotResults.md", false);
    }
}
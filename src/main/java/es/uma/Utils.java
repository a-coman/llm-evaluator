package es.uma;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {

    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.err.println("Error reading file: " + path + " - " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void saveFile(String file, String path, String filename, boolean append) {
        try {
            File directory = new File(path);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            FileWriter writer = new FileWriter(path + filename, append);
            writer.write(file);
            writer.flush();
            writer.close();
            System.out.println("Saved at " + path + filename);
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    // Append true by default
    public static void saveFile(String file, String path, String filename) {
        saveFile(file, path, filename, true);
    }

    public static List<String> match(String text, String pattern) {
        List<String> matches = new ArrayList<>();
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        while (m.find()) {
            matches.add(m.group(1).trim());
        }
        return matches;
    }

    public static List<Double> getNumericAttributes(String instance) {
        String pattern = "!(?:\\s*set)?\\s*\\w+(?:\\.\\w+)*\\s*:=\\s*(\\d+(?:\\.\\d+)?)";
        List<String> matches = match(instance, pattern);
        return matches.stream().map(Double::parseDouble).collect(Collectors.toList());
    }

    public static List<String> getStringAttributes(String instance) {
        String pattern = "!(?:\\s*set)?\\s*\\w+(?:\\.\\w+)*\\s*:=\\s*'([^']*)'";
        return match(instance, pattern);
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

    public static Map<String, Map<String, List<String>>> getPaths(String type) {
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

    private static void processSimpleDirectory(File simpleDir, Map<String, Map<String, List<String>>> simplePaths) {
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

    private static void processCotDirectory(File cotDir, Map<String, Map<String, List<String>>> cotPaths) {
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

    public static void main(String[] args) {
        // String path = "src/main/resources/dataset/CoT/Football/02-04-2025--19-03-28/gen5/invalid.soil";
        // String instance = readFile(path);
        // List<Double> numericAttributes = getNumericAttributes(instance);
        // List<String> stringAttributes = getStringAttributes(instance);
        // System.out.println(numericAttributes);
        // System.out.println(stringAttributes);

        // Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT");
        // System.out.println("SimplePaths:\n" + simplePaths + "\n\n");
        System.out.println(cotPaths.get("Bank").get("gen1"));
        // System.out.println("CoTPaths:\n" + cotPaths + "\n\n");
    }
}
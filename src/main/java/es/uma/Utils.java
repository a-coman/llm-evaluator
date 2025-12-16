package es.uma;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
            try (FileWriter writer = new FileWriter(path + filename, append)) {
                writer.write(file);
                writer.flush();
            }
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

    /**
     * Compare two timestamp strings in format DD-MM-YYYY--HH-MM-SS.
     * Returns positive if ts1 is more recent, negative if ts2 is more recent, 0 if
     * equal.
     */
    private static int compareTimestamps(String ts1, String ts2) {
        try {
            // Parse DD-MM-YYYY--HH-MM-SS format
            String[] parts1 = ts1.split("--");
            String[] parts2 = ts2.split("--");

            if (parts1.length != 2 || parts2.length != 2) {
                return ts1.compareTo(ts2); // Fallback to string comparison
            }

            String[] date1 = parts1[0].split("-");
            String[] date2 = parts2[0].split("-");
            String[] time1 = parts1[1].split("-");
            String[] time2 = parts2[1].split("-");

            if (date1.length != 3 || date2.length != 3 || time1.length != 3 || time2.length != 3) {
                return ts1.compareTo(ts2); // Fallback to string comparison
            }

            // Compare year, month, day, hour, minute, second
            int[] order = { 2, 1, 0 }; // year, month, day indices in date array
            for (int i : order) {
                int cmp = Integer.compare(Integer.parseInt(date1[i]), Integer.parseInt(date2[i]));
                if (cmp != 0)
                    return cmp;
            }
            for (int i = 0; i < 3; i++) { // hour, minute, second
                int cmp = Integer.compare(Integer.parseInt(time1[i]), Integer.parseInt(time2[i]));
                if (cmp != 0)
                    return cmp;
            }
            return 0;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return ts1.compareTo(ts2); // Fallback to string comparison
        }
    }

    public static Map<String, Map<String, List<String>>> getPaths(String type, String dataset) {
        Map<String, Map<String, List<String>>> simplePaths = new HashMap<>();
        Map<String, Map<String, List<String>>> cotPaths = new HashMap<>();
        String datasetRoot = "./src/main/resources/dataset/"+ dataset +"/";
        File rootDir = new File(datasetRoot);

        File[] categoryDirs = rootDir.listFiles();
        if (categoryDirs == null) {
            throw new RuntimeException("Cannot read dataset directory: " + datasetRoot);
        }

        for (File categoryDir : categoryDirs) {
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
        File[] systemDirs = simpleDir.listFiles();
        if (systemDirs == null)
            return;

        for (File systemDir : systemDirs) {
            if (!systemDir.isDirectory())
                continue;

            File[] timestampDirs = systemDir.listFiles();
            if (timestampDirs == null)
                continue;

            // Use the most recent timestamp directory
            File latestTimestamp = null;
            for (File timestampDir : timestampDirs) {
                if (timestampDir.isDirectory()) {
                    if (latestTimestamp == null
                            || compareTimestamps(timestampDir.getName(), latestTimestamp.getName()) > 0) {
                        latestTimestamp = timestampDir;
                    }
                }
            }

            if (latestTimestamp == null)
                continue;

            String systemKey = systemDir.getName();
            Map<String, List<String>> genMap = new TreeMap<>(new GenComparator());

            File[] genDirs = latestTimestamp.listFiles();
            if (genDirs == null)
                continue;

            for (File genDir : genDirs) {
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

    private static void processCotDirectory(File cotDir, Map<String, Map<String, List<String>>> cotPaths) {
        File[] systemDirs = cotDir.listFiles();
        if (systemDirs == null)
            return;

        for (File systemDir : systemDirs) {
            if (!systemDir.isDirectory())
                continue;

            File[] timestampDirs = systemDir.listFiles();
            if (timestampDirs == null)
                continue;

            // Use the most recent timestamp directory
            File latestTimestamp = null;
            for (File timestampDir : timestampDirs) {
                if (timestampDir.isDirectory()) {
                    if (latestTimestamp == null
                            || compareTimestamps(timestampDir.getName(), latestTimestamp.getName()) > 0) {
                        latestTimestamp = timestampDir;
                    }
                }
            }

            if (latestTimestamp == null)
                continue;

            String systemKey = systemDir.getName();
            Map<String, List<String>> genMap = new TreeMap<>(new GenComparator());

            File[] genDirs = latestTimestamp.listFiles();
            if (genDirs == null)
                continue;

            for (File genDir : genDirs) {
                if (genDir.isDirectory() && genDir.getName().startsWith("gen")) {
                    List<String> categoryFiles = new ArrayList<>();
                    File[] files = genDir.listFiles();
                    if (files != null) {
                        for (File file : files) {
                            if (file.getName().endsWith(".soil") && !file.getName().contains("output")
                                    && !file.getName().contains("temp")) {
                                categoryFiles.add(file.getAbsolutePath());
                            }
                        }
                    }
                    genMap.put(genDir.getName(), categoryFiles);
                }
            }
            cotPaths.put(systemKey, genMap);
        }
    }

    public static String removeBackticks(String text) {
        String regex = "```+[^\\n]*"; // Matches codeblocks, i.e. ``` or more followed by any character except a newline
        return text.replaceAll(regex, "").trim();
    }

    public static String removeComments(String text) {
        String regex = "(?m)^(?!!|--).*$"; // Matches any line that doesn't start with ! or --
        return text.replaceAll(regex, "").trim();
    }

    public static String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy--HH-mm-ss")); 
    }

    // Recursively collect all .soil files in dir and subdirs
    private static File[] getAllSoilFiles(File dir, List<File> result) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    getAllSoilFiles(file, result);
                } else if (file.getName().endsWith(".soil")) {
                    result.add(file);
                }
            }
        }
        return result.toArray(new File[0]);
    }

    public static File[] getAllSoilFiles(File dir) {
        return getAllSoilFiles(dir, new ArrayList<>());
    }

    public static void main(String[] args) {
        // String path =
        // "src/main/resources/dataset/CoT/Football/02-04-2025--19-03-28/gen5/invalid.soil";
        // String instance = readFile(path);
        // List<Double> numericAttributes = getNumericAttributes(instance);
        // List<String> stringAttributes = getStringAttributes(instance);
        // System.out.println(numericAttributes);
        // System.out.println(stringAttributes);

        // Map<String, Map<String, List<String>>> simplePaths =
        // Utils.getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT", "GPT4O");
        // System.out.println("SimplePaths:\n" + simplePaths + "\n\n");
        System.out.println(cotPaths.get("Bank").get("gen1"));
        // System.out.println("CoTPaths:\n" + cotPaths + "\n\n");
    }
}
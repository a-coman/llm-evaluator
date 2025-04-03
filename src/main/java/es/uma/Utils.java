package es.uma;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
            matches.add(m.group(1));
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

    public static void main(String[] args) {
        String path = "src/main/resources/dataset/CoT/Football/02-04-2025--19-03-28/gen5/invalid.soil";
        String instance = readFile(path);
        List<Double> numericAttributes = getNumericAttributes(instance);
        List<String> stringAttributes = getStringAttributes(instance);
        System.out.println(numericAttributes);
        System.out.println(stringAttributes);
    }
}
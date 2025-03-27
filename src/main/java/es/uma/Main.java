package es.uma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<String> getDatasetPaths() {
        Path datasetPath = Paths.get("src", "main", "resources", "dataset");
        
        try {
            return Files.walk(datasetPath)
                    .filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().contains(".soil"))
                    .filter(path -> {
                        String fileName = path.getFileName().toString();
                        if (fileName.contains("temp")) {
                            return false;
                        }

                        if (fileName.contains("output")) {
                           // If the parent directory is named "Simple", then include output file
                            Path parent = path.getParent().getParent().getParent().getParent();
                            if (parent != null && parent.getFileName().toString().equals("Simple")) {
                                return true;
                            }
                            return false;  // otherwise, exclude files with "output"
                        }
                        return true;
                    })
                    .map(path -> path.toAbsolutePath().toString())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();  // Return an empty list on error.
    }

    public static void main(String[] args) {
        List<String> results = getDatasetPaths();
        results.forEach(System.out::println);
    }
}
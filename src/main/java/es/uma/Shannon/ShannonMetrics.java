package es.uma.Shannon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;
import es.uma.Utils;

public class ShannonMetrics {    
    // Map -> String attribute, List<String> values
    private final Map<String, List<String>> attributes;
   
    public ShannonMetrics() {
        this.attributes = new LinkedHashMap<>(); // Using LinkedHashMap to maintain Domain.java specification order
    }

    public ShannonMetrics(Map<String, List<String>> attributes) {
        this.attributes = new LinkedHashMap<>(attributes);
    }
    
    public void addAttribute(String attribute, List<String> values) {
        if (values != null) {
            if (attributes.get(attribute) != null) {
                List<String> existingValues = attributes.get(attribute);
                existingValues.addAll(values);
            } else {
                attributes.put(attribute, new ArrayList<>(values));
            }
        }
    }

    public void addAttributesMap(Map<String, List<String>> map) {
        if (map != null) {
            map.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    this.addAttribute(key, value);
                }
            });
        }
    }

    // Calculate Shannon metrics and classify attributes
    public List<Table> calculate() {
        List<Table> tables = new ArrayList<>();
        String[] columnsHeader = {"Nº"};

        for (String attribute : attributes.keySet()) {
            List<String> values = attributes.get(attribute);

            if (values == null || values.isEmpty()) {
                continue;
            }

            GroupClassifier classifier = ClassifiersFactory.getClassifier(attribute);
            Map<String, List<String>> groups = new LinkedHashMap<>();

            for (String value : values) {
                String group = classifier.classify(value);
                groups.computeIfAbsent(group, k -> new ArrayList<>()).add(value);
            }

            List<String> allGroups = classifier.getGroups();
            String[] rowsHeader = allGroups.toArray(new String[0]);
            Table table = new Table(attribute, rowsHeader, columnsHeader);

            int totalValues = groups.values().stream().mapToInt(List::size).sum();
            float entropy = 0.0f;

            for (String group : allGroups) {
                List<String> groupValues = groups.getOrDefault(group, new ArrayList<>());
                int count = groupValues.size();
                float px = totalValues > 0 ? (float) count / totalValues : 0.0f;
                if (px > 0) {
                    entropy -= px * Math.log(px) / Math.log(2);
                }
                table.setValue(count, group, "Nº");
            }

            tables.add(table);

            float maxEntropy = (float) Math.log(groups.size()) / (float) Math.log(2);
            float evenness = maxEntropy == 0 ? 0 : entropy / maxEntropy;
            float maxEntropyAllGroups = (float) Math.log(classifier.getGroups().size()) / (float) Math.log(2); // Maximum entropy for all possible groups
            float evennessAllGroups = maxEntropyAllGroups == 0 ? 0 : entropy / maxEntropyAllGroups;

            System.out.println("Attribute " + attribute + " - Total Values: " + totalValues + " - Groups: " + groups);
            System.out.println("Entropy: " + entropy + " - Max Entropy: " + maxEntropy + " - Evenness (in active groups): " + evenness + " - Evenness (in all groups): " + evennessAllGroups);
        }

        return tables;
    }

    public void aggregate(ShannonMetrics other) {
        other.attributes.forEach((attribute, values) -> {
            if (values != null && !values.isEmpty()) {
                this.addAttribute(attribute, values);
            }
        });
    }

    // Main for testing purposes
    public static void main(String[] args) {
        Map<String, List<String>> exampleAttributes = new LinkedHashMap<>();

        //exampleAttributes.put("age", List.of("12", "18", "25", "65", "43", "-11", "31", "0", "19", "20", "21", "22", "23", "24"));

        //String filePath = "src/main/resources/dataset/Simple/Example1/14-07-2025--16-00-00/gen1/output.soil";
        //String filePath = "src/main/resources/dataset/Simple/Example2/14-07-2025--16-00-00/gen2/output.soil";
        String filePath = "src/main/resources/dataset/Simple/Example3/14-07-2025--16-00-00/gen3/output.soil";
        String instance = Utils.readFile(filePath);
        List<String> attributeNames = List.of("age");

        exampleAttributes = Extractor.getAttributes(instance, attributeNames);

        System.out.println("Extracted Attributes: " + exampleAttributes);
        
        ShannonMetrics metrics = new ShannonMetrics(exampleAttributes);
        
        //System.out.println(metrics.classifyAttributes());
        List<Table> tables = metrics.calculate();
        tables.forEach(table -> System.out.println(table.toMarkdown()));
    }
}

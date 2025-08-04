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

    // TODO: It classifies attributes each time, eventhough part of them are already classified
    private Map<String, Map<String, List<String>>> classifyAttributes() {
        // Map -> String attributeType, Map -> String group, List<String> values
        Map<String, Map<String, List<String>>> classifiedAttributes = new LinkedHashMap<>();

        for (String attribute : attributes.keySet()) {

            List<String> values = attributes.get(attribute);

            if (values == null || values.isEmpty()) {
                // Skip empty attributes
                continue;
                
            }
            
            GroupClassifier classifier = ClassifiersFactory.getClassifier(attribute);

            values.forEach(value -> {
                String group = classifier.classify(value);
                classifiedAttributes
                    .computeIfAbsent(attribute, k -> new LinkedHashMap<>())
                    .computeIfAbsent(group, k -> new ArrayList<>())
                    .add(value);
            });

        }

        return classifiedAttributes;
    }

    // Calculate Shannon metrics for the classified attributes
    public List<Table> calculate() {
        List<Table> tables = new ArrayList<>();
        String[] columnsHeader = {"Nº", "Values"};

        // Classify the attribute values
        Map<String, Map<String, List<String>>> classifiedAttributes = classifyAttributes();

        for (String attribute : classifiedAttributes.keySet()) {
            Map<String, List<String>> groups = classifiedAttributes.get(attribute);
            
            String[] rowsHeader = groups.keySet().toArray(new String[0]);
            
            Table table = new Table(attribute, rowsHeader, columnsHeader);

            int totalValues = groups.values().stream()
                    .mapToInt(List::size)
                    .sum();

            System.out.println("Attribute: " + attribute + " - Total Values: " + totalValues);

            float entropy = 0.0f;

            for (String group : groups.keySet()) {
                List<String> groupValues = groups.get(group);
                
                float px = (float) groupValues.size() / totalValues;

                entropy -= px * Math.log(px) / Math.log(2); // Calculate entropy using base 2 logarithm

                System.out.println("Group: " + group + " - Values: " + groupValues + " - Probability: " + px + " - Entropy Contribution: " + (px * Math.log(px) / Math.log(2)));                    

                table.setValue(groupValues.size(), group, "Nº");
                table.setValue(0.0f, group, "Values"); // 0.0f as a placeholder
                //table.setValue(String.join(", ", groupValues), group, "Values"); // TODO: Change Table data[][] to String
            }

            tables.add(table);

            float maxEntropy = (float) Math.log(groups.size()) / (float) Math.log(2); // Maximum entropy for the number of groups

            float evenness = maxEntropy == 0 ? 0 : entropy / maxEntropy; // Evenness metric

            // TODO: Change hardcoed value to a dynamic one based on the number of groups
            float maxEntropyAllGroups = (float) Math.log(5) / (float) Math.log(2); // Maximum entropy for all values
            float evennessAllGroups = entropy / maxEntropyAllGroups;

            System.out.println("Entropy: " + entropy + " - Max Entropy: " + maxEntropy + " - Evenness (in active groups): " + evenness + " - Evenness (in all groups): " + evennessAllGroups);
            // TODO: Add a table with the previous sout values
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

        String filePath = "src/main/resources/dataset/Simple/Example3/14-07-2025--16-00-00/gen3/output.soil";
        String instance = Utils.readFile(filePath);
        List<String> attributeNames = List.of("age");

        exampleAttributes = Extractor.getAttributes(instance, attributeNames);

        System.out.println("Extracted Attributes: " + exampleAttributes);
        
        ShannonMetrics metrics = new ShannonMetrics(exampleAttributes);
        
        System.out.println(metrics.classifyAttributes());
        List<Table> tables = metrics.calculate();
        tables.forEach(table -> System.out.println(table.toMarkdown()));
    }
}

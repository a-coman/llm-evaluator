package es.uma.Semantics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SemanticMetrics {

    // Map -> String attribute, List<String> values
    private final Map<String, List<String>> attributes;

    public SemanticMetrics() {
        this.attributes = new LinkedHashMap<>(); // Using LinkedHashMap to maintain Domain.java specification order
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

    public List<Table> calculate() {

        List<Table> tables = new ArrayList<>();

        for (String attribute : attributes.keySet()) {
            String[] values = attributes.get(attribute).toArray(new String[0]);

            if (values == null || values.length == 0) {
                tables.add(new Table(attribute, new String[0], new String[0], new float[0][0]));
                // Assign an empty table for empty attributes
                continue;
            }

            // Add table for this attribute
            float[][] data = SemanticMethod.getSimilarity(values);
            tables.add(new Table(attribute, values, values, data));
        }

        return tables;
    }

    public void aggregate(SemanticMetrics other) {
        other.attributes.forEach((attribute, values) -> {
            if (values != null && !values.isEmpty()) {
                //this.addAttribute(attribute, values);
                this.attributes.get(attribute).addAll(values);
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SemanticMetrics:\n");
        for (Map.Entry<String, List<String>> entry : attributes.entrySet()) {
            sb.append("Attribute: ").append(entry.getKey()).append(", Values: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SemanticMetrics metrics = new SemanticMetrics();
        metrics.addAttribute("Color", List.of("Red", "Green", "Blue"));
        metrics.addAttribute("Shape", List.of("Circle", "Square", "Triangle"));

        List<Table> tables = metrics.calculate();
        for (Table table : tables) {
            System.out.println(table.toMarkdown());
        }
    }
}
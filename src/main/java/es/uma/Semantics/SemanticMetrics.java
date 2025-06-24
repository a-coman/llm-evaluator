package es.uma.Semantics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SemanticMetrics {
    private final Map<String, List<String>> attributes;

    public SemanticMetrics() {
        this.attributes = new LinkedHashMap<>();
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

    public SemanticResult calculate() {

        Map<String, Double> results = new LinkedHashMap<>();
        
        for (String attribute : attributes.keySet()) {
            List<String> values = attributes.get(attribute);
            if (values == null || values.isEmpty()) {
                results.put(attribute, -1.0); // Assign -1.0 for empty attributes
                continue; // Skip empty attributes
            }

            double semanticSimilarity = SemanticMethod.calculateSemanticSimilarity(values);
            results.put(attribute, semanticSimilarity);
        }

        return new SemanticResult(results);
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
}
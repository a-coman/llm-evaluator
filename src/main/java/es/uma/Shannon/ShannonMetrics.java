package es.uma.Shannon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.uma.Table;

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

    // TO-DO: It classifies attributes each time, eventhough part of them are already classified
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
        return null;
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

        exampleAttributes.put("age", List.of("12", "18", "25", "65", "43", "-11", "31", "0"));

        ShannonMetrics metrics = new ShannonMetrics(exampleAttributes);
        
        System.out.println(metrics.classifyAttributes());
    }
}

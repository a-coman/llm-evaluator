package es.uma.Coverage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uma.Extractor;
import es.uma.Table;

public class CoverageMetrics {
    // Model definition counts
    private int definedCls, definedAttr, definedRel;
    // Instantiation coverage counts
    private int instantiatedCls, instantiatedAttr, instantiatedRel;
    // Instance counts
    private int totalObjects, totalAttributeValues, totalPossibleAttributeValues, totalLinks;
    // Issues tracking
    private final List<String> uncovered = new ArrayList<>();
    private final List<String> hallucinations = new ArrayList<>();

    public void add(CoverageMetrics other) {
        definedCls += other.definedCls;
        definedAttr += other.definedAttr;
        definedRel += other.definedRel;
        instantiatedCls += other.instantiatedCls;
        instantiatedAttr += other.instantiatedAttr;
        instantiatedRel += other.instantiatedRel;
        totalObjects += other.totalObjects;
        totalAttributeValues += other.totalAttributeValues;
        totalPossibleAttributeValues += other.totalPossibleAttributeValues;
        totalLinks += other.totalLinks;
        uncovered.addAll(other.uncovered);
        hallucinations.addAll(other.hallucinations);
    }

    public void calculate(Map<String, Map<String, List<String>>> instanceAttributes,
            Map<String, List<String>> modelAttributes, String instanceContent, List<String> modelRelationships) {

        Set<String> modelRelSet = new HashSet<>(modelRelationships);

        // Process relationships
        Map<String, Integer> instanceRels = Extractor.getInstanceRelationships(instanceContent);
        instanceRels.keySet().stream()
                .filter(rel -> !modelRelSet.contains(rel))
                .forEach(rel -> hallucinations.add("Relationship: " + rel));

        instanceRels.keySet().retainAll(modelRelSet);
        totalLinks = instanceRels.values().stream().mapToInt(Integer::intValue).sum();

        // Process class instances
        Map<String, Integer> instanceCounts = Extractor.getInstanceCounts(instanceContent);
        instanceCounts.keySet().stream()
                .filter(cls -> !modelAttributes.containsKey(cls))
                .forEach(cls -> hallucinations.add("Class: " + cls));

        instanceCounts.keySet().retainAll(modelAttributes.keySet());
        totalObjects = instanceCounts.values().stream().mapToInt(Integer::intValue).sum();

        // Calculate possible attribute values
        instanceCounts.forEach((cls,
                count) -> totalPossibleAttributeValues += count * modelAttributes.getOrDefault(cls, List.of()).size());

        // Process attribute hallucinations
        Map<String, Map<String, List<String>>> rawAttrs = Extractor.getRawInstanceAttributes(instanceContent);
        rawAttrs.forEach((cls, attrMap) -> {
            List<String> validAttrs = modelAttributes.get(cls);
            if (validAttrs != null) {
                attrMap.keySet().stream()
                        .filter(attr -> !validAttrs.contains(attr))
                        .forEach(attr -> hallucinations.add("Attribute: " + cls + "." + attr));
            }
        });

        // Set definition counts
        definedCls = modelAttributes.size();
        definedAttr = modelAttributes.values().stream().mapToInt(List::size).sum();
        definedRel = modelRelationships.size();

        // Set instantiation counts
        instantiatedCls = instanceAttributes.size();
        instantiatedAttr = instanceAttributes.values().stream().mapToInt(Map::size).sum();
        instantiatedRel = instanceRels.size();
        totalAttributeValues = instanceAttributes.values().stream()
                .flatMap(m -> m.values().stream())
                .mapToInt(List::size)
                .sum();

        // Track uncovered elements
        modelAttributes.forEach((cls, attrs) -> {
            if (!instanceCounts.containsKey(cls)) {
                uncovered.add("Class: " + cls);
            }
            Map<String, List<String>> instAttrs = instanceAttributes.get(cls);
            attrs.stream()
                    .filter(attr -> instAttrs == null || !instAttrs.containsKey(attr))
                    .forEach(attr -> uncovered.add("Attribute: " + cls + "." + attr));
        });

        modelRelationships.stream()
                .filter(rel -> !instanceRels.containsKey(rel))
                .forEach(rel -> uncovered.add("Relationship: " + rel));
    }

    public String getUncoveredListString() {
        return uncovered.isEmpty() ? "" : "Uncovered: " + uncovered + "\n\n";
    }

    public String getHallucinationListString() {
        return hallucinations.isEmpty() ? "" : "Hallucinations: " + hallucinations + "\n\n";
    }

    public Table toTable(String title) {
        String[] columns = { "instantiated", "defined", "coverage" };
        String[] rows = { "classes", "attributes", "relationships" };
        float[][] data = {
                { instantiatedCls, definedCls, ratio(instantiatedCls, definedCls) },
                { instantiatedAttr, definedAttr, ratio(instantiatedAttr, definedAttr) },
                { instantiatedRel, definedRel, ratio(instantiatedRel, definedRel) }
        };
        return new Table(title, rows, columns, data);
    }

    public Table toInstantiationTable(String title) {
        String[] columns = { "total instantiated", "total possible", "ratio" };
        String[] rows = { "classes", "attributes", "relationships" };
        float[][] data = {
                { totalObjects, -1, -1 },
                { totalAttributeValues, totalPossibleAttributeValues,
                        ratio(totalAttributeValues, totalPossibleAttributeValues) },
                { totalLinks, -1, -1 }
        };
        return new Table(title, rows, columns, data);
    }

    private static float ratio(int numerator, int denominator) {
        return denominator != 0 ? (float) numerator / denominator : 0;
    }
}

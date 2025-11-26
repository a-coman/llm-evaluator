package es.uma.Coverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;

public class CoverageMetrics {
    int definedCls = 0, definedAttr = 0, definedRel = 0;
    int instantiatedCls = 0, instantiatedAttr = 0, instantiatedRel = 0;
    List<String> uncovered = new ArrayList<>();

    // Instantiation metrics
    int totalObjects = 0;
    int totalAttributeValues = 0;
    int totalPossibleAttributeValues = 0;
    int totalLinks = 0;

    void add(CoverageMetrics other) {
        this.definedCls += other.definedCls;
        this.definedAttr += other.definedAttr;
        this.definedRel += other.definedRel;
        this.instantiatedCls += other.instantiatedCls;
        this.instantiatedAttr += other.instantiatedAttr;
        this.instantiatedRel += other.instantiatedRel;
        this.uncovered.addAll(other.uncovered);

        this.totalObjects += other.totalObjects;
        this.totalAttributeValues += other.totalAttributeValues;
        this.totalPossibleAttributeValues += other.totalPossibleAttributeValues;
        this.totalLinks += other.totalLinks;
    }

    public void calculate(Map<String, Map<String, List<String>>> instanceAttributes,
            Map<String, List<String>> systemAttributes, String instanceContent, List<String> modelRelationships) {

        // // Combined loops for instanceAttributes
        // for (var className : instanceAttributes.keySet()) {
        //     boolean isSystemClass = systemAttributes.containsKey(className);

        //     if (isSystemClass) {
        //         this.instantiatedCls++;
        //     }

        //     var attributesMap = instanceAttributes.get(className);

        //     // Total attribute values
        //     for (List<String> values : attributesMap.values()) {
        //         this.totalAttributeValues += values.size();
        //     }

        //     // Attribute coverage
        //     for (String attributeName : attributesMap.keySet()) {
        //         if (isSystemClass && systemAttributes.get(className).contains(attributeName)) {
        //             this.instantiatedAttr++;
        //         } else {
        //             this.uncovered.add(className + "." + attributeName);
        //         }
        //     }
        // }

        // // Relationship metrics
        Map<String, Integer> instanceRelationships = Extractor.getInstanceRelationships(instanceContent);
        this.totalLinks = instanceRelationships.values().stream().mapToInt(Integer::intValue).sum();

        // for (String relName : modelRelationships) {
        //     if (instanceRelationships.containsKey(relName)) {
        //         this.instantiatedRel++;
        //     }
        // }

        definedCls = systemAttributes.keySet().size();
        definedAttr = systemAttributes.values().stream().mapToInt(List::size).sum();
        definedRel = modelRelationships.size();

        instantiatedCls = instanceAttributes.keySet().size();
        instantiatedAttr = instanceAttributes.values().stream().mapToInt(Map::size).sum();
        instantiatedRel = instanceRelationships.keySet().size();

        totalAttributeValues = instanceAttributes.values().stream()
                .mapToInt(attrMap -> attrMap.values().stream().mapToInt(List::size).sum())
                .sum();


        // Instantiation stats
        Map<String, Integer> instanceCounts = Extractor.getInstanceCounts(instanceContent);
        this.totalObjects = instanceCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (Map.Entry<String, Integer> entry : instanceCounts.entrySet()) {
            String className = entry.getKey();
            int count = entry.getValue();
            if (systemAttributes.containsKey(className)) {
                int attrsPerClass = systemAttributes.get(className).size();
                this.totalPossibleAttributeValues += count * attrsPerClass;
            }
        }


    }

    public String getUncoveredListString() {
        if (!uncovered.isEmpty()) {
            return "Uncovered: " + uncovered.toString() + "\n\n";
        }
        return "";
    }

    Table toTable(String title) {
        String[] tableColumnsHeader = new String[] { "instantiated", "defined", "coverage" };
        String[] tableRowsHeader = new String[] { "classes", "attributes", "relationships" };

        float[][] tableData = {
                { instantiatedCls, definedCls, definedCls != 0 ? (float) instantiatedCls / definedCls : 0 },
                { instantiatedAttr, definedAttr, definedAttr != 0 ? (float) instantiatedAttr / definedAttr : 0 },
                { instantiatedRel, definedRel, definedRel != 0 ? (float) instantiatedRel / definedRel : 0 }
        };

        return new Table(title, tableRowsHeader, tableColumnsHeader, tableData);
    }

    Table toInstantiationTable(String title) {
        String[] tableColumnsHeader = new String[] { "total instantiated", "total possible", "ratio" };
        String[] tableRowsHeader = new String[] { "classes", "attributes", "relationships" };

        float[][] tableData = {
                { totalObjects, -1, -1 },
                { totalAttributeValues, totalPossibleAttributeValues,
                        totalPossibleAttributeValues != 0 ? (float) totalAttributeValues / totalPossibleAttributeValues
                                : 0 },
                { totalLinks, -1, -1 }
        };

        return new Table(title, tableRowsHeader, tableColumnsHeader, tableData);
    }
}

package es.uma.Shannon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;
import es.uma.Utils;

public class ShannonMetrics {

    // Map -> String system, Map -> String attribute, List<String> values
    private final Map<String, Map<String, List<String>>> systemAttributes;

    public ShannonMetrics() {
        this.systemAttributes = new LinkedHashMap<>();
    }

    public ShannonMetrics(Map<String, List<String>> attributes, String system) {
        this.systemAttributes = new LinkedHashMap<>();
        this.addAttributesMap(attributes, system);
    }

    public void addAttribute(String attribute, List<String> values, String system) {
        // Map -> String attribute, List<String> values
        Map<String, List<String>> attributes = systemAttributes.computeIfAbsent(system, k -> new LinkedHashMap<>());

        if (values != null) {
            if (attributes.get(attribute) != null) {
                List<String> existingValues = attributes.get(attribute);
                existingValues.addAll(values); // TODO: Review this; Add new values to existing list
            } else {
                attributes.put(attribute, new ArrayList<>(values));
            }
        }
    }

    public void addAttributesMap(Map<String, List<String>> attributesMap, String system) {
        if (attributesMap != null) {
            attributesMap.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    this.addAttribute(key, value, system);
                }
            });
        }
    }

    // Calculate Shannon metrics and classify attributes
    public List<Table> calculate() {
        List<Table> tables = new ArrayList<>();
        String[] columnsHeader = { "Nº" };
        for (String system : systemAttributes.keySet()) {
            Map<String, List<String>> attributes = systemAttributes.get(system);
            for (String attribute : attributes.keySet()) {
                List<String> values = attributes.get(attribute);

                if (values == null || values.isEmpty()) {
                    continue;
                }

                GroupClassifier classifier = ClassifiersFactory.getClassifier(attribute, system);
                Map<String, List<String>> groups = new LinkedHashMap<>();

                for (String value : values) {
                    String group = classifier.classify(value);

                    if (group == null) {
                        continue; // Skip values that don't match any group (e.g., invalid enum values)
                    }

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
                float maxEntropyAllGroups = (float) Math.log(classifier.getGroups().size()) / (float) Math.log(2); // Maximum
                                                                                                                   // entropy
                                                                                                                   // for
                                                                                                                   // all
                                                                                                                   // possible
                                                                                                                   // groups
                float evennessAllGroups = maxEntropyAllGroups == 0 ? 0 : entropy / maxEntropyAllGroups;

                float[][] data = new float[][] { { entropy }, { maxEntropy }, { evenness }, { maxEntropyAllGroups },
                        { evennessAllGroups } };
                String[] entropyRows = new String[] { "Entropy", "Max Entropy (active groups)",
                        "Evenness (active groups)", "Max Entropy (all groups)", "Evenness (all groups)" };
                String[] entropyColumns = new String[] { "Value" };
                Table entropyTable = new Table("Entropy", entropyRows, entropyColumns, data);

                tables.add(entropyTable);

                System.out
                        .println("Attribute " + attribute + " - Total Values: " + totalValues + " - Groups: " + groups);
                System.out.println(
                        "Entropy: " + entropy + " - Max Entropy: " + maxEntropy + " - Evenness (in active groups): "
                                + evenness + " - Evenness (in all groups): " + evennessAllGroups);
            }
        }

        return tables;
    }

    public void aggregate(ShannonMetrics other) {

        if (other == null) {
            return;
        }

        other.systemAttributes.forEach((system, attributes) -> {
            attributes.forEach((attribute, values) -> {
                if (values != null && !values.isEmpty()) {
                    this.addAttribute(attribute, values, system);
                }
            });
        });
    }

    // Main for testing purposes
    public static void main(String[] args) {
        Map<String, List<String>> exampleAttributes = new LinkedHashMap<>();

        // exampleAttributes.put("age", List.of("12", "18", "25", "65", "43", "-11",
        // "31", "0", "19", "20", "21", "22", "23", "24"));

        // String filePath =
        // "src/main/resources/dataset/Simple/Example1/14-07-2025--16-00-00/gen1/output.soil";
        // String filePath =
        // "src/main/resources/dataset/Simple/Example2/14-07-2025--16-00-00/gen2/output.soil";
        // String filePath =
        // "src/main/resources/dataset/Simple/Example3/14-07-2025--16-00-00/gen3/output.soil";
        String filePath = "src/main/resources/dataset/Simple/AddressBook/21-03-2025--17-36-43/gen1/output.soil";
        String instance = Utils.readFile(filePath);
        String system = "addressbook";
        List<String> attributeNames = List.of("Note.type");

        exampleAttributes = Extractor.getInstanceAttributes(instance, attributeNames);

        System.out.println("Extracted Attributes: " + exampleAttributes);

        ShannonMetrics metrics = new ShannonMetrics(exampleAttributes, system);

        // System.out.println(metrics.classifyAttributes());
        List<Table> tables = metrics.calculate();
        tables.forEach(table -> System.out.println(table.toMarkdown()));
    }
}

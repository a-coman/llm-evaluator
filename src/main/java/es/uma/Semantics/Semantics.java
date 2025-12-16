package es.uma.Semantics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;
import es.uma.Utils;

public class Semantics {

    private static final String interpretationText = """
            **Table values interpretation:**

            - **NaN** indicates the absence of attributes of that type.
            - **1.0** means that the attributes are completely **different**.
            *(If there is only one attribute, it also returns 1.0)*
            - **0.0** means the attributes are entirely **identical**.
            """;

    private static String calculateSimple(Map<String, Map<String, List<String>>> simplePaths) {

        StringBuilder summary = new StringBuilder();
        String[] summaryHeader = new String[] { "Weighted Mean", "Weighted STD" };
        String[] summaryRows = simplePaths.keySet().toArray(new String[0]);
        Table withinSummary = new Table("Within", summaryRows, summaryHeader);
        Table acrossSummary = new Table("Across", summaryRows, summaryHeader);

        StringBuilder output = new StringBuilder();

        output.append("# Simple\n\n");
        output.append(interpretationText).append("\n");

        for (String system : simplePaths.keySet()) {

            Domain domain = null;
            try {
                domain = Domain.valueOf(system.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown system: " + system);
                continue;
            }

            List<String> attributeNames = (domain != null) ? domain.getAttributes() : List.of();

            output.append("## " + system + "\n\n");
            Map<String, List<String>> genMap = simplePaths.get(system);

            Table systemTable = new Table(system, genMap.keySet().toArray(new String[0]),
                    attributeNames.toArray(new String[0]));
            SemanticMetrics systemMetrics = new SemanticMetrics();

            // Whithin instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                Map<String, List<String>> attributes = Extractor.getInstanceAttributes(instance, attributeNames); // attributeName,
                                                                                                                  // listOfValues

                systemTable.setColumnsNumberAttributes(gen, attributes);

                SemanticMetrics genMetrics = new SemanticMetrics();

                genMetrics.addAttributesMap(attributes);
                systemMetrics.addAttributesMap(attributes);

                output.append("### " + gen + "\n\n");
                System.out.println("Calculating within " + system + "/" + gen + "...");
                List<Table> genTables = genMetrics.calculate();
                for (Table table : genTables) {
                    output.append(table.toMarkdown()).append("\n\n");
                    systemTable.setValue(table.getTopDiagStats().mean, gen, table.getTitle());
                }
            }

            // Across instances
            output.append("### ALL Gen detailed\n\n");
            System.out.println("Calculating across " + system + "...");
            List<Table> systemTables = systemMetrics.calculate();

            String[] allGenRowHeader = new String[] { "Across Gen" };
            Table acrossTable = new Table(system, allGenRowHeader, attributeNames.toArray(new String[0]));
            Map<String, List<String>> acrossAttributes = new HashMap<>();

            for (Table table : systemTables) {
                output.append(table.toMarkdown()).append("\n\n");
                acrossTable.setValue(table.getTopDiagStats().mean, allGenRowHeader[0], table.getTitle());

                acrossAttributes.put(table.getTitle(), List.of(table.getColumnsHeader()));
            }

            acrossTable.setColumnsNumberAttributes("Across Gen", acrossAttributes);

            output.append("### ALL Gen top-diag mean\n\n");
            output.append(systemTable.toMarkdown()).append("\n\n");
            output.append(acrossTable.toMarkdown()).append("\n\n");

            // Update summary tables
            for (int i = 0; i < systemTable.getRowsHeader().length; i++) {
                float mean = systemTable.getWeightedMean(i);
                float std = systemTable.getWeightedStd(i);

                withinSummary.addValue(mean, system, "Weighted Mean");
                withinSummary.addValue(std, system, "Weighted STD");
            }

            withinSummary.setValue(withinSummary.getValue(system, "Weighted Mean") / genMap.keySet().size(), system,
                    "Weighted Mean");
            withinSummary.setValue(withinSummary.getValue(system, "Weighted STD") / genMap.keySet().size(), system,
                    "Weighted STD");

            acrossSummary.setValue(acrossTable.getWeightedMean(0), system, "Weighted Mean");
            acrossSummary.setValue(acrossTable.getWeightedStd(0), system, "Weighted STD");

        }

        summary.append("# Summary\n\n");
        summary.append("## Within Instances\n\n");
        summary.append(withinSummary.toMarkdown()).append("\n\n");
        summary.append("## Across Instances\n\n");
        summary.append(acrossSummary.toMarkdown()).append("\n\n");
        Utils.saveFile(summary.toString().trim(), "./src/main/java/es/uma/Semantics/", "simpleSummary.md", false);
        return output.toString().trim();
    }

    private static String calculateCoT(Map<String, Map<String, List<String>>> cotPaths) {
        // TODO: Add unimplemented method
        return "";
    }

    public static void calculateSemantics(String dataset) {

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple", dataset);

        String simpleOutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleOutput, "./src/main/java/es/uma/Semantics/", "simpleSemantics.md", false);

        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT", dataset);
        String cotOutput = calculateCoT(cotPaths);
        Utils.saveFile(cotOutput, "./src/main/java/es/uma/Semantics/", "cotSemantics.md", false);
        System.out.println("Semantics metrics calculated and saved.");
    }

}

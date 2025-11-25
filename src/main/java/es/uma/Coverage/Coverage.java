package es.uma.Coverage;

import java.io.File;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Utils;

public class Coverage {

    public static void main(String[] args) {
        calculateCoverage();
    }

    public static void calculateCoverage() {
        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT");

        System.out.println("Calculating Simple Coverage...");
        String simpleOutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleOutput, "./src/main/java/es/uma/Coverage/", "simpleCoverage.md", false);

        System.out.println("Calculating CoT Coverage...");
        String cotOutput = calculateCoT(cotPaths);
        Utils.saveFile(cotOutput, "./src/main/java/es/uma/Coverage/", "cotCoverage.md", false);
        System.out.println("Coverage metrics calculated and saved.");
    }

    private static String calculateSimple(Map<String, Map<String, List<String>>> paths) {
        StringBuilder output = new StringBuilder();
        output.append("# Simple\n\n");

        CoverageMetrics totalMetrics = new CoverageMetrics();

        for (String system : paths.keySet()) {
            output.append("## ").append(system).append("\n\n");

            String systemContent = Utils
                    .readFile("./src/main/resources/prompts/" + system.toLowerCase() + "/diagram.use");
            Map<String, List<String>> systemAttributes = Extractor.getModelAttributes(systemContent);

            int sysDefinedCls = systemAttributes.keySet().size();
            int sysDefinedAttr = systemAttributes.values().stream().mapToInt(List::size).sum();
            int sysDefinedRel = 0; // TODO: Implement relationship extraction

            Map<String, List<String>> genPaths = paths.get(system);
            CoverageMetrics systemMetrics = new CoverageMetrics();

            for (String gen : genPaths.keySet()) {
                output.append("### ").append(gen).append("\n\n");

                String filePath = genPaths.get(gen).get(0);
                String instance = Utils.readFile(filePath);
                var instanceAttributes = Extractor.getAllInstanceAttributes(instance, systemContent);

                CoverageMetrics instanceMetrics = new CoverageMetrics();
                instanceMetrics.definedCls = sysDefinedCls;
                instanceMetrics.definedAttr = sysDefinedAttr;
                instanceMetrics.definedRel = sysDefinedRel;
                instanceMetrics.calculate(instanceAttributes, systemAttributes, instance);

                systemMetrics.add(instanceMetrics);

                output.append(instanceMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
                output.append(instanceMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
                output.append(instanceMetrics.getUncoveredListString());
            }

            output.append("### ALL Gen \n\n");
            output.append(systemMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
            output.append(systemMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
            output.append(systemMetrics.getUncoveredListString());

            totalMetrics.add(systemMetrics);
        }

        output.append("# Coverage \n\n");
        output.append(totalMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
        output.append(totalMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
        output.append(totalMetrics.getUncoveredListString());

        return output.toString();
    }

    private static String calculateCoT(Map<String, Map<String, List<String>>> paths) {
        StringBuilder output = new StringBuilder();
        output.append("# CoT\n\n");

        CoverageMetrics totalMetrics = new CoverageMetrics();

        for (String system : paths.keySet()) {
            output.append("## ").append(system).append("\n\n");

            String systemContent = Utils
                    .readFile("./src/main/resources/prompts/" + system.toLowerCase() + "/diagram.use");
            Map<String, List<String>> systemAttributes = Extractor.getModelAttributes(systemContent);

            int sysDefinedCls = systemAttributes.keySet().size();
            int sysDefinedAttr = systemAttributes.values().stream().mapToInt(List::size).sum();
            int sysDefinedRel = 0; // TODO: Implement relationship extraction

            Map<String, List<String>> genPaths = paths.get(system);
            CoverageMetrics systemMetrics = new CoverageMetrics();

            for (String gen : genPaths.keySet()) {
                output.append("### ").append(gen).append("\n\n");

                List<String> categoryFiles = genPaths.get(gen);
                CoverageMetrics genMetrics = new CoverageMetrics();

                for (String filePath : categoryFiles) {
                    String category = new File(filePath).getName().replace(".soil", "");
                    output.append("#### ").append(category).append("\n\n");

                    String instance = Utils.readFile(filePath);
                    // Map<className, Map<attributeName, List<values>>>
                    var instanceAttributes = Extractor.getAllInstanceAttributes(instance, systemContent);

                    CoverageMetrics categoryMetrics = new CoverageMetrics();
                    categoryMetrics.definedCls = sysDefinedCls;
                    categoryMetrics.definedAttr = sysDefinedAttr;
                    categoryMetrics.definedRel = sysDefinedRel;
                    categoryMetrics.calculate(instanceAttributes, systemAttributes, instance);

                    genMetrics.add(categoryMetrics);

                    output.append(categoryMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
                    output.append(categoryMetrics.toInstantiationTable("Instantiation Stats").toMarkdown())
                            .append("\n\n");
                    output.append(categoryMetrics.getUncoveredListString());
                }

                output.append("#### ALL Categories\n\n");
                output.append(genMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
                output.append(genMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
                output.append(genMetrics.getUncoveredListString());

                systemMetrics.add(genMetrics);
            }

            output.append("### ALL Gen \n\n");
            output.append(systemMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
            output.append(systemMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
            output.append(systemMetrics.getUncoveredListString());

            totalMetrics.add(systemMetrics);
        }

        output.append("# Coverage \n\n");
        output.append(totalMetrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
        output.append(totalMetrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
        output.append(totalMetrics.getUncoveredListString());

        return output.toString();
    }
}

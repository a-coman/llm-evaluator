package es.uma.Coverage;

import java.io.File;
import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Utils;

public class Coverage {

    private static final String PROMPTS_PATH = "./src/main/resources/prompts/";
    private static final String OUTPUT_PATH = "./src/main/java/es/uma/Coverage/";

    public static void main(String[] args) {
        calculateCoverage();
    }

    public static void calculateCoverage() {
        System.out.println("Calculating Simple Coverage...");
        String simpleOutput = calculate("Simple");
        Utils.saveFile(simpleOutput, OUTPUT_PATH, "simpleCoverage.md", false);

        System.out.println("Calculating CoT Coverage...");
        String cotOutput = calculate("CoT");
        Utils.saveFile(cotOutput, OUTPUT_PATH, "cotCoverage.md", false);

        System.out.println("Coverage metrics calculated and saved.");
    }

    private static String calculate(String type) {
        Boolean isCoT = type.toLowerCase().equals("cot");

        Map<String, Map<String, List<String>>> paths = Utils.getPaths(type);
        StringBuilder output = new StringBuilder();
        output.append("# ").append(type).append("\n\n");

        CoverageMetrics totalMetrics = new CoverageMetrics();

        for (Map.Entry<String, Map<String, List<String>>> systemEntry : paths.entrySet()) {
            String system = systemEntry.getKey();
            output.append("## ").append(system).append("\n\n");

            SystemModel model = new SystemModel(system);
            CoverageMetrics systemMetrics = processSystem(systemEntry.getValue(), model, output, isCoT);

            appendMetricsSummary(output, systemMetrics, "### ALL Gen");
            totalMetrics.add(systemMetrics);
        }

        appendMetricsSummary(output, totalMetrics, "# Coverage");
        return output.toString();
    }

    private static CoverageMetrics processSystem(Map<String, List<String>> genPaths, SystemModel model,
            StringBuilder output, Boolean isCoT) {
        CoverageMetrics systemMetrics = new CoverageMetrics();

        for (Map.Entry<String, List<String>> genEntry : genPaths.entrySet()) {
            String gen = genEntry.getKey();
            List<String> files = genEntry.getValue();
            output.append("### ").append(gen).append("\n\n");

            CoverageMetrics genMetrics = isCoT
                    ? processCoTFiles(files, model, output)
                    : processSimpleFile(files.get(0), model);

            if (isCoT) {
                appendMetricsSummary(output, genMetrics, "#### ALL Categories");
            } else {
                appendMetrics(output, genMetrics);
            }

            systemMetrics.add(genMetrics);
        }

        return systemMetrics;
    }

    private static CoverageMetrics processSimpleFile(String filePath, SystemModel model) {
        String instance = Utils.readFile(filePath);
        return calculateMetrics(instance, model);
    }

    private static CoverageMetrics processCoTFiles(List<String> files, SystemModel model, StringBuilder output) {
        CoverageMetrics genMetrics = new CoverageMetrics();

        for (String filePath : files) {
            String category = new File(filePath).getName().replace(".soil", "");
            output.append("#### ").append(category).append("\n\n");

            String instance = Utils.readFile(filePath);
            CoverageMetrics categoryMetrics = calculateMetrics(instance, model);

            appendMetrics(output, categoryMetrics);
            genMetrics.add(categoryMetrics);
        }

        return genMetrics;
    }

    private static CoverageMetrics calculateMetrics(String instance, SystemModel model) {
        var instanceAttributes = Extractor.getAllInstanceAttributes(instance, model.content);
        CoverageMetrics metrics = new CoverageMetrics();
        metrics.calculate(instanceAttributes, model.attributes, instance, model.relationships);
        return metrics;
    }

    private static void appendMetrics(StringBuilder output, CoverageMetrics metrics) {
        output.append(metrics.toTable("Model Coverage").toMarkdown()).append("\n\n");
        output.append(metrics.toInstantiationTable("Instantiation Stats").toMarkdown()).append("\n\n");
        output.append(metrics.getUncoveredListString());
        output.append(metrics.getHallucinationListString());
    }

    private static void appendMetricsSummary(StringBuilder output, CoverageMetrics metrics, String header) {
        output.append(header).append(" \n\n");
        appendMetrics(output, metrics);
    }

    /** Holds preloaded model data to avoid repeated file reads and parsing */
    private static class SystemModel {
        final String content;
        final Map<String, List<String>> attributes;
        final List<String> relationships;

        SystemModel(String system) {
            this.content = Utils.readFile(PROMPTS_PATH + system.toLowerCase() + "/diagram.use");
            this.attributes = Extractor.getModelAttributes(content);
            this.relationships = Extractor.getModelRelationships(content);
        }
    }
}

package es.uma.Semantics;

import java.util.List;
import java.util.Map;

import es.uma.Utils;

public class Semantics {

    private static final String interpretationText = "";

    private static String calculateSimple(Map<String, Map<String, List<String>>> simplePaths) {

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
            
            SemanticMetrics systemMetrics = new SemanticMetrics();

            // Whithin instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                Map<String, List<String>> attributes = Extractor.getAttributes(instance, attributeNames); // attributeName, listOfValues

                SemanticMetrics genMetrics = new SemanticMetrics();

                genMetrics.addAttributesMap(attributes);
                systemMetrics.addAttributesMap(attributes);

                output.append("### " + gen + "\n\n");
                System.out.println("Calculating within " + system + "/" + gen + "...");
                List<Table> genTables = genMetrics.calculate();
                for (Table table : genTables) {
                    output.append(table.toMarkdown()).append("\n\n");
                }
            }

            // Across instances
            output.append("### ALL Gen\n\n");
            System.out.println("Calculating across " + system + "...");
            List<Table> systemTables = systemMetrics.calculate();
            for (Table table : systemTables) {
                output.append(table.toMarkdown()).append("\n\n");
            }

        }

        return output.toString().trim();
    }
    
    public static void calculateSemantics() {

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        
        String simpleOutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleOutput, "./src/main/java/es/uma/Semantics/", "simpleSemantics.md", false);
    }
    
}

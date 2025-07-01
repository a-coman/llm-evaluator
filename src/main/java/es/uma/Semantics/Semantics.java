package es.uma.Semantics;

import java.util.List;
import java.util.Map;

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
            
            Table systemTable = new Table(system, genMap.keySet().toArray(new String[0]), attributeNames.toArray(new String[0]));
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
                    systemTable.setData(table.getTopDiagStats().mean, gen, table.getTitle());
                }
            }

            // Across instances
            output.append("### ALL Gen detailed\n\n");
            System.out.println("Calculating across " + system + "...");
            List<Table> systemTables = systemMetrics.calculate();
            
            String[] allGenRowHeader = new String[] {"Across Gen"};
            Table acrossTable = new Table(system, allGenRowHeader, attributeNames.toArray(new String[0]));

            for (Table table : systemTables) {
                output.append(table.toMarkdown()).append("\n\n");
                acrossTable.setData(table.getTopDiagStats().mean, allGenRowHeader[0], table.getTitle());
            }

            output.append("### ALL Gen top-diag mean\n\n");
            output.append(systemTable.toMarkdown()).append("\n\n");
            output.append(acrossTable.toMarkdown()).append("\n\n");

        }

        return output.toString().trim();
    }
    
    public static void calculateSemantics() {

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        
        String simpleOutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleOutput, "./src/main/java/es/uma/Semantics/", "simpleSemantics.md", false);
    }
    
}

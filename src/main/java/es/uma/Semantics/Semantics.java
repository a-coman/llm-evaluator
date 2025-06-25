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

            List<String> attributes = (domain != null) ? domain.getAttributes() : List.of();
            
            output.append("## " + system + "\n\n");
            Map<String, List<String>> genMap = simplePaths.get(system);
            
            SemanticMetrics systemMetrics = new SemanticMetrics();

            // Construct table header
            output.append("| Generations | ");
            for (String attribute : attributes) {
                output.append(attribute).append(" | ");
            }
            output.append("\n");
            for (int i = 0; i < attributes.size()+1; i++) {
                output.append("|---");
            }
            output.append("|\n");


            // Within instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
        
                Map<String, List<String>> attributeValues = Extractor.getAttributes(instance, attributes); // attributeName, listOfValues
                
                SemanticMetrics genMetrics = new SemanticMetrics();
                
                for (String attribute : attributeValues.keySet()) {
                    List<String> valuesList = attributeValues.get(attribute);
                    genMetrics.addAttribute(attribute, valuesList);
                    systemMetrics.addAttribute(attribute, valuesList);
                }


                System.out.println("Calculating within " + system + "/" + gen + "...");
                SemanticResult result = genMetrics.calculate();
                output.append(result.toMarkdownRow(gen)).append("\n");

                System.out.println(result.toString());
                System.out.println(genMetrics.toString());

            }
            
            // Across instances
            System.out.println("Calculating across " + system + "...");
            SemanticResult systemResult = systemMetrics.calculate();
            output.append(systemResult.toMarkdownRow("ALL Gen")).append("\n\n");

            
            System.out.println(systemMetrics.toString());


        }

        return output.toString().trim();
    }
    

    public static void calculateSemantics() {
        // Reset the output file
        Utils.saveFile("", "./src/main/java/es/uma/Semantics/", "matrix.md", false);

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        
        String simpleoutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleoutput, "./src/main/java/es/uma/Semantics/", "simpleSemantics.md", false);
    }
    
}

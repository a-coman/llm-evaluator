package es.uma.Shannon;

import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;
import es.uma.Utils;

public class Shannon {
    private static String calculateSimple(Map<String, Map<String, List<String>>> simplePaths) {
    
        StringBuilder output = new StringBuilder();
        
        output.append("# Simple\n\n");
        
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
            ShannonMetrics systemMetrics = new ShannonMetrics();

            // Whithin instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                Map<String, List<String>> attributes = Extractor.getAttributes(instance, attributeNames); // attributeName, listOfValues

                systemTable.setColumnsNumberAttributes(gen, attributes);

                ShannonMetrics genMetrics = new ShannonMetrics();

                genMetrics.addAttributesMap(attributes, system);
                systemMetrics.addAttributesMap(attributes, system);

                output.append("### " + gen + "\n\n");
                System.out.println("Calculating within " + system + "/" + gen + "...");

                List<Table> genTables = genMetrics.calculate();
                for (Table table : genTables) {
                    output.append(table.toMarkdown()).append("\n\n");
                }
            }

            // Across instances
            output.append("### ALL Gen \n\n");
            System.out.println("Calculating across " + system + "...");
            List<Table> systemTables = systemMetrics.calculate();
            for (Table table : systemTables) {
                output.append(table.toMarkdown()).append("\n\n");
            }
            
        }
        
        return output.toString();
    }

    public static void calculateShannon() {

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        
        String simpleOutput = calculateSimple(simplePaths);
        Utils.saveFile(simpleOutput, "./src/main/java/es/uma/Shannon/", "simpleShannon.md", false);
    }

    public static void main(String[] args) {
        calculateShannon();
        System.out.println("Shannon metrics calculated and saved.");
    }
}


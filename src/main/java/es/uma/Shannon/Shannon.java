package es.uma.Shannon;

import java.util.List;
import java.util.Map;

import es.uma.Extractor;
import es.uma.Table;
import es.uma.Utils;

public class Shannon {
    private static String calculateSimple(Map<String, Map<String, List<String>>> simplePaths) {
    
        StringBuilder summary = new StringBuilder();
        String[] summaryHeader = new String[] {"Weighted Mean", "Weighted STD"};
        String[] summaryRows = simplePaths.keySet().toArray(new String[0]);
        Table withinSummary = new Table("Within", summaryRows, summaryHeader);
        Table acrossSummary = new Table("Across", summaryRows, summaryHeader);

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
            SemanticMetrics systemMetrics = new SemanticMetrics();

            // Whithin instances
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instance = Utils.readFile(filePath);
                Map<String, List<String>> attributes = Extractor.getAttributes(instance, attributeNames); // attributeName, listOfValues

                systemTable.setColumnsNumberAttributes(gen, attributes);

                SemanticMetrics genMetrics = new SemanticMetrics();
                // Calculate metrics for the generation
                // ...
            }
            
            output.append(systemTable.toMarkdown()).append("\n");
        }
        
        return output.toString();
    }
}

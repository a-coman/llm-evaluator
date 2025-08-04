package es.uma;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Extractor {

    private static List<String> getAttribute(String instance, String attribute) {
        // Attribute is in the form of -> "ClassName.attribute"
        String[] parts = attribute.split("\\.");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Attribute must be in the format ClassName.attribute");
        }
        String className = parts[0];
        String attrName = parts[1];

        // Find all instance names for the class
        String instancePattern = "!new " + className + "\\('([^']+)'\\)";
        List<String> instanceNames = Utils.match(instance, instancePattern);

        // For each instance, find the attribute value
        List<String> result = instanceNames.stream()
            .map(name -> {
                String attrPattern = "!" + name + "\\." + attrName + "\\s*:=\\s*(\\S+)";
                List<String> values = Utils.match(instance, attrPattern);
                return values.stream()
                    .map(s -> s.replaceAll("^'|'$", "")) // Remove leading/trailing quotes
                    .collect(Collectors.toList());
            })
            .flatMap(List::stream)
            .collect(Collectors.toList());

        return result;
    }

    public static Map<String, List<String>> getAttributes(String instance, List<String> attributes) {
        if (instance == null || instance.isEmpty() || attributes == null || attributes.isEmpty()) {
            throw new IllegalArgumentException("Instance and attributes must not be null or empty");
        }

        Map<String, List<String>> instanceAttributes = new LinkedHashMap<>();
        for (String attribute : attributes) {
            List<String> values = getAttribute(instance, attribute);
            instanceAttributes.put(attribute, values);
        }

        return instanceAttributes;
    }

    public static void main(String[] args) {
        String instancePath = "src/main/resources/dataset/Simple/AddressBook/21-03-2025--17-36-43/gen1/output.soil";
        String instance = Utils.readFile(instancePath);
        
        System.out.println(getAttributes(instance, List.of("Relationship.type")));

    }
}

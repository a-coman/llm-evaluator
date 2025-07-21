package es.uma;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Extractor {

    private static List<String> getAttribute(String instance, String attribute) {
        String pattern = "\\." + attribute + "\\s*:\\s*=\\s*'([^']*)'";
        return Utils.match(instance, pattern);
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
        String instancePath = "src/main/resources/dataset/CoT/Bank/24-03-2025--21-13-02/gen2/baseline.soil";
        String instance = Utils.readFile(instancePath);
        
        System.out.println(getAttributes(instance, List.of("country", "name", "bic", "iban", "firstName", "lastName")));

    }
}

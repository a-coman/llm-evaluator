package es.uma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {

    private static final Pattern NEW_INSTANCE_PATTERN = Pattern.compile("!new\\s+(\\w+)\\('([^']+)'\\)");
    private static final Pattern INSTANCE_ATTRIBUTE_PATTERN = Pattern.compile("!(\\w+)\\.(\\w+)\\s*:=\\s*(?:'([^']*)'|(\\S+))");

    // attributes => Map<className, List<attributeName>>
    public static Map<String, Map<String, List<String>>> getInstanceAttributes(String instance,
            Map<String, List<String>> attributes) {

        if (instance == null || instance.isEmpty() || attributes == null || attributes.isEmpty()) {
            throw new IllegalArgumentException("Instance and attributes must not be null or empty");
        }

        // Map<className, Map<attributeName, List<values>>>
        Map<String, Map<String, List<String>>> instanceAttributes = new LinkedHashMap<>();
        attributes.forEach((cls, attrList) -> {
            Map<String, List<String>> attrMap = instanceAttributes.computeIfAbsent(cls, k -> new LinkedHashMap<>());
            attrList.forEach(attr -> attrMap.computeIfAbsent(attr, k -> new ArrayList<>()));
        });

        Map<String, String> instanceToClass = new HashMap<>();
        Matcher newMatcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (newMatcher.find()) {
            instanceToClass.put(newMatcher.group(2), newMatcher.group(1));
        }

        Map<String, Set<String>> targetAttrs = new HashMap<>();
        attributes.forEach((cls, attrList) -> targetAttrs.put(cls, new HashSet<>(attrList)));

        Matcher attrMatcher = INSTANCE_ATTRIBUTE_PATTERN.matcher(instance);
        while (attrMatcher.find()) {
            String instanceName = attrMatcher.group(1);
            String attrName = attrMatcher.group(2);
            String rawValue = attrMatcher.group(3) != null ? attrMatcher.group(3) : attrMatcher.group(4);
            String className = instanceToClass.get(instanceName);
            if (className == null) {
                continue;
            }
            Set<String> wanted = targetAttrs.get(className);
            if (wanted == null || !wanted.contains(attrName)) {
                continue;
            }
            instanceAttributes.get(className).get(attrName).add(rawValue);
        }

        return instanceAttributes;
    }

    // specs => List of "ClassName.attributeName" strings
    public static Map<String, List<String>> getInstanceAttributes(String instance, List<String> specs) {
        Map<String, List<String>> attrsMap = new LinkedHashMap<>();
        for (String spec : specs) {
            int dot = spec.indexOf('.');
            if (dot <= 0 || dot == spec.length() - 1)
                continue;
            String cls = spec.substring(0, dot);
            String attr = spec.substring(dot + 1);
            attrsMap.computeIfAbsent(cls, k -> new ArrayList<>()).add(attr);
        }

        Map<String, Map<String, List<String>>> listOfAttributes = getInstanceAttributes(instance, attrsMap);
        
        // flatAttributes => Map<ClassName.attributeName, List<values>>
        Map<String, List<String>> flatAttributes = new LinkedHashMap<>();
        listOfAttributes.forEach((cls, attrMap) -> {
            attrMap.forEach((attr, values) -> {
                flatAttributes.put(cls + "." + attr, values);
            });
        });
        return flatAttributes;
    }



    // Main for testing purposes
    public static void main(String[] args) {
        String instancePath = "src/main/resources/dataset/Simple/AddressBook/21-03-2025--17-36-43/gen1/output.soil";
        String instance = Utils.readFile(instancePath);

        System.out.println(getInstanceAttributes(instance, Map.of("Relationship", List.of("type"))));

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        for (String system : simplePaths.keySet()) {
            System.out.println("System: " + system);
            Map<String, List<String>> genMap = simplePaths.get(system);
            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instanceContent = Utils.readFile(filePath);

                List<String> specs = List.of(
                        "Contact.name", "Note.author", "Person.firstName", "Person.lastName",
                        "Club.chairman", "Player.name", "Customer.firstName", "Customer.lastName",
                        "Driver.name", "Customer.name", "Person.name", "Individual.name", "Actor.name");
                Map<String, List<String>> attributes = getInstanceAttributes(instanceContent, specs);

                // Print the attributes
                for (List<String> values : attributes.values()) {
                    for (String value : values) {
                        System.out.println(value);
                    }
                }
            }
        }

    }
}

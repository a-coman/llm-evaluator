package es.uma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {

    private static final Pattern NEW_INSTANCE_PATTERN = Pattern.compile("!new\\s+(\\w+)\\('([^']+)'\\)");
    private static final Pattern INSTANCE_ATTRIBUTE_PATTERN = Pattern
            .compile("!(\\w+)\\.(\\w+)\\s*:=\\s*(?:'([^']*)'|(\\S+))");
    private static final Pattern CLASS_DECL_PATTERN = Pattern
            .compile("(?i)^(abstract\\s+)?class\\s+(\\w+)(?:\\s*<\\s*(\\w+))?.*$");
    private static final Pattern INTERFACE_DECL_PATTERN = Pattern
            .compile("(?i)^interface\\s+(\\w+)(?:\\s*<\\s*(\\w+))?.*$");
    private static final Pattern ATTRIBUTE_LINE_PATTERN = Pattern.compile("^(\\w+)\\s*:\\s*.+$");
    private static final Pattern RELATIONSHIP_DECL_PATTERN = Pattern
            .compile("(?i)^(?:association|composition|aggregation)\\s+(\\w+).*$");
    private static final Pattern INSTANCE_RELATIONSHIP_PATTERN = Pattern
            .compile("!insert\\s+\\(.*\\)\\s+into\\s+(\\w+)");

    // Get specific instance attributes
    // attributes => Map<className, List<attributeName>>
    public static Map<String, Map<String, List<String>>> getInstanceAttributes(String instance,
            Map<String, List<String>> attributes) {

        if (instance == null || instance.isEmpty() || attributes == null || attributes.isEmpty()) {
            throw new IllegalArgumentException("Instance and attributes must not be null or empty");
        }

        // Map<className, Map<attributeName, List<values>>>
        Map<String, Map<String, List<String>>> instanceAttributes = new LinkedHashMap<>();

        Map<String, String> instanceToClass = new HashMap<>();
        Matcher newMatcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (newMatcher.find()) {
            instanceToClass.put(newMatcher.group(2), newMatcher.group(1));
        }

        // Initialize map for classes that are present in the instance and requested
        for (String className : instanceToClass.values()) {
            if (attributes.containsKey(className)) {
                instanceAttributes.putIfAbsent(className, new LinkedHashMap<>());
            }
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
            instanceAttributes.computeIfAbsent(className, k -> new LinkedHashMap<>())
                    .computeIfAbsent(attrName, k -> new ArrayList<>()).add(rawValue);
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

    // returns => Map<className, List<attributeName>>
    // Only returns instantiable classes, if inheritence it adds the attributes to
    // the inheriting class
    public static Map<String, List<String>> getModelAttributes(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model must not be null or empty");
        }

        Map<String, ClassDef> classes = new LinkedHashMap<>();
        String[] lines = model.split("\\R");
        ClassDef current = null;
        boolean inAttributes = false;

        for (String rawLine : lines) {
            String line = rawLine.trim();
            if (line.isEmpty() || line.startsWith("--")) {
                continue;
            }

            if (current == null) {
                Matcher classMatcher = CLASS_DECL_PATTERN.matcher(line);
                Matcher interfaceMatcher = INTERFACE_DECL_PATTERN.matcher(line);
                if (classMatcher.matches()) {
                    boolean isAbstract = classMatcher.group(1) != null;
                    String name = classMatcher.group(2);
                    String parent = classMatcher.group(3);
                    current = new ClassDef(name, parent, !isAbstract);
                } else if (interfaceMatcher.matches()) {
                    String name = interfaceMatcher.group(1);
                    String parent = interfaceMatcher.group(2);
                    current = new ClassDef(name, parent, false);
                }
                continue;
            }

            if (line.equalsIgnoreCase("attributes")) {
                inAttributes = true;
                continue;
            }

            if (line.equalsIgnoreCase("end")) {
                classes.put(current.name, current);
                current = null;
                inAttributes = false;
                continue;
            }

            if (inAttributes) {
                Matcher attrMatcher = ATTRIBUTE_LINE_PATTERN.matcher(line);
                if (attrMatcher.matches()) {
                    current.attributes.add(attrMatcher.group(1));
                    continue;
                }
                inAttributes = false;
            }
        }

        Map<String, List<String>> cache = new HashMap<>();
        Map<String, List<String>> result = new LinkedHashMap<>();
        classes.forEach((name, def) -> {
            if (def.instantiable) {
                result.put(name, new ArrayList<>(resolveAttributes(name, classes, cache)));
            }
        });
        return result;
    }

    private static List<String> resolveAttributes(String className, Map<String, ClassDef> classes,
            Map<String, List<String>> cache) {
        if (cache.containsKey(className)) {
            return cache.get(className);
        }
        ClassDef def = classes.get(className);
        if (def == null) {
            List<String> empty = Collections.emptyList();
            cache.put(className, empty);
            return empty;
        }
        LinkedHashSet<String> combined = new LinkedHashSet<>();
        if (def.parent != null) {
            combined.addAll(resolveAttributes(def.parent, classes, cache));
        }
        combined.addAll(def.attributes);
        List<String> resolved = new ArrayList<>(combined);
        cache.put(className, resolved);
        return resolved;
    }

    private static final class ClassDef {
        final String name;
        final String parent;
        final boolean instantiable;
        final List<String> attributes = new ArrayList<>();

        ClassDef(String name, String parent, boolean instantiable) {
            this.name = name;
            this.parent = parent;
            this.instantiable = instantiable;
        }
    }

    // Get all instance attributes
    public static Map<String, Map<String, List<String>>> getAllInstanceAttributes(String instance, String model) {
        var modelAttributes = getModelAttributes(model);
        return getInstanceAttributes(instance, modelAttributes);
    }

    // Get instance counts per class
    public static Map<String, Integer> getInstanceCounts(String instance) {
        Map<String, Integer> instanceCounts = new HashMap<>();
        Matcher matcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (matcher.find()) {
            String className = matcher.group(1);
            instanceCounts.put(className, instanceCounts.getOrDefault(className, 0) + 1);
        }
        return instanceCounts;
    }

    // Get model relationships
    public static List<String> getModelRelationships(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model must not be null or empty");
        }

        List<String> relationships = new ArrayList<>();
        String[] lines = model.split("\\R");

        for (String rawLine : lines) {
            String line = rawLine.trim();
            if (line.isEmpty() || line.startsWith("--")) {
                continue;
            }

            Matcher matcher = RELATIONSHIP_DECL_PATTERN.matcher(line);
            if (matcher.matches()) {
                relationships.add(matcher.group(1));
            }
        }
        return relationships;
    }

    // Get instance relationships counts
    public static Map<String, Integer> getInstanceRelationships(String instance) {
        Map<String, Integer> relationshipCounts = new HashMap<>();
        Matcher matcher = INSTANCE_RELATIONSHIP_PATTERN.matcher(instance);
        while (matcher.find()) {
            String relationshipName = matcher.group(1);
            relationshipCounts.put(relationshipName, relationshipCounts.getOrDefault(relationshipName, 0) + 1);
        }
        return relationshipCounts;
    }

    // Main for testing purposes
    public static void main(String[] args) {
        String instancePath = "src/main/resources/dataset/Simple/AddressBook/21-03-2025--17-36-43/gen1/output.soil";
        String instance = Utils.readFile(instancePath);

        System.out.println(getInstanceAttributes(instance, Map.of("Relationship",
                List.of("type"))));

        String modelPath = "src/main/resources/prompts/addressbook/diagram.use";
        String model = Utils.readFile(modelPath);

        System.out.println(getModelAttributes(model));

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        for (String system : simplePaths.keySet()) {
            System.out.println("\nSystem: " + system);
            String systemContent = Utils
                    .readFile("./src/main/resources/prompts/" + system.toLowerCase() + "/diagram.use");
            var modelAttributes = getModelAttributes(systemContent);
            System.out.println("\nModel-Attributes: " + modelAttributes);
            Map<String, List<String>> genMap = simplePaths.get(system);

            for (String gen : genMap.keySet()) {
                String filePath = genMap.get(gen).get(0); // Single output.soil
                String instanceContent = Utils.readFile(filePath);

                var instanceAttributes = getInstanceAttributes(instanceContent, modelAttributes);
                System.out.println("\nInstance-Attributes " + gen + ": " + instanceAttributes);

            }
        }

    }

    // Get all instance attributes without filtering by model
    public static Map<String, Map<String, List<String>>> getRawInstanceAttributes(String instance) {
        Map<String, Map<String, List<String>>> instanceAttributes = new LinkedHashMap<>();
        Map<String, String> instanceToClass = new HashMap<>();

        Matcher newMatcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (newMatcher.find()) {
            instanceToClass.put(newMatcher.group(2), newMatcher.group(1));
        }

        Matcher attrMatcher = INSTANCE_ATTRIBUTE_PATTERN.matcher(instance);
        while (attrMatcher.find()) {
            String instanceName = attrMatcher.group(1);
            String attrName = attrMatcher.group(2);
            String rawValue = attrMatcher.group(3) != null ? attrMatcher.group(3) : attrMatcher.group(4);

            String className = instanceToClass.get(instanceName);
            if (className == null)
                continue;

            instanceAttributes.computeIfAbsent(className, k -> new LinkedHashMap<>())
                    .computeIfAbsent(attrName, k -> new ArrayList<>()).add(rawValue);
        }
        return instanceAttributes;
    }
}

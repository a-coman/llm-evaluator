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

    // ==================== Patterns ====================

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

    // ==================== Instance Attribute Extraction ====================

    /**
     * Get instance attributes filtered by specified class-attribute mappings.
     * 
     * @param instance   {@code The SOIL instance content}
     * @param attributes {@code Map<className, List<attributeName to extract>>}
     * @return {@code Map<className, Map<attributeName, List<values>>>}
     */
    public static Map<String, Map<String, List<String>>> getInstanceAttributes(String instance,
            Map<String, List<String>> attributes) {

        validateNotEmpty(instance, "Instance");
        validateNotEmpty(attributes, "Attributes");

        Map<String, String> instanceToClass = buildInstanceToClassMap(instance);
        Map<String, Map<String, List<String>>> result = new LinkedHashMap<>();

        // Initialize map for classes present in both instance and requested attributes
        instanceToClass.values().stream()
                .filter(attributes::containsKey)
                .forEach(cls -> result.putIfAbsent(cls, new LinkedHashMap<>()));

        Map<String, Set<String>> targetAttrs = new HashMap<>();
        attributes.forEach((cls, attrList) -> targetAttrs.put(cls, new HashSet<>(attrList)));

        Matcher attrMatcher = INSTANCE_ATTRIBUTE_PATTERN.matcher(instance);
        while (attrMatcher.find()) {
            String instanceName = attrMatcher.group(1);
            String attrName = attrMatcher.group(2);
            String rawValue = attrMatcher.group(3) != null ? attrMatcher.group(3) : attrMatcher.group(4);

            String className = instanceToClass.get(instanceName);
            if (className == null)
                continue;

            Set<String> wanted = targetAttrs.get(className);
            if (wanted == null || !wanted.contains(attrName))
                continue;

            result.computeIfAbsent(className, k -> new LinkedHashMap<>())
                    .computeIfAbsent(attrName, k -> new ArrayList<>())
                    .add(rawValue);
        }

        return result;
    }

    /**
     * Get instance attributes by specification strings (e.g.,
     * "ClassName.attributeName").
     * 
     * @param instance {@code The SOIL instance content}
     * @param specs    {@code List of "ClassName.attributeName" strings specifying attributes to extract}
     * @return {@code Map<ClassName.attributeName, List<values>>}
     */
    public static Map<String, List<String>> getInstanceAttributes(String instance, List<String> specs) {
        Map<String, List<String>> attrsMap = new LinkedHashMap<>();
        for (String spec : specs) {
            int dot = spec.indexOf('.');
            if (dot <= 0 || dot == spec.length() - 1)
                continue;
            attrsMap.computeIfAbsent(spec.substring(0, dot), k -> new ArrayList<>())
                    .add(spec.substring(dot + 1));
        }

        Map<String, List<String>> flatResult = new LinkedHashMap<>();
        getInstanceAttributes(instance, attrsMap)
                .forEach((cls, attrMap) -> attrMap.forEach((attr, values) -> flatResult.put(cls + "." + attr, values)));
        return flatResult;
    }

    /**
     * Get all instance attributes filtered by model definitions.
     */
    public static Map<String, Map<String, List<String>>> getAllInstanceAttributes(String instance, String model) {
        return getInstanceAttributes(instance, getModelAttributes(model));
    }

    /**
     * Get all instance attributes without filtering by model definition (raw
     * extraction).
     */
    public static Map<String, Map<String, List<String>>> getRawInstanceAttributes(String instance) {
        Map<String, Map<String, List<String>>> result = new LinkedHashMap<>();
        Map<String, String> instanceToClass = buildInstanceToClassMap(instance);

        Matcher attrMatcher = INSTANCE_ATTRIBUTE_PATTERN.matcher(instance);
        while (attrMatcher.find()) {
            String instanceName = attrMatcher.group(1);
            String className = instanceToClass.get(instanceName);
            if (className == null)
                continue;

            String attrName = attrMatcher.group(2);
            String rawValue = attrMatcher.group(3) != null ? attrMatcher.group(3) : attrMatcher.group(4);

            result.computeIfAbsent(className, k -> new LinkedHashMap<>())
                    .computeIfAbsent(attrName, k -> new ArrayList<>())
                    .add(rawValue);
        }
        return result;
    }

    // ==================== Model Extraction ====================

    /**
     * Extract model attributes (only instantiable classes, with inheritance
     * resolved).
     * 
     * @return Map of className -> list of attribute names
     */
    public static Map<String, List<String>> getModelAttributes(String model) {
        validateNotEmpty(model, "Model");

        Map<String, ClassDef> classes = parseClassDefinitions(model);
        Map<String, List<String>> cache = new HashMap<>();
        Map<String, List<String>> result = new LinkedHashMap<>();

        classes.forEach((name, def) -> {
            if (def.instantiable) {
                result.put(name, new ArrayList<>(resolveAttributes(name, classes, cache)));
            }
        });
        return result;
    }

    /**
     * Extract model relationship names.
     */
    public static List<String> getModelRelationships(String model) {
        validateNotEmpty(model, "Model");

        List<String> relationships = new ArrayList<>();
        for (String line : model.split("\\R")) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("--"))
                continue;

            Matcher matcher = RELATIONSHIP_DECL_PATTERN.matcher(trimmed);
            if (matcher.matches()) {
                relationships.add(matcher.group(1));
            }
        }
        return relationships;
    }

    // ==================== Instance Counting ====================

    /**
     * Count class instances in SOIL content.
     */
    public static Map<String, Integer> getInstanceCounts(String instance) {
        Map<String, Integer> counts = new HashMap<>();
        Matcher matcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (matcher.find()) {
            counts.merge(matcher.group(1), 1, Integer::sum);
        }
        return counts;
    }

    /**
     * Count relationship instances in SOIL content.
     */
    public static Map<String, Integer> getInstanceRelationships(String instance) {
        Map<String, Integer> counts = new HashMap<>();
        Matcher matcher = INSTANCE_RELATIONSHIP_PATTERN.matcher(instance);
        while (matcher.find()) {
            counts.merge(matcher.group(1), 1, Integer::sum);
        }
        return counts;
    }

    // ==================== Private Helpers ====================

    private static Map<String, String> buildInstanceToClassMap(String instance) {
        Map<String, String> map = new HashMap<>();
        Matcher matcher = NEW_INSTANCE_PATTERN.matcher(instance);
        while (matcher.find()) {
            map.put(matcher.group(2), matcher.group(1));
        }
        return map;
    }

    private static Map<String, ClassDef> parseClassDefinitions(String model) {
        Map<String, ClassDef> classes = new LinkedHashMap<>();
        ClassDef current = null;
        boolean inAttributes = false;

        for (String rawLine : model.split("\\R")) {
            String line = rawLine.trim();
            if (line.isEmpty() || line.startsWith("--"))
                continue;

            if (current == null) {
                current = tryParseClassDeclaration(line);
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
                } else {
                    inAttributes = false;
                }
            }
        }

        // Handle incomplete class definition (missing 'end' keyword)
        if (current != null) {
            System.err.println("Warning: Model file has incomplete class definition for '" + current.name
                    + "' (missing 'end' keyword)");
            classes.put(current.name, current);
        }

        return classes;
    }

    private static ClassDef tryParseClassDeclaration(String line) {
        Matcher classMatcher = CLASS_DECL_PATTERN.matcher(line);
        if (classMatcher.matches()) {
            boolean isAbstract = classMatcher.group(1) != null;
            return new ClassDef(classMatcher.group(2), classMatcher.group(3), !isAbstract);
        }

        Matcher interfaceMatcher = INTERFACE_DECL_PATTERN.matcher(line);
        if (interfaceMatcher.matches()) {
            return new ClassDef(interfaceMatcher.group(1), interfaceMatcher.group(2), false);
        }
        return null;
    }

    private static List<String> resolveAttributes(String className, Map<String, ClassDef> classes,
            Map<String, List<String>> cache) {
        if (cache.containsKey(className))
            return cache.get(className);

        ClassDef def = classes.get(className);
        if (def == null) {
            cache.put(className, Collections.emptyList());
            return Collections.emptyList();
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

    private static void validateNotEmpty(String value, String name) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(name + " must not be null or empty");
        }
    }

    private static void validateNotEmpty(Map<?, ?> value, String name) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(name + " must not be null or empty");
        }
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

    // ==================== Main for Testing ====================

    public static void main(String[] args) {
        String instancePath = "src/main/resources/dataset/Simple/AddressBook/21-03-2025--17-36-43/gen1/output.soil";
        String instance = Utils.readFile(instancePath);

        System.out.println(getInstanceAttributes(instance, Map.of("Relationship", List.of("type"))));

        String modelPath = "src/main/resources/prompts/addressbook/diagram.use";
        String model = Utils.readFile(modelPath);

        System.out.println(getModelAttributes(model));
    }
}

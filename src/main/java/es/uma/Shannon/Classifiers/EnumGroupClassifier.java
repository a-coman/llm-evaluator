package es.uma.Shannon.Classifiers;

import java.util.ArrayList;
import java.util.List;

import es.uma.Utils;
import es.uma.Shannon.GroupClassifier;

public class EnumGroupClassifier implements GroupClassifier {

    private List<String> groups;
    private String className;
    private String attributeName;
    private String system;

    public EnumGroupClassifier(String attribute, String system) {
        this.groups = new ArrayList<>();
        String[] parts = attribute.split("\\.");
        this.className = parts[0]; // Get the class name before the dot
        this.attributeName = parts[1]; // Get the attribute name after the dot
        this.system = system;
    }

    private String getClassDiagram(String system) {
        String filePath = "src/main/resources/prompts/" + system + "/diagram.use";
        return Utils.readFile(filePath);
    }

    @Override
    public List<String> getGroups() {

        String classDiagram = getClassDiagram(system);
        
        // Get the class definition body from the class diagram
        String classDefinitionPattern = "class\\s+" + className + "([\\s\\S]*?)end";
        String classBody = Utils.match(classDiagram, classDefinitionPattern).get(0); // Only one match for that class name
        if (classBody == null || classBody.isEmpty()) {
            throw new IllegalArgumentException("Class " + className + " not found in the class diagram of " + system + ".");
        }

        // Get the enum name from the attribute type from the class body
        String enumNamePattern = attributeName + "\\s*:\\s*([A-Za-z0-9_]+)";
        String enumName = Utils.match(classBody, enumNamePattern).get(0); // Only one match for that attribute name
        if (enumName == null || enumName.isEmpty()) {
            throw new IllegalArgumentException("Attribute " + attributeName + " not found in class "+ className + " of " + system + ".");
        }

        // Get the enum groups from the class diagram
        String enumGroupsPattern = "enum\\s+" + enumName + "\\s*\\{([^}]*)\\}";
        String enumGroupsBody = Utils.match(classDiagram, enumGroupsPattern).get(0);
        if (enumGroupsBody == null || enumGroupsBody.isEmpty()) {
            throw new IllegalArgumentException("Enum " + enumName + " not found in the class diagram of " + system + ".");
        }

        // Extract the individual enum group names
        String[] groupsArray = enumGroupsBody.replaceAll("\\s+", "").split(",");

        return List.of(groupsArray);
    }

    @Override
    public String classify(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'classify'");
    }

    // Main for testing
    public static void main(String[] args) {
        EnumGroupClassifier classifier = new EnumGroupClassifier("Note.type", "addressbook");
        List<String> groups = classifier.getGroups();
        System.out.println(groups);
    }
}

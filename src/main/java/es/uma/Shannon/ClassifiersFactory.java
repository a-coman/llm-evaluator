package es.uma.Shannon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uma.Shannon.Classifiers.AgeGroupClassifier;

public class ClassifiersFactory {
    public static GroupClassifier getClassifier(String attribute) {
        switch (attribute.toLowerCase()) {
            case "age":
                return new AgeGroupClassifier();

            default:
                throw new IllegalArgumentException("Unknown classifier type: " + attribute);
        }
    }

    public static Map<String, GroupClassifier> getAllClassifiers(List<String> attributes) {
        Map<String, GroupClassifier> classifiers = new HashMap<>();

        for (String attribute : attributes) {
            classifiers.put(attribute, getClassifier(attribute));
        }
        return classifiers;
    }
}

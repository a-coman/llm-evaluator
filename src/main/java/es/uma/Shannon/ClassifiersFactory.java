package es.uma.Shannon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uma.Shannon.Classifiers.AgeGroupClassifier;
import es.uma.Shannon.Classifiers.EnumGroupClassifier;

public class ClassifiersFactory {

    private static boolean isEnum(String attribute) {
        List<String> enumAttributes = List.of(
            "Note.type", 
            "Relationship.type", 
            "MatchEvent.eventType", 
            "Player.bestFoot", 
            "Position.positionName", 
            "Bill.paymentMethod", 
            "Bill.status", 
            "Shipment.status", 
            "Individual.seating", 
            "Banquet.paymentMethod", 
            "MenuItem.classification", 
            "FoodItem.unit", 
            "Allergen.type", 
            "RegularCustomer.prefferedLanguage",
            "Individual.driverLicenseState",
            "Movie.genre",
            "Series.genre"
        );

        return enumAttributes.contains(attribute);
    }

    public static GroupClassifier getClassifier(String attribute, String system) {

        if (isEnum(attribute)) {
            return new EnumGroupClassifier(attribute, system);
        }

        // If enum -> generic classifier, otherwise specific 

        switch (attribute) {
            case "Person.age":
                return new AgeGroupClassifier();

            default:
                throw new IllegalArgumentException("Unknown classifier type: " + attribute);
        }
    }

    // public static Map<String, GroupClassifier> getAllClassifiers(List<String> attributes) {
    //     Map<String, GroupClassifier> classifiers = new HashMap<>();

    //     for (String attribute : attributes) {
    //         classifiers.put(attribute, getClassifier(attribute));
    //     }
    //     return classifiers;
    // }
}

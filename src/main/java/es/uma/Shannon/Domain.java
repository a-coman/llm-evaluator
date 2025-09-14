package es.uma.Shannon;

import java.util.List;

public enum Domain {
    // Attribute should be in the form of -> "ClassName.attribute"

    //EXAMPLE1(List.of("Person.age")),
    //EXAMPLE2(List.of("Person.age")),
    //EXAMPLE3(List.of("Person.age")),
    // BANK (List.of("country", "bic", "iban", "balance", "age")),
    // HOTELMANAGEMENT(List.of()),
    // STATEMACHINE(List.of()),
    ADDRESSBOOK(List.of("Note.type", "Relationship.type")),
    MYEXPENSES(List.of("Bill.paymentMethod", "Bill.status")),
    PICKUPNET(List.of("Shipment.status")),
    RESTAURANT(List.of("Individual.seating", "Banquet.paymentMethod", "MenuItem.classification", "FoodItem.unit", "Allergen.type", "RegularCustomer.prefferedLanguage")),
    VEHICLERENTAL(List.of("Individual.driverLicenseState")),
    VIDEOCLUB(List.of("Movie.genre")),
    FOOTBALL(List.of("MatchEvent.eventType", "Player.bestFoot", "Player.positionName"));

    private final List<String> attributes;

    Domain(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}

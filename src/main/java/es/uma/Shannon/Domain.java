package es.uma.Shannon;

import java.util.List;

public enum Domain {
    
    EXAMPLE1(List.of("age")),
    EXAMPLE2(List.of("age")),
    EXAMPLE3(List.of("age"));
    // ADDRESSBOOK(List.of()),
    // BANK (List.of("country", "bic", "iban", "balance", "age")), // We can also add bankName, first and last names clustering them with LV distance, but I think there is no need to evaluate semantics on names, in that case we are more interested in evaluating that they are lexically different.
    // The attributes that make sense to use are the ones that we can group based on meaning, like country (Continentes -> European, American, etc.), iban and bic (country), balance (low, medium, high), age (young, middle-aged, old).
    // FOOTBALL(List.of()),
    // HOTELMANAGEMENT(List.of()),
    // MYEXPENSES(List.of()),
    // PICKUPNET(List.of()),
    // RESTAURANT(List.of()),
    // STATEMACHINE(List.of()),
    // VEHICLERENTAL(List.of()),
    // VIDEOCLUB(List.of());

    private final List<String> attributes;

    Domain(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}

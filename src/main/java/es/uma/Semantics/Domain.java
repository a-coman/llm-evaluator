package es.uma.Semantics;

import java.util.List;

public enum Domain {
    ADDRESSBOOK(List.of("name", "phone", "title", "city", "street", "comment", "industry")),
    BANK(List.of("country", "name", "bic", "iban", "firstName", "lastName")),
    FOOTBALL(List.of("name", "homeGround", "chairman", "phoneNumber", "type","note", "location", "purpose", "reason", "areaToImprove")),
    HOTELMANAGEMENT(List.of("firstName", "lastName", "description","roomTypeDescription")),
    MYEXPENSES(List.of("test")),
    PICKUPNET(List.of("test")),
    RESTAURANT(List.of("test")),
    STATEMACHINE(List.of("test")),
    VEHICLERENTAL(List.of("test")),
    VIDEOCLUB(List.of("test"));

    private final List<String> attributes;

    Domain(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}

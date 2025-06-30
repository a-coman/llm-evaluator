package es.uma.Semantics;

import java.util.List;

public enum Domain {
    ADDRESSBOOK(List.of("name", "title", "city", "street", "comment", "industry"));
    // BANK(List.of("country", "name", "firstName", "lastName")),
    // FOOTBALL(List.of("name", "homeGround", "chairman", "type", "note", "location", "purpose", "reason", "areaToImprove")),
    // HOTELMANAGEMENT(List.of("firstName", "lastName", "description","roomTypeDescription")),
    // MYEXPENSES(List.of("category", "text", "name")),
    // PICKUPNET(List.of("name", "text")),
    // RESTAURANT(List.of("name", "description")),
    // STATEMACHINE(List.of("name")),
    // VEHICLERENTAL(List.of("name", "address")),
    // VIDEOCLUB(List.of("title", "name"));

    private final List<String> attributes;

    Domain(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}

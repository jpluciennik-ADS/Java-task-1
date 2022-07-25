package org.deanery.rooms.model;

public class Room {
    private String id;
    private String type;
    private int openingHour;
    private int closingHour;

    public Room(String id, String type, int openingHour, int closingHour) {
        this.id = id;
        this.type = type;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }
}

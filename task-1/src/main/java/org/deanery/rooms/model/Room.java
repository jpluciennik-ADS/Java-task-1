package org.deanery.rooms.model;

public class Room {
    private final String id;
    private RoomType type;
    private final int openingHour;
    private final int closingHour;

    public Room(String id, int openingHour, int closingHour) {
        this.id = id;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type.getType();
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}

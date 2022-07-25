package org.deanery.rooms.model;

public enum RoomType {
    PART_TIME("Part time"),
    FULL_TIME("Full time");

    private String type;

    RoomType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

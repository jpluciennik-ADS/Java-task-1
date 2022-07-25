package org.students.model;

public enum StudentType {
    PART_TIME("Part time"),
    FULL_TIME("Full time");

    private String type;

    StudentType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

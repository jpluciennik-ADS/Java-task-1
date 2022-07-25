package org.deanery.rooms;

import org.deanery.rooms.model.Room;
import org.deanery.rooms.model.RoomType;

public class FullTimeRoom extends Room {
    public FullTimeRoom(String id, int openingHour, int closingHour) {
        super(id, openingHour, closingHour);
        setType(RoomType.FULL_TIME);
    }
}
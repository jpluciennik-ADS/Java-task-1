package org.deanery.rooms;

import org.deanery.rooms.model.Room;
import org.deanery.rooms.model.RoomType;

public class PartTimeRoom extends Room {
    public PartTimeRoom(String id, int openingHour, int closingHour) {
        super(id, openingHour, closingHour);
        setType(RoomType.PART_TIME);
    }
}

package com.builder;
import java.lang.String;

public class ConcreteRoomBuilder implements RoomBuilder {
    private Room room = new Room();


    public RoomBuilder setNumberOfBeds(String numberOfBeds) {
        room.setNumberOfBeds(numberOfBeds);
        return this;
    }

    public RoomBuilder setView(String view) {
        room.setView(view);
        return this;
    }

    public RoomBuilder setType(String type) {
        room.setType(type);
        return this;
    }


    public Room build() {
        return room;
    }
}
package com.builder;

public interface RoomBuilder {
    RoomBuilder setNumberOfBeds(String numberOfBeds);
    RoomBuilder setView(String view);
    RoomBuilder setType(String type);
    Room build();
}

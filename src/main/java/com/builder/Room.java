package com.builder;
import java.util.ArrayList;
import java.util.List;

public class Room {
	private String numberOfBeds;
    private String view;
    private String type;

    // Getters and Setters
    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getType() {return type;}

    public void setType(String type) {
        this.type = type;
    }

}

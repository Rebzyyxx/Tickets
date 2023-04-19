package com.example.tickets;

import java.io.Serializable;

public class User implements Serializable {

    private String ID;
    private String timeIn;
    private String time;
    private String cost;
    private String place;


    public User(String ID, String timeIn, String time, String cost, String place) {
        this.ID = ID;
        this.timeIn = timeIn;
        this.time = time;
        this.cost = cost;
        this.place = place;

    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String setTimeIn() {
        return timeIn;
    }

    public String setTime() {
        return time;
    }


    public String setCost() {
        return cost;
    }

    public String getPlace() {
        return place;
    }
}

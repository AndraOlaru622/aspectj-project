package com.example.demospring.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Line {
    private int id;

    @NotNull(message = "Departure can't be null!")
    private String departure;

    @NotNull(message = "Destination can't be null!")
    private String destination;

    @NotNull(message = "Type can't be null!")
    private String type;            //peoples or goods

    @NotNull(message = "Duration can't be null!")
    @Min(1)
    private int duration;

    public Line() {};
    public Line(int id, String departure, String destination, String type, int duration) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.type = type;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

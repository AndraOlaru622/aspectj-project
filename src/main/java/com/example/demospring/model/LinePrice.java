package com.example.demospring.model;

public class LinePrice {
    private int id;
    private String departure;
    private String destination;
    private int duration;
    private double price;
    private String currency;

    public LinePrice() {};
    public LinePrice(int id, String departure, String destination, int duration, double price, String currency) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.duration = duration;
        this.price = price;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}

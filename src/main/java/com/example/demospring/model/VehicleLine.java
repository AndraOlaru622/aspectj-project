package com.example.demospring.model;

public class VehicleLine {
    private int id;
    private int idDriver;
    private String brand;
    private String service_condition;
    private String departure;
    private String destination;
    private String type;
    private int duration;

    public VehicleLine() {};
    public VehicleLine(int id, int idDriver, String brand, String service_condition, String departure, String destination, String type, int duration) {
        this.id = id;
        this.idDriver = idDriver;
        this.brand = brand;
        this.service_condition = service_condition;
        this.departure = departure;
        this.destination = destination;
        this.type = type;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public String getBrand() {
        return brand;
    }

    public String getService_condition() {
        return service_condition;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }
}

package com.example.demospring.model;

public class DriverVehicle {
    private int id;
    private String first_name;
    private String last_name;
    private String brand;
    private String service_condition;

    public DriverVehicle() {};
    public DriverVehicle(int id, String first_name, String last_name, String brand, String service_condition) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.brand = brand;
        this.service_condition = service_condition;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBrand() {
        return brand;
    }

    public String getService_condition() {
        return service_condition;
    }
}

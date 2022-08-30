package com.example.demospring.model;

public class DriverLocation {
    private int id;
    private String first_name;
    private String last_name;
    private String city;
    private String country;

    public DriverLocation() {};
    public DriverLocation(int id, String first_name, String last_name, String city, String country) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.country = country;
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

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}

package com.example.demospring.model;

import javax.validation.constraints.NotNull;

public class Location {
    private int id;

    @NotNull(message = "City name can't be null!")
    private String city;

    @NotNull(message = "Country name can't be null!")
    private String country;

    public Location() {};
    public Location(int id, String city, String country) {
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

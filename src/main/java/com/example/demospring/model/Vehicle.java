package com.example.demospring.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Vehicle {
    private int id;
    private int idDriver;
    private int idLine;

    @NotNull(message = "Brand name can't be null!")
    private String brand;

    @NotNull(message = "Year can't be null!")
    @Min(1900)
    private int year;

    @NotNull(message = "Service condition can't be null!")
    private String service_condition;

    public Vehicle() {};
    public Vehicle(int id, int idDriver, int idLine, String brand, int year, String service_condition) {
        this.id = id;
        this.idDriver = idDriver;
        this.idLine = idLine;
        this.brand = brand;
        this.year = year;
        this.service_condition = service_condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdLine() {
        return idLine;
    }

    public void setIdLine(int idLine) {
        this.idLine = idLine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getServiceCondition() {
        return service_condition;
    }

    public void setServiceCondition(String service_condition) {
        this.service_condition = service_condition;
    }
}

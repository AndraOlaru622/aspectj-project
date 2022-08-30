package com.example.demospring.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Driver {

    private int id;
    @NotNull(message = "First name can't be null!")
    private String first_name;

    @NotNull(message = "Last name can't be null!")
    private String last_name;

    @NotNull(message = "Age can't be null!")
    @Min(18)
    private int age;

    @NotNull(message = "Year of employment can't be null!")
    @Min(1998)
    private int year_employment;

    @NotNull(message = "Salary can't be null!")
    @Min(500)
    private double salary;

    @NotNull(message = "Location can't be null!")
    private int idLocation;

    public Driver() {

    };

    public Driver(int id, String first_name, String last_name, int age, int year_employment, double salary, int idLocation) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.year_employment = year_employment;
        this.salary = salary;
        this.idLocation = idLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear_employment() {
        return year_employment;
    }

    public void setYear_employment(int year_employment) {
        this.year_employment = year_employment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

}
package com.example.demospring.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Price {
    private int id;
    private int idLine;

    @NotNull(message = "Price can't be null!")
    @Min(1)
    private double price;

    @NotNull(message = "Currency can't be null!")
    private String currency;

    public Price() {};
    public Price(int id, int idLine, double price, String currency) {
        this.id = id;
        this.idLine = idLine;
        this.price = price;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLine() {
        return idLine;
    }

    public void setIdLine(int idLine) {
        this.idLine = idLine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

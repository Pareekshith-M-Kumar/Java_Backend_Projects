package com.example;

import jakarta.persistence.*;

@Entity //table
@Table(name = "car") //table name
public class Car {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-increment
    private int id;

    private String brand;
    private String model;
    private double price;

    public Car() {}

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // getters & setters

    public int getId() { return id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

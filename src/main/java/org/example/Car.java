package org.example;

public class Car {

    private String brand;
    private String model;
    private int milage;

    public Car(String brand, String model, int milage) {
        this.brand = brand;
        this.model = model;
        this.milage = milage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMilage() {
        return milage;
    }
}

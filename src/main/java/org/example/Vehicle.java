package org.example;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Default constructor
    public Vehicle() {

    }
    //Constructor for the Vehicle class which takes the int numberOfWheels, String color, float engineSize, String fuelType parameters
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    // the set and get methods for the numberOfWheels attribute
    public void setNumberOfWheels(int n) {
        numberOfWheels = n;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // the set and get methods for the color attribute
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }

    // the set and get methods for the engineSize attribute
    public void setEngineSize(float es) {
        engineSize = es;
    }
    public float getEngineSize() {
        return engineSize;
    }

    // the set and get methods for the fuelType attribute
    public void setFuelType(String ft) {
        fuelType = ft;
    }
    public String getFuelType() {
        return fuelType;
    }
}

package org.example;

public class Car extends Vehicle {
    private String brand;

    // Default constructor
    public Car() {
    }

    //Constructor for the Car class which takes the String brand, int numberOfWheels, String color, float engineSize, String fuelType parameters and the super Vehicle class's constructor
    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //the set and get methods for the brand attribute
    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * the honk() method that prints "Honk, honk!"
     */
    public void honk() {
        System.out.println("Honk, honk!");
    }

    /**
     * the displayInfo() method that prints all information about the car (including the inherited one)
     */
    public void displayInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("The car's brand is " + brand);
        System.out.println("The numbers of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("The size of engine: " + getEngineSize());
        System.out.println("The type of fuel: " + getFuelType());
    }
}

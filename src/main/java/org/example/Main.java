package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, "Black", 2, "gasoline");
        Car c = new Car("Mercedes-Benz", 4, "Selenite Grey Metallic", 3, "Gasoline");
        v.setColor("White");
        System.out.println("The color of your vehicle is " + v.getColor());

        c.honk();
        c.displayInfo();
        c.setBrand("Mercedes");
        c.setColor("Orange");
        c.setEngineSize(4);
        c.setFuelType("Diesel");

        c.displayInfo();
    }
}

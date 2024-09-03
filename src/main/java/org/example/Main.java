package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, "Black", 2, "Gasoline");
        Car c = new Car("Mercedes-Benz", 4, "Selenite Grey Metallic", 3, "Gasoline");

        // Checking of the Vehicle constructor and all getting methods
        System.out.println("Checking of the Vehicle constructor and all getting methods.\n" +
                            "Expected: Number of wheels -> 2, Color -> Black, Size of engine -> 2, Fuel's type -> Gasoline\n");
        System.out.println("The information about the vehicle: \n" +
                            "Number of wheels: " + v.getNumberOfWheels() + "\n" +
                            "Color: " + v.getColor() + "\n" +
                            "Engine's size: " + v.getEngineSize() + "\n" +
                            "Type of fuel: " + v.getFuelType() + "\n");

        // Checking of all settings methods of the Vehicle class
        System.out.println("Checking of all settings methods of the Vehicle class.\n" +
                            "Expected: Number of wheels -> 4, Color -> White, Size of engine -> 3, Fuel's type -> Electric\n");
        v.setNumberOfWheels(4);
        v.setColor("White");
        v.setEngineSize(3);
        v.setFuelType("Electric");
        System.out.println("The information about the vehicle: \n" +
                "Number of wheels: " + v.getNumberOfWheels() + "\n" +
                "Color: " + v.getColor() + "\n" +
                "Engine's size: " + v.getEngineSize() + "\n" +
                "Type of fuel: " + v.getFuelType() + "\n");

        System.out.println("Finished testing of the Vehicle class methods!\n");

        //Checking of the honk() method
        System.out.println("Checking of the honk() method of the Car class. Expected: prints -> Honk, honk!");
        c.honk();

        //Checking of the displayInfo() method
        System.out.println("\nChecking of the displayInfo() method and Car class's constructor.\nExpected: Brand - > Mercedes-Benz, Number of wheels -> 4, Color -> Selenite Grey Metallic, Size of engine -> 3, Fuel's type -> Gasoline");
        c.displayInfo();

        // Checking of all settings methods of the Car class
        System.out.println("\nChecking of all settings methods of the Car class.\n" +
                "Expected: Brand - > Mercedes, Number of wheels -> 5, Color -> Orange, Size of engine -> 4, Fuel's type -> Diesel\n");
        c.setBrand("Mercedes");
        c.setNumberOfWheels(5);
        c.setColor("Orange");
        c.setEngineSize(4);
        c.setFuelType("Diesel");
        c.displayInfo();

        System.out.println("\nFinished testing of the Car class methods!");
    }
}

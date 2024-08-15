package com.programmersaddaofficial;

// Main class to demonstrate OOP concepts
public class OOPExample {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Red", 120);
        System.out.println("Car Details:");
        myCar.displayInfo();
        myCar.start();
        myCar.accelerate();
        myCar.stop();
        System.out.println();

        // Create a Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Black", 1500);
        System.out.println("Motorcycle Details:");
        myMotorcycle.displayInfo();
        myMotorcycle.start();
        myMotorcycle.revEngine();
        myMotorcycle.stop();
    }
}
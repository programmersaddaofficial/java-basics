package com.programmersaddaofficial;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    // Constructor
    Motorcycle(String brand, String color, int engineCapacity) {
        super(brand, color); // Call the superclass constructor
        this.engineCapacity = engineCapacity;
    }

    // Method to rev the engine (Unique to Motorcycle)
    public void revEngine() {
        System.out.println("The motorcycle's engine is revving at " + engineCapacity + " cc.");
    }

    // Method to display motorcycle information (Overriding method)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

package com.programmersaddaofficial;

// Class representing a Car (Subclass of Vehicle)
public class Car extends Vehicle {
    private int speed;

    // Constructor
    Car(String brand, String color, int speed) {
        super(brand, color); // Call the superclass constructor
        this.speed = speed;
    }

    // Method to accelerate the car
    public void accelerate() {
        System.out.println("The car is accelerating to " + speed + " km/h.");
    }

    // Method to display car information (Overriding method)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Speed: " + speed + " km/h");
    }
}

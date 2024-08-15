package com.programmersaddaofficial;

// Class representing a generic Vehicle (Superclass)
public class Vehicle {
    private String brand;
    private String color;

    // Constructor
    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

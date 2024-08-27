package com.java.oopsmethods;

public class Car {
    // Fields for the Car class
    String carName;
    String carBrand;
    String carModel;
    int year;

    // Method with no parameters and a return type
    public String getCarDetails() {
        // Construct a string containing the car details
        return "Car Name: " + carName + "\n" +
                "Car Brand: " + carBrand + "\n" +
                "Car Model: " + carModel + "\n" +
                "Year: " + year;
    }

    // Method with no parameters and no return type
    public void displayCarDetails() {
        System.out.println(getCarDetails());
        System.out.println();
    }
}



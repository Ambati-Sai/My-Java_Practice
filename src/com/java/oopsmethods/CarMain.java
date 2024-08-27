package com.java.oopsmethods;

public class CarMain {
    public static void main(String[] args) {
        // Create instances of the Car class
        Car car1 = new Car();
        Car car2 = new Car();

        // Initialize the fields of car1
        car1.carName = "Model S";
        car1.carBrand = "Tesla";
        car1.carModel = "2023";
        car1.year = 2023;

        // Initialize the fields of car2
        car2.carName = "Mustang";
        car2.carBrand = "Ford";
        car2.carModel = "2022";
        car2.year = 2022;

        // Display details of car1 and car2
        car1.displayCarDetails();
        car2.displayCarDetails();
    }
}


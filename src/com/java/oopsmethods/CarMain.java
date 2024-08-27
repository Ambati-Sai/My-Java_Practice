package com.java.oopsmethods;

public class CarMain {
    public static void main(String[] args) {
        // Create instances of the Car class
        Car car1 = new Car();
        Car car2 = new Car();

        // Update the details of car1 using the updateCarDetails method
        car1.updateCarDetails("Model S", "Tesla", "2023", 2023);

        // Update the details of car2 using the updateCarDetails method
        car2.updateCarDetails("Mustang", "Ford", "2022", 2022);

        // Display details of car1 and car2
        car1.displayCarDetails();
        car2.displayCarDetails();
    }
}


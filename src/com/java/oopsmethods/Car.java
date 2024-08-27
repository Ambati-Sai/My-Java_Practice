package com.java.oopsmethods;

public class Car {
    // Fields for the Car class
    String carName;
    String carBrand;
    String carModel;
    int year;

   // Method with parameters and no return type
   public void updateCarDetails(String carName, String carBrand, String carModel, int year) {
       this.carName = carName;
       this.carBrand = carBrand;
       this.carModel = carModel;
       this.year = year;
   }

    // Method with no parameters and no return type
    public void displayCarDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Model: " + carModel);
        System.out.println("Year: " + year);
        System.out.println();
    }
}


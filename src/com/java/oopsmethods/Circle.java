package com.java.oopsmethods;

public class Circle {
    // Instance variables
    private double radius;
    private String color;

    // Parameterized constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the circle's details
    public void displayInfo() {
        double area = getArea();
        double circumference = getCircumference();
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Circumference: " + String.format("%.2f", circumference));
    }
}


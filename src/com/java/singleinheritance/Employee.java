package com.java.singleinheritance;

public class Employee {
    // Unique identifier for the employee
    int employeeId;

    // Name of the employee
    String name;

    // Salary of the employee
    double salary;

    // Constructor to initialize Employee object
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId; // Set the employee ID
        this.name = name;             // Set the name of the employee
        this.salary = salary;         // Set the salary of the employee
    }

    // Method to display details of the employee
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


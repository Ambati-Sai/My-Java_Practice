package com.java.singleinheritance;

public class Manager extends Employee {
    // The department the manager is in charge of
    String department;

    // Constructor to initialize Manager object
    public Manager(int employeeId, String name, double salary, String department) {
        super(employeeId, name, salary); // Call the constructor of the superclass Employee
        this.department = department;    // Initialize the department for this manager
    }

    // Method to display details of the manager
    @Override
    public void displayDetails() {
        super.displayDetails();         // Call the displayDetails method from Employee
        System.out.println("Department: " + department);
    }
}


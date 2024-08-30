package com.java.singleinheritance;

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        System.out.println("-----Employee Details-----");
        Employee employee = new Employee(202, "Sai", 40000);
        // Display details of the Employee
        employee.displayDetails();
        System.out.println();

        // Create a Manager object
        System.out.println("-----Manager Details-----");
        Manager manager = new Manager(222, "Bharath", 80000, "CyberSecurity");
        // Display details of the Manager
        manager.displayDetails();
    }
}


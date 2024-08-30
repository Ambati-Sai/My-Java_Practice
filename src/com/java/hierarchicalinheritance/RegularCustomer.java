package com.java.hierarchicalinheritance;

public class RegularCustomer extends Customer {
    int cashBack;

    // Constructor to initialize all fields including the new cashBack field
    public RegularCustomer(int id, String name, String email, String contactNo, int salary, int age, int cashBack) {
        super(id, name, email, contactNo, salary, age); // Call the superclass constructor
        this.cashBack = cashBack;
    }

    @Override
    public void customerDetails() {
        super.customerDetails(); // Call the superclass method
        System.out.println("Cash Back Points: " + cashBack);
    }
}

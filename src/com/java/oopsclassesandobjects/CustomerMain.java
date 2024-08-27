package com.java.oopsclassesandobjects;


public class CustomerMain {
    public static void main(String[] args) {
        // Create an instance of the Customer class
        Customer customer1 = new Customer();

        // Initialize the fields of customer1
        customer1.id = 201;  // Set the customer ID
        customer1.name = "Sai";  // Set the customer name
        customer1.email = "sai@gmail.com";  // Set the customer email
        customer1.contactNo = "+91-6302503847";  // Set the customer contact number
        customer1.salary = 40000;  // Set the customer salary

        // Print details of customer1
        System.out.println("Id :" + customer1.id);
        System.out.println("Name :" + customer1.name);
        System.out.println("Email :" + customer1.email);
        System.out.println("Contact No :" + customer1.contactNo);
        System.out.println("Salary :" + customer1.salary);

        // Create another instance of the Customer class
        Customer customer2 = new Customer();

        // Initialize the fields of customer2
        customer2.id = 202;  // Set the customer ID
        customer2.name = "Shiva";  // Set the customer name
        customer2.email = "shiva@gmail.com";  // Set the customer email
        customer2.contactNo = "+91-9802503847";  // Set the customer contact number
        customer2.salary = 43000;  // Set the customer salary

        // Print details of customer2
        System.out.println("Id :" + customer2.id);
        System.out.println("Name :" + customer2.name);
        System.out.println("Email :" + customer2.email);
        System.out.println("Contact No :" + customer2.contactNo);
        System.out.println("Salary :" + customer2.salary);
    }
}

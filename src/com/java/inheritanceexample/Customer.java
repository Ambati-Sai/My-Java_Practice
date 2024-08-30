package com.java.inheritanceexample;

public class Customer {
    int id;
    String name;
    String email;
    String contactNo;
    int salary;
    byte age;

    public Customer() {
    }

    public Customer(String name, int id, String email, String contactNo, int salary, byte age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
    }

    public void customerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Email: " + email);
        System.out.println("Contact Number: " + contactNo);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

}


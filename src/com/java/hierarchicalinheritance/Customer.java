package com.java.hierarchicalinheritance;

public class Customer {
    int id;
    String name;
    String email;
    String contactNo;
    int salary;
    int age;

    public Customer() {
    }

    public Customer(int id,String name, String email, String contactNo, int salary, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
    }

    public void customerDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact Number: " + contactNo);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

}


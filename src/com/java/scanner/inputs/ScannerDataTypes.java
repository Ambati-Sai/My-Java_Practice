package com.java.scanner.inputs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDataTypes {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Request user to enter roll number
        System.out.println("Enter Your rollNumber :");
        int rollNumber = scanner.nextInt();
        // Consume the leftover newline character after nextInt()
        scanner.nextLine();

        // Request user to enter name
        System.out.println("Enter Your name :");
        String name = scanner.nextLine();

        // Request user to enter height
        System.out.println("Enter Your height :");
        float height = scanner.nextFloat();
        // Consume the leftover newline character after nextFloat()
        scanner.nextLine();

        // Request user to enter age
        System.out.println("Enter Your age :");
        byte age = scanner.nextByte();
        // Consume the leftover newline character after nextByte()
        scanner.nextLine();

        // Request user to enter phone number
        System.out.println("Enter Your phoneNumber :");
        long phoneNumber = scanner.nextLong();
        // Consume the leftover newline character after nextLong()
        scanner.nextLine();

        // Request user to enter marks
        System.out.println("Enter Your marks :");
        short marks = scanner.nextShort();
        // Consume the leftover newline character after nextShort()
        scanner.nextLine();

        // Request user to enter CGPA
        System.out.println("Enter Your cgpa :");
        double cgpa = scanner.nextDouble();
        // Consume the leftover newline character after nextDouble()
        scanner.nextLine();

        // Request user to enter job interest
        System.out.println("Are you interested in a job? (true/false) :");
        boolean interest = scanner.nextBoolean();
        // Consume the leftover newline character after nextBoolean()
        scanner.nextLine();

        // Print the collected information
        System.out.println("-----Student Information-----");
        System.out.println("RollNumber :" + rollNumber);
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Height :" + height);
        System.out.println("PhoneNumber :" + phoneNumber);
        System.out.println("Total marks :" + marks);
        System.out.println("CGPA :" + cgpa);
        System.out.println("Job interest :" + interest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}


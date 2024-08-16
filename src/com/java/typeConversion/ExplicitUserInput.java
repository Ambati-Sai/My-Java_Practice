package com.java.typeConversion;

import java.util.Scanner;

public class ExplicitUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Request user for an int value
        System.out.println("Enter student age :");
        int age = scanner.nextInt();

        // Explicitly cast int to byte
        byte rollNumber = (byte) age;

        // Print the byte value
        System.out.println("Student roll number :" + rollNumber);

        // Close the scanner
        scanner.close();
    }
}

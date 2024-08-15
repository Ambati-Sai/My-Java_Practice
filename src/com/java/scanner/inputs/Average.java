package com.java.scanner.inputs;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter the first number
        System.out.println("Enter firstNumber :");
        // Read the first number from the user
        int firstNumber = scanner.nextInt();

        // Request the user to enter the second number
        System.out.println("Enter secondNumber :");
        // Read the second number from the user
        int secondNumber = scanner.nextInt();

        // Request the user to enter the third number
        System.out.println("Enter thirdNumber :");
        // Read the third number from the user
        int thirdNumber = scanner.nextInt();

        // Calculate the average of the three numbers
        int average = (firstNumber + secondNumber + thirdNumber) / 3;

        // Display the average of the three numbers
        System.out.println("Average of three numbers :" + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}


package com.java.scanner.inputs;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number :");
        // Read the first number from the user
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number :");
        // Read the second number from the user
        int secondNumber = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = firstNumber + secondNumber;

        // Display the sum of the two numbers
        System.out.println("Sum of two numbers is :" + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}


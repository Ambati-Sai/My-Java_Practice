package com.java.operators;

import java.util.Scanner;

public class RelationalUserInputs {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Request the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the values of the two variables
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Compare the two numbers using relational operators and print the results
        System.out.println("Equal to: " + (firstNumber == secondNumber));
        System.out.println("Not equal to: " + (firstNumber != secondNumber));
        System.out.println("Greater than: " + (firstNumber > secondNumber));
        System.out.println("Less than: " + (firstNumber < secondNumber));
        System.out.println("Greater than or equal to: " + (firstNumber >= secondNumber));
        System.out.println("Less than or equal to: " + (firstNumber <= secondNumber));
    }
}


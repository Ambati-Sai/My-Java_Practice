package com.java.operators;

import java.util.Scanner;

public class ArithmeticUserInputs {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter first number :");
        int firstNumber = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter second number :");
        int secondNumber = scanner.nextInt();

        // Perform and print the result of addition
        System.out.println("Addition :" + (firstNumber + secondNumber));
        // Perform and print the result of subtraction
        System.out.println("Subtraction :" + (firstNumber - secondNumber));

        // Perform and print the result of multiplication
        System.out.println("Multiplication :" + (firstNumber * secondNumber));

        // Perform and print the result of division
        System.out.println("Division :" + (firstNumber / secondNumber));

        // Perform and print the result of modulus (remainder)
        System.out.println("Modulus(Remainder) :" + (firstNumber % secondNumber));

        scanner.close();
    }
}


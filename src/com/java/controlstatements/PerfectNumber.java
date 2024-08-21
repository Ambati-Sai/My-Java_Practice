package com.java.controlstatements;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter Your Number:");
        int number = scanner.nextInt();

        // Handle invalid input
        if (number <= 0) {
            System.out.println("Invalid Input. Only positive integers are valid.");
            return;
        }

        // Initialize the sum of divisors
        int sum = 0;

        // Calculate the sum of proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the number is a perfect number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner
        scanner.close();
    }
}

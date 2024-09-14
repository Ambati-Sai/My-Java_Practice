package com.java.Examples;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.println("Enter Number:");
        int number = scanner.nextInt();

        // Check if the number is 1
        if (number == 1) {
            System.out.println(number + " is neither prime nor composite");
            return;  // Exit the program for 1
        }

        boolean isPrime = true;

        // Loop to check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;  // Set flag if a divisor is found
                break;  // Exit the loop as the number is not prime
            }
        }

        // Output: Check if the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        scanner.close();  // Close the scanner to avoid resource leak
    }
}



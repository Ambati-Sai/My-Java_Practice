package com.java.Examples;

import java.util.Scanner;

public class PrimeNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the range from the user
        System.out.println("Enter your lower number:");
        int lowerNumber = scanner.nextInt();
        System.out.println("Enter your upper number:");
        int upperNumber = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerNumber + " and " + upperNumber + " are:");

        // Loop through each number in the range
        for (int i = lowerNumber + 1; i < upperNumber; i++) {
            boolean isPrime = true;  // Assume the number is prime

            // Check divisibility to determine if it's prime
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime && i > 1) {
                System.out.print(i+ " ");
            }
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}


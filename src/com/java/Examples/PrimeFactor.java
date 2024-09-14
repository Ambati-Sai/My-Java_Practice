package com.java.Examples;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        System.out.print("Prime factors are: ");

        // Check for smallest factors starting from 2
        for (int i = 2; i > 1; i++) {
            // While 'i' divides the number, it is a prime factor
            while (number % i == 0) {
                System.out.print(i + " ");  // Print the prime factor
                number = number / i;  // Reduce the number by dividing it
            }
        }

        scanner.close();  // Close the scanner
    }
}


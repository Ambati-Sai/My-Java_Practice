package com.java.controlstatements;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Decimal Number : ");

        int decimalNumber = scanner.nextInt();

        // Create a StringBuilder object to build the binary representation
        StringBuilder binaryString = new StringBuilder();

        // Use a variable to work with the decimal number
        int number = decimalNumber;

        // Check if the number is zero, handle it separately
        if (number == 0) {
            binaryString.append("0");
        } else {
            // Loop until the number becomes zero
            while (number > 0) {
                // Calculate the remainder when number is divided by 2
                int remainder = number % 2;

                // Append the remainder to the StringBuilder
                binaryString.append(remainder);

                // Update the number by dividing it by 2
                number = number / 2;
            }

            // Reverse the binary string because the remainders are collected in reverse order
            binaryString.reverse();
        }

        // Print the decimal number and its binary representation
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Representation: " + binaryString.toString());
    }
}


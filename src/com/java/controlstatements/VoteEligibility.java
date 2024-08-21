package com.java.controlstatements;

import java.util.Scanner; // Import the Scanner class for user input

public class VoteEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("Enter Age:");

        // Read the age entered by the user
        int age = scanner.nextInt();

        // Check if the entered age is 18 or older
        if (age >= 18) {
            // If age is 18 or older, the user is eligible to vote
            System.out.println("You are eligible to vote");
        } else {
            // If age is less than 18, the user is not eligible to vote
            System.out.println("Not eligible to vote");
        }

        scanner.close();
    }
}


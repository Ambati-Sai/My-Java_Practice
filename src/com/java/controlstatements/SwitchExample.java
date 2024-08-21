package com.java.controlstatements;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");

        // Read the user input
        int weekDay = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // Handle invalid input
                System.out.println("Incorrect input. Please enter a number between 1 and 7.");
                break;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

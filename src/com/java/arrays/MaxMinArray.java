package com.java.arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter Size of array:");
        int size = scanner.nextInt();  // Read the size of the array

        int[] numbers = new int[size];  // Initialize the array with the specified size

        // Loop to fill the array with user input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();  // Read each number and store it in the array
        }

        // Print the array elements
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Initialize maxNum and minNum with the first element of the array
        int maxNum = numbers[0];
        int minNum = numbers[0];

        // Loop to find the maximum and minimum numbers in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];  // Update maxNum if the current element is greater
            }
            if (numbers[i] < minNum) {
                minNum = numbers[i];  // Update minNum if the current element is smaller
            }
        }

        // Print the maximum and minimum numbers found
        System.out.println("The maximum number is: " + maxNum);
        System.out.println("The minimum number is: " + minNum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}



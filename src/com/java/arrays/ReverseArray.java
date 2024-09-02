package com.java.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter your array size :");
        int size = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[size];

        System.out.println("Enter your elements :");
        // Fill the array with input values
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Print the array in reverse order
        System.out.println("Reversed Array:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.println();
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

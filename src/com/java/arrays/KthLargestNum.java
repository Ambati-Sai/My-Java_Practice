package com.java.arrays;

import java.util.Scanner;

public class KthLargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter Size of array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Loop to fill the array with user input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Prompt the user to enter the value of kthNum (the position of the largest number they want)
        System.out.println("Enter Your kth number :");
        int kthNum = scanner.nextInt();

        int number = numbers[0];
        int count = 0;

        // Loop through the array to find the k-th largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > number) {
                count += 1;
            }

            // If count equals kthNum, print the current element as the k-th largest element
            if (count == kthNum) {
                System.out.println("The " + kthNum +" largest element is : " + numbers[i]);
            }
        }
    }
}



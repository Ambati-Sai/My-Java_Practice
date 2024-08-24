package com.java.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Initialize an array of integers with values from 1 to 8
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the length of the array
        System.out.println("Length of the array(size) :" + numbers.length);

        // Print numbers from 0 to 8 using a for loop
        for(int number = 0; number < 10 ; number++) {
            System.out.print(numbers[number] + " ");
        }
    }
}


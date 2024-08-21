package com.java.controlstatements;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Variables to hold the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Print a message indicating the range of Fibonacci numbers
        System.out.println("Fibonacci series from 1 to 1000:");

        // Generate Fibonacci numbers until the numbers exceed 1000
        while (a <= 1000) {
            if (a >= 1) { // Print only if the Fibonacci number is greater than or equal to 1
                System.out.println(a);
            }
            // Update Fibonacci numbers
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

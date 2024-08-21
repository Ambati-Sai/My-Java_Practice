package com.java.controlstatements;

public class BreakExample {
    public static void main(String[] args) {
        // Declare and initialize the variable num
        int num = 10;

        // Start a for loop with num initialized to 0
        // Loop continues while num is less than 10
        // Increment num by 1 after each iteration
        for (num = 0; num < 10; num++) {
            // Check if num is equal to 5
            if (num == 5) {
                // Exit the loop if num is equal to 5
                break;
            }
            // Print the current value of num
            System.out.println(num);
        }
    }
}

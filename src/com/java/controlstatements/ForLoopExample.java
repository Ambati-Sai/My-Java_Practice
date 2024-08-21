package com.java.controlstatements;

public class ForLoopExample {
    public static void main(String[] args) {
        // Declare and initialize the variable numberOne
        int numberOne = 10;

        // Initialize numberOne to 0
        // Continue looping while numberOne is less than or equal to 10
        // Increment numberOne by 1 after each iteration
        for (numberOne = 0; numberOne <= 10; numberOne++) {
            // Print the current value of numberOne
            System.out.println(numberOne);
        }

        // Reinitialize numberOne to 0
        // Continue looping while numberOne is less than or equal to 10
        // Increment numberOne by 2 after each iteration
        for (numberOne = 0; numberOne <= 10; numberOne = numberOne + 2) {
            // Print the current value of numberOne
            System.out.println(numberOne);
        }
    }
}


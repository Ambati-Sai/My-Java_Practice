package com.java.ifelse;

public class NestedLoop {
    public static void main(String[] args) {
        int size = 10;

        // Outer loop: iterates over the rows
        for (int i = 1; i <= size; i++) {
            // Inner loop: iterates over the columns
            for (int j = 1; j <= size; j++) {
                // Print the product of the current row and column
                System.out.printf("%8d", i * j);
            }
            // Print a newline after each row
            System.out.println();
        }
    }
}

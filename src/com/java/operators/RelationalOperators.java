package com.java.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // Define two integer variables
        int numberOne = 200;
        int numberTwo = 300;

        // Print the values of the two variables
        System.out.println("First Number :" + numberOne);
        System.out.println("Second Number :" + numberTwo);

        // Compare the two numbers using relational operators and print the results
        // Check if numberOne is equal to numberTwo
        System.out.println("Equal to :" + (numberOne == numberTwo));

        // Check if numberOne is not equal to numberTwo
        System.out.println("Not equal to :" + (numberOne != numberTwo));

        // Check if numberOne is greater than numberTwo
        System.out.println("Greater than :" + (numberOne > numberTwo));

        // Check if numberOne is less than numberTwo
        System.out.println("Less than :" + (numberOne < numberTwo));

        // Check if numberOne is greater than or equal to numberTwo
        System.out.println("Greater than or equal to :" + (numberOne >= numberTwo));

        // Check if numberOne is less than or equal to numberTwo
        System.out.println("Less than or equal to :" + (numberOne <= numberTwo));
    }
}

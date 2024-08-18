package com.java.ifelse;

public class ElseIfExample {
    public static void main(String[] args) {

        int numberOne = 200;

        int numberTwo = 200;
        System.out.println("Number One :" + numberOne);
        System.out.println("Number Two :" + numberTwo);

        // Check if numberOne is less than numberTwo
        if (numberOne < numberTwo) {
            // Print a message if numberOne is less than numberTwo
            System.out.println("Number one is less than Number Two");
        }
        // Check if numberOne is greater than numberTwo
        else if (numberOne > numberTwo) {
            // Print a message if numberOne is greater than numberTwo
            System.out.println("Number One is greater than Number Two");
        }
        else {
            // Print a message if numberOne is equal to numberTwo
            System.out.println("Number One is equal to Number Two");
        }
    }
}


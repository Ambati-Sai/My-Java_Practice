package com.java.operators;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter the first number
        System.out.print("Enter the first number : ");
        int numOne = scanner.nextInt();

        // Request the user to enter the second number
        System.out.print("Enter the second number : ");
        int numTwo = scanner.nextInt();

        // Bitwise AND operation
        System.out.println("numOne & numTwo : " + (numOne & numTwo));
        // Result:Returns 1 if both bits are 1, otherwise 0

        // Bitwise OR operation
        System.out.println("numOne | numTwo : " + (numOne | numTwo));
        // Result: Returns 1 if at least one bit is 1

        // Bitwise XOR operation
        System.out.println("numOne ^ numTwo : " + (numOne ^ numTwo));
        // Result: Returns 1 if the bits are different

        // Bitwise Complement operation
        System.out.println("~numOne : " + (~numOne));
        // Result: Inverts all bits of numOne

        // Left Shift operation
        System.out.println("numOne << numTwo : " + (numOne << numTwo));
        // Result: Shifts bits of numOne to the left by numTwo positions

        // Right Shift operation
        System.out.println("numOne >> numTwo : " + (numOne >> numTwo));
        // Result: Shifts bits of numOne to the right by numTwo positions

        // Unsigned Right Shift operation
        System.out.println("numOne >>> numTwo : " + (numOne >>> numTwo));
        // Result: Shifts bits of numOne to the right by numTwo positions, filling with 0s

        scanner.close();
    }
}

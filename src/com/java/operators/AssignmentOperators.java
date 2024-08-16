package com.java.operators;

import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value :");
        int value = scanner.nextInt();

        // Display the initial value
        System.out.println("Initial Value: " + value);


        // Assignment operator (=)
        int result = value;
        System.out.println("After assignment (=): " + result);

        // Addition assignment operator (+=)
        result += value;
        System.out.println("After addition assignment (+=): " + result);

        // Subtraction assignment operator (-=)
        result -= value;
        System.out.println("After subtraction assignment (-=): " + result);

        // Multiplication assignment operator (*=)
        result *= value;
        System.out.println("After multiplication assignment (*=): " + result);

        // Division assignment operator (/=)
        result /= value;
        System.out.println("After division assignment (/=): " + result);

        // Modulus assignment operator (%=)
        result %= value;
        System.out.println("After modulus assignment (%=): " + result);
    }
}


package com.java.typeConversion;

import java.util.Scanner;

public class ImplicitUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Request user for a byte value
        System.out.println("Enter your byte value :");
        byte age = scanner.nextByte();

        // byte to int
        int rollNumber = age;

        System.out.println("int number :" + rollNumber);

        scanner.close();
    }
}


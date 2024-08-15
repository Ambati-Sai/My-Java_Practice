package com.java.datatypes;

public class LongDataType {
    // The main method is the entry point for the Java application.
    public static void main(String[] args) {
        // Declare a long variable named 'mobileNumber' and initialize it with the value 9876543210L.
        // The 'L' suffix denotes that this is a long literal, which is necessary because the value is too large for an int.
        long mobileNumber = 9876543210L;

        // Print out the value of 'mobileNumber'.
        // The '+' operator is used to concatenate the string with the value of 'mobileNumber'.
        System.out.println("Mobile Number is: " + mobileNumber);
    }
}

package com.java.variables;
/*constants are variables whose values cannot be changed once they are initialized.
Constants are typically used to represent fixed values that remain the same throughout the execution of a program.
 */
public class Constants {

    // Declare constants
    public static final int rollNumber = 402;
    public static final double cgpa = 8.3;
    public static final String studentName = "Ambati Sai";

    public static void main(String[] args) {
        // Use the constants
        System.out.println("Student rollNumber: " + rollNumber);
        System.out.println("Student CGPA : " + cgpa);
        System.out.println("Student name :" + studentName);
    }
}

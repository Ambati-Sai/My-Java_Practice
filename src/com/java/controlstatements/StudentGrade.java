package com.java.controlstatements;

import java.util.Scanner; // Import Scanner class for user input

public class StudentGrade {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter their total marks
        System.out.print("Enter Your Total Marks :");

        // Read the total marks entered by the user
        int totalMarks = scanner.nextInt();

        // Determine the grade based on the total marks
        if (totalMarks >= 950) {
            // If totalMarks is 950 or more, assign grade O(10)
            System.out.println("Grade : O(10)");
        } else if (totalMarks >= 900) {
            // If totalMarks is between 900 and 949, assign grade A+(9)
            System.out.println("Grade : A+(9)");
        } else if (totalMarks >= 800) {
            // If totalMarks is between 800 and 899, assign grade A(8)
            System.out.println("Grade : A(8)");
        } else if (totalMarks >= 700) {
            // If totalMarks is between 700 and 799, assign grade B+(7)
            System.out.println("Grade : B+(7)");
        } else if (totalMarks >= 600) {
            // If totalMarks is between 600 and 699, assign grade B(6)
            System.out.println("Grade : B(6)");
        } else if (totalMarks >= 500) {
            // If totalMarks is between 500 and 599, assign grade C(5)
            System.out.println("Grade : C(5)");
        } else {
            // If totalMarks is less than 500, the student fails
            System.out.println("Fail");
        }

        scanner.close();
    }
}

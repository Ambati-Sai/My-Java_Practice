package com.java.patterns;

public class InvertedNumbers {
    public static void main(String[] args) {
        int num = 10;
        for (int line = 1; line <= num; line++) {
            for (int number = 1; number <= (num - line + 1); number++) {
                System.out.print(number);
            }
            System.out.println(); // Moves to the next line after printing stars
        }
    }
}
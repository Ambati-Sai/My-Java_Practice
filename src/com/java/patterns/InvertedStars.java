package com.java.patterns;

public class InvertedStars {
    public static void main(String[] args) {
        int num = 6;
        for (int line = 1; line <= 6; line++) {
            for (int star = 1; star <= (num - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println(); // Moves to the next line after printing stars
        }
    }
}


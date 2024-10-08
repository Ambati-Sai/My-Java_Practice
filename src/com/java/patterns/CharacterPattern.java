package com.java.patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(); // Moves to the next line after printing stars
        }
    }
}

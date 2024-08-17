package com.java.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int number = 150;

        // Unary Plus (+)
        System.out.println("Unary Plus (+) : " + (+number));

        // Unary Minus (-)
        System.out.println("Unary Minus (-) : " + (-number));

        // Unary Increment (++)
        System.out.println("Unary Increment (++) : " + (++number));

        // Unary Decrement (--)
        System.out.println("Unary Decrement (--) : " + (--number));

        // Unary Logical NOT (!): Requires a boolean expression
        boolean boolValue = true;
        System.out.println("Unary Logical NOT (!) : " + !boolValue);
    }
}


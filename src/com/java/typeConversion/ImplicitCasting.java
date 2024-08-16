package com.java.typeConversion;
/*Widening Casting (Implicit):
This occurs when data from a smaller data type is converted into a larger data type automatically. */
//byte → short → int → long → float → double
public class ImplicitCasting {
    public static void main(String[] args) {
        // Initial byte value
        byte rollNumber = 12;

        // Implicitly cast byte to short
        short age = rollNumber;

        // Implicitly cast short to int
        int number = age;

        // Implicitly cast int to long
        long rollNo = number;

        // Implicitly cast long to float
        float no = rollNo;

        // Implicitly cast float to double
        double numberOne = no;

        // Print all values
        System.out.println("byte :" + rollNumber);
        System.out.println("short :" + age);
        System.out.println("int :" + number);
        System.out.println("long :" + rollNo);
        System.out.println("float :" + no);
        System.out.println("double :" + numberOne);
    }
}

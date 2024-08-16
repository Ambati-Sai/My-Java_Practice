package com.java.typeConversion;
/*Narrowing Casting (Explicit): This is done manually by the programmer.
 It converts a larger data type to a smaller size type
 */
//double → float → long → int → short → byte
public class ExplicitCasting {
    public static void main(String[] args) {
        // double to float
        double marks = 12.5;
        float totalMarks = (float) marks; // Explicit cast from double to float
        System.out.println("double :" + marks);
        System.out.println(" double to float :" + totalMarks);

        // float to long
        float value = 12.34f;
        long number = (long) value; // Explicit cast from float to long
        System.out.println("float :" + value);
        System.out.println("float to long :" + number);

        // long to int
        long phoneNumber = 1234567890L;
        int mobileNumber = (int) phoneNumber; // Explicit cast from long to int
        System.out.println("long :" + phoneNumber);
        System.out.println("long to int :" + mobileNumber);

        // int to short
        int productCost = 32767;
        short cost = (short) productCost; // Explicit cast from int to short
        System.out.println("int :" + productCost);
        System.out.println("int to short :" + cost);

        //short to byte
        short rollNumber = 120;
        byte rollNO = (byte) rollNumber; // Explicit cast from short to byte
        System.out.println("short :" + rollNumber);
        System.out.println("short to byte :" + rollNO);
    }
}

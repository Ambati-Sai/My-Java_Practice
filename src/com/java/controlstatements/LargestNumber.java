package com.java.controlstatements;

public class LargestNumber {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 20;
        int numThree = 30;
        if((numOne > numTwo) && (numOne > numThree )){
            System.out.println("Largest Number is" + numOne);
        } else if (numTwo > numThree) {
            System.out.println("Largest Number is" + numTwo);
        }
        else {
            System.out.println("Largest Number is :" + numThree);
        }
    }
}

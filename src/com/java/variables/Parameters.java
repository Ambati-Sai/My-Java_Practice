package com.java.variables;

/*Definition: Parameters are variables that are passed to methods or constructors.
They act as inputs to these methods or constructors.
 */
public class Parameters {
    // Method that takes two parameters and prints their sum
    public void display(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber; // Local variable 'sum' to store the result
        System.out.println("Sum of two numbers is :" + sum); // Print the sum
    }

    public static void main(String[] args) {
        Parameters object = new Parameters();
        object.display(10, 20);
    }
}

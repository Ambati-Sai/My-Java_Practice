package com.java.variables;
/*Definition: Instance variables are declared inside a class but outside any method or block.
 They are tied to a specific instance of the class.
 */

public class InstanceVariables {
        // Instance variable
        int exampleNumber;

        // Method to display the value of the instance variable
        public void display() {
            System.out.println("The value of example number is: " + exampleNumber);
        }

        public static void main(String[] args) {
            // Create an instance of Example
            InstanceVariables object = new InstanceVariables();

            // Initialize the instance variable
            object.exampleNumber = 20;

            // Call the display method
            object.display();
        }
    }


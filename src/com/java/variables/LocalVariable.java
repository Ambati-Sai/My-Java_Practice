package com.java.variables;
/*Definition: Local variables are declared inside methods, blocks, or constructors.
They are only accessible within the method, block, or constructor where they are defined.
 */

public class LocalVariable{

    // Method that demonstrates the use of a local variable
    public void display() {
        int rollNumber = 200; // Local variable
        System.out.println("Student rollNumber is: " + rollNumber);
    }

    public static void main(String[] args) {
        // Create an instance of LocalVariableExample
        LocalVariable object = new LocalVariable();

        // Call the display method
        object.display();
    }
}



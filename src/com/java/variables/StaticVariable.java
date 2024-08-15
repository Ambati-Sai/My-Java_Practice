package com.java.variables;
/*Definition: Class variables are declared with the static keyword and are shared among all instances of the class.
They are associated with the class itself rather than with any particular instance.
 */

public class StaticVariable {
    static int rollNumber;// Class variables
    public void display() {
            System.out.println("Student rollNumber :" + rollNumber);
        }

        public static void main(String[] args) {
            StaticVariable.rollNumber = 10; // Accessing via class name
            StaticVariable object = new StaticVariable();
            object.display(); 
        }
    }


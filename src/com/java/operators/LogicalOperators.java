package com.java.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean ifYes = true;
        boolean ifNo = false;

        // Logical AND (&&) operation
        // Returns true if both operands are true, otherwise returns false
        System.out.println("ifYes && ifNo :" + (ifYes && ifNo));

        // Logical OR (||) operation
        // Returns true if at least one of the operands is true, otherwise returns false
        System.out.println("ifYes || ifNo :" + (ifYes || ifNo));

        // Logical NOT (!) operation
        // Returns true if the operand is false, otherwise returns false
        System.out.println("!ifYes :" + (!ifYes));
    }
}

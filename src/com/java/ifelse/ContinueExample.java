package com.java.ifelse;

public class ContinueExample {
    public static void main(String[] args) {
        // Loop through numbers from 0 to 9
        for (int num = 0; num < 10; num++) {
            // If num is equal to 5, skip the rest of this iteration
            if (num == 5) {
                continue;
            }
            // Print the current value of num
            System.out.println(num);
        }
    }
}


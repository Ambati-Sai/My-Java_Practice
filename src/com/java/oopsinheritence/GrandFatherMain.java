package com.java.oopsinheritence;

// Main class to demonstrate the family tree
public class GrandFatherMain {
    public static void main(String[] args) {
        // Create an instance of Son
        Son son = new Son();

        // Call the overridden method
        son.say();
        son.show();
        son.display();
    }
}
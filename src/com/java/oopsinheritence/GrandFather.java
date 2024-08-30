package com.java.oopsinheritence;

// Base class representing the Grandfather
class Grandfather {
    void show() {
        System.out.println("I am the Grandfather.");
    }
}

// Intermediate class representing the Father
class Father extends Grandfather {
    void display() {
        // Overriding the method from Grandfather
        System.out.println("I am the Father.");
    }
}

// Derived class representing the Son
class Son extends Father {
    void say() {
        // Overriding the method from Father
        System.out.println("I am the Son.");
    }
}



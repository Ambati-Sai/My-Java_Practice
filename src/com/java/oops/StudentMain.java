package com.java.oops;

public class StudentMain {
    public static void main(String[] args) {
        // Create the first Student object
        Student student = new Student();
        student.name = "Ambati Sai";
        student.rollNo = 402;
        student.age = 21;
        student.dept = "CSG";
        student.grade = 'A'; // Corrected to char type for grade
        student.cgpa = 8; // Changed from float to byte for CGPA

        // Print details of the first student
        System.out.println("Name :" + student.name);
        System.out.println("Roll No. :" + student.rollNo);
        System.out.println("Age :" + student.age);
        System.out.println("Department :" + student.dept);
        System.out.println("Grade :" + student.grade);
        System.out.println("CGPA :" + student.cgpa);

        // Create the second Student object
        Student student1 = new Student();
        student1.name = "M Bharath";
        student1.rollNo = 403;
        student1.age = 24;
        student1.dept = "CSG";
        student1.grade = 'A'; // Corrected to char type for grade
        student1.cgpa = 9; // Changed from float to byte for CGPA

        // Print details of the second student
        System.out.println("Name :" + student1.name);
        System.out.println("Roll No. :" + student1.rollNo);
        System.out.println("Age :" + student1.age);
        System.out.println("Department :" + student1.dept);
        System.out.println("Grade :" + student1.grade);
        System.out.println("CGPA :" + student1.cgpa);

        // Create the third Student object
        Student student2 = new Student();
        student2.name = "K Laxman";
        student2.rollNo = 404;
        student2.age = 21;
        student2.dept = "CSG";
        student2.grade = 'A'; // Corrected to char type for grade
        student2.cgpa = 8; // Changed from float to byte for CGPA

        // Print details of the third student
        System.out.println("Name :" + student2.name);
        System.out.println("Roll No. :" + student2.rollNo);
        System.out.println("Age :" + student2.age);
        System.out.println("Department :" + student2.dept);
        System.out.println("Grade :" + student2.grade);
        System.out.println("CGPA :" + student2.cgpa);
    }
}

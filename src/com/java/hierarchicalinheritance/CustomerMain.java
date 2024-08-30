package com.java.hierarchicalinheritance;

public class CustomerMain {
    public static void main(String[] args) {
        // Create two RegularCustomer instances
        RegularCustomer regularCustomer1 = new RegularCustomer(1, "Sai", "sai@example.com", "+91-8025454545", 50000, 21, 200);
        RegularCustomer regularCustomer2 = new RegularCustomer(2, "Bharath", "bharath@example.com", "+91-8524684681", 55000, 28, 250);

        // Display details for the first RegularCustomer
        System.out.println("Regular Customer 1:");
        regularCustomer1.customerDetails();
        System.out.println();

        // Display details for the second RegularCustomer
        System.out.println("Regular Customer 2:");
        regularCustomer2.customerDetails();
        System.out.println();

        // Create two PremiumCustomer instances
        PremiumCustomer premiumCustomer1 = new PremiumCustomer(1, "SAmbati Sai", "ambatisai@example.com", "+91-6000050000", 75000, 35, "Gold");
        PremiumCustomer premiumCustomer2 = new PremiumCustomer(2, "Bharath", "mbharath@example.com", "+91-8202515512", 80000, 40, "Platinum");

        // Display details for the first PremiumCustomer
        System.out.println("Premium Customer 1:");
        premiumCustomer1.customerDetails();
        System.out.println();

        // Display details for the second PremiumCustomer
        System.out.println("Premium Customer 2:");
        premiumCustomer2.customerDetails();
    }
}



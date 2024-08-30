package com.java.hierarchicalinheritance;

public class PremiumCustomer extends Customer{
    String memberShip;

    public PremiumCustomer(int id, String name, String email, String contactNo, int salary, int age, String memberShip) {
        super(id, name, email, contactNo, salary, age);
        this.memberShip = memberShip;
    }

    @Override
    public void customerDetails() {
        super.customerDetails();
        System.out.println("Member ship :" + memberShip);
    }
}

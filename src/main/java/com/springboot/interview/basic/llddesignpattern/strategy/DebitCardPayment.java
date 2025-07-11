package com.springboot.interview.basic.llddesignpattern.strategy;

public class DebitCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Debit Card Payment.....");
    }
}

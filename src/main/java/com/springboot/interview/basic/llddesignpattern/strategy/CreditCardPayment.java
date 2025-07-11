package com.springboot.interview.basic.llddesignpattern.strategy;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Card Payment method");
    }
}

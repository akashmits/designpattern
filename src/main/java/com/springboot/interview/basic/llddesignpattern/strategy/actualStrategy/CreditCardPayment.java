package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Process Credit Card payment...");
    }
}

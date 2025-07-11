package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

public class DebitCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Debit Card payment in process");
    }
}

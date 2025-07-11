package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

public class CryptoCurrencyPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment done bia crypto Currency.");
    }
}

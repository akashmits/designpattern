package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

public class MainStrategyPatternExecution {
    public static void main(String[] args) {

        PaymentStrategy paymentStrategy = new CreditCardPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment();


        paymentStrategy = new UPIPayment();
        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentProcessor.processPayment();

        paymentStrategy = new CryptoCurrencyPayment();
        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentProcessor.processPayment();

    }
}

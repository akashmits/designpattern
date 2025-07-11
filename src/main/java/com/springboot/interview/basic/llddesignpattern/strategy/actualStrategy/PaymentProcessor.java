package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

import lombok.Data;

@Data
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void processPayment(){
        paymentStrategy.processPayment();
    }
}

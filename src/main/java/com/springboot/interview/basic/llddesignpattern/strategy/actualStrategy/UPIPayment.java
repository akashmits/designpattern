package com.springboot.interview.basic.llddesignpattern.strategy.actualStrategy;

import java.sql.SQLOutput;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Upipayment processing");
    }
}

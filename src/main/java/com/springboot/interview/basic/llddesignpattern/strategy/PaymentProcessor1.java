package com.springboot.interview.basic.llddesignpattern.strategy;

public class PaymentProcessor1 {
    public void processPayment(String method){
        if("creditCard".equalsIgnoreCase(method)){
            System.out.println("Credit card payment process");
            CreditCardPayment creditCardPayment=new CreditCardPayment();
            creditCardPayment.processPayment();
        }else if("debitcard".equalsIgnoreCase(method)){
            System.out.println("Debit card payment process");
            DebitCardPayment debitCardPayment=new DebitCardPayment();
            debitCardPayment.processPayment();
        }else if("upi".equalsIgnoreCase(method)){
            System.out.println("Upi payment process");
        }else{
            System.out.println("INvalid method");
        }
    }
}

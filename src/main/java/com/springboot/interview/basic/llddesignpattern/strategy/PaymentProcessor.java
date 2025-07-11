package com.springboot.interview.basic.llddesignpattern.strategy;

public class PaymentProcessor {

    public void processPayment(String method){
        if("creditCard".equalsIgnoreCase(method)){
            System.out.println("Credit card payment process");
        }else if("debitcard".equalsIgnoreCase(method)){
            System.out.println("Debit card payment process");
        }else if("upi".equalsIgnoreCase(method)){
            System.out.println("Upi payment process");
        }else{
            System.out.println("INvalid method");
        }
    }
}

//how this call work:
/*
• We have a single method called processPayment().
• Inside the method, we check what type of payment method the user has selected using if-else statements.
• For each payment method (Credit Card, PayPal, or Crypto), we print a message like "Processing credit card payment...".
 */

//What Happens When We Want to Add a New Payment Method?
/*
Let’s say you now want to add a new payment method, like Stripe.
If we were using the above approach, we’d have to modify the processPayment() method like this:
 */

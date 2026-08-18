package com.akoele.designpatterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new PayPalPayment());

        paymentContext.executePayement();

        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.executePayement();

        paymentContext.setStrategy(null);
        paymentContext.executePayement();
    }
}

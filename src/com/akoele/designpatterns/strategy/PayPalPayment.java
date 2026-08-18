package com.akoele.designpatterns.strategy;

public class PayPalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement PayPal éffectué avec succès");
    }
}

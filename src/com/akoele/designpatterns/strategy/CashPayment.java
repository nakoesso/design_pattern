package com.akoele.designpatterns.strategy;

public class CashPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Paiement Cash éffectué avec succès");
    }
}

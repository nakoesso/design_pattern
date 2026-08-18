package com.akoele.designpatterns.strategy;

public class CustomPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Custom payment is successfuly performed");
    }
}

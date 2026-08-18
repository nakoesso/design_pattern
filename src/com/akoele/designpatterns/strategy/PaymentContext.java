package com.akoele.designpatterns.strategy;

public class PaymentContext {

    private PayStrategy payStrategy;

    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    void executePayement(){
        if (payStrategy == null){
            System.err.println("Aucun moyen de payement n'a ete defini");
            return;
        }
        payStrategy.pay();
    }

    public void setStrategy(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }
}

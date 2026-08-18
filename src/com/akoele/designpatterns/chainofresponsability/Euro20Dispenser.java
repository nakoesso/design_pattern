package com.akoele.designpatterns.chainofresponsability;

public class Euro20Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20){
            int number = currency.getAmount() / 20;
            int remain = currency.getAmount() % 20;
            System.out.println("Dispensing "+ number + " 20 Euro");
            if(remain != 0) chain.dispense(new Currency(remain));
        } else {
            chain.dispense(currency);
        }
    }
}

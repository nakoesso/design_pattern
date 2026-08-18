package com.akoele.designpatterns.chainofresponsability;

public class Euro5Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 5){
            int number = currency.getAmount() / 5;
            int remain = currency.getAmount() % 5;
            System.out.println("Dispensing "+ number + " 5 Euro");
            if(remain != 0) chain.dispense(new Currency(remain));
        } else {
            chain.dispense(currency);
        }
    }
}

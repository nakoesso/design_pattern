package com.akoele.designpatterns.chainofresponsability;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}

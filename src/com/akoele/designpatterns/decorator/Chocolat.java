package com.akoele.designpatterns.decorator;

public class Chocolat extends BoissonDecorator{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.4;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}

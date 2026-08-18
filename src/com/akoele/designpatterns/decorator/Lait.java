package com.akoele.designpatterns.decorator;

public class Lait extends BoissonDecorator{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au lait";
    }
}

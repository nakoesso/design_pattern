package com.akoele.designpatterns.decorator;

public class Caramel extends BoissonDecorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 2.0;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }
}

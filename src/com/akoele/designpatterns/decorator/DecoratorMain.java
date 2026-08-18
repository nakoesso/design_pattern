package com.akoele.designpatterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Boisson espresso = new Espresso();
        System.out.println("Description "+ espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Lait(espresso);
        System.out.println("Description "+ espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Chocolat(espresso);
        System.out.println("Description "+ espresso.getDescription() + " | Prix : " + espresso.cout());
    }
}

package com.akoele.designpatterns.factory.exemple2;

public class Rectangle implements Forme{

    @Override
    public void dessiner() {
        System.out.println("Je dessine un rectangle");
    }
}

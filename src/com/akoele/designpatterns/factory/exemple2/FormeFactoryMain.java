package com.akoele.designpatterns.factory.exemple2;

public class FormeFactoryMain {
    public static void main(String[] args) {
        FormeFactory formeFactory = new FormeFactory();

        Forme forme1 = formeFactory.getForme("Cercle");
        forme1.dessiner();

        Forme forme2 = formeFactory.getForme("Rectangle");
        forme2.dessiner();

            Forme forme3 = formeFactory.getForme("Carre");
        forme3.dessiner();
    }
}

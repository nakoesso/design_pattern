package com.akoele.designpatterns.factory.exemple2;

public class FormeFactory {

    public static  Forme getForme(String type) {
       switch (type){
           case "Cercle":
               return new Cercle();
           case "Carre":
               return new Carre();
           case "Rectangle":
               return new Rectangle();
           default:
               throw new IllegalArgumentException("Type de forme non reconnu: " + type);
       }
    }
}

package com.akoele.designpatterns.factory.exemple1;

public class FactoryMain {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC");
        System.out.println(pc);

        Computer introuvable = ComputerFactory.getComputer("INTR");
        System.out.println(introuvable);
    }
}

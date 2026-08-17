package com.akoele.designpatterns.singleton;

public class EagerInitializationSingleton {

    private static final  EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerInitializationSingleton getInstance() {
        System.out.println("Eager init of the class");
        return instance;
    }

}

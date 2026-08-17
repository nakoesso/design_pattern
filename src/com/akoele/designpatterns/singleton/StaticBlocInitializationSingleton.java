package com.akoele.designpatterns.singleton;

public class StaticBlocInitializationSingleton {

    private static StaticBlocInitializationSingleton instance;

    private StaticBlocInitializationSingleton() {
        // private constructor to prevent instantiation
    }

    static {
        try {
            instance = new StaticBlocInitializationSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlocInitializationSingleton getInstance() {
        System.out.println("Static block init of the class");
        return instance;
    }
}

package com.akoele.designpatterns.singleton;

public class LazyBlocInitializationSingleton {
    private static LazyBlocInitializationSingleton instance;

    private LazyBlocInitializationSingleton() {
        // private constructor to prevent instantiation
    }

    public static LazyBlocInitializationSingleton getInstance() {
        if(instance == null) {
            System.out.println("creating new instance of the class");
            instance = new LazyBlocInitializationSingleton();
            return instance;
        }
        System.out.println("return lazy instance of the class");
        return instance;
    }

}

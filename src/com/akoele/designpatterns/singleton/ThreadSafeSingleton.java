package com.akoele.designpatterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            System.out.println("creating new instance of the class");
            instance = new ThreadSafeSingleton();
            return instance;
        }
        System.out.println("return thread safe instance of the class");
        return instance;
    }

    public static ThreadSafeSingleton getThreadSafeInstance() {
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    System.out.println("double checked locking creating new instance of the class");
                    instance = new ThreadSafeSingleton();
                    return instance;
                }
            }
        }
        System.out.println("double checked locking return thread safe instance of the class");
        return instance;
    }
}

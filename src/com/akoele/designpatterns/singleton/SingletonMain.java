package com.akoele.designpatterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton singleton2 = EagerInitializationSingleton.getInstance();

        System.out.println(singleton1 == singleton2); // true

        StaticBlocInitializationSingleton singleton3 = StaticBlocInitializationSingleton.getInstance();
        StaticBlocInitializationSingleton singleton4 = StaticBlocInitializationSingleton.getInstance();

        LazyBlocInitializationSingleton.getInstance();
        LazyBlocInitializationSingleton.getInstance();

        for(int i = 0; i < 10; i++) {
            ThreadSafeSingleton.getThreadSafeInstance();
        }

    }
}

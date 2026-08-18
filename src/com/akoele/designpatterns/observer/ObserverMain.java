package com.akoele.designpatterns.observer;

import java.util.Scanner;

public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        while (true){
            System.out.println("Saisissez un nombre a convertir");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            subject.setState(number);
        }
    }
}

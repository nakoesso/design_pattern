package com.akoele.designpatterns.chainofresponsability;

import java.util.Scanner;

public class ATMDispenserChain {
    private  Euro50Dispenser euro50Dispenser;

    public ATMDispenserChain() {
        euro50Dispenser = new Euro50Dispenser();
        Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
        Euro10Dispenser euro10Dispenser = new Euro10Dispenser();
        Euro5Dispenser euro5Dispenser1 = new Euro5Dispenser();

        euro50Dispenser.setNextChain(euro20Dispenser);
        euro20Dispenser.setNextChain(euro10Dispenser);
        euro10Dispenser.setNextChain(euro5Dispenser1);
    }

    public static void main(String[] args) {
        ATMDispenserChain dispenser = new ATMDispenserChain();
        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner sc  = new Scanner(System.in);
            amount = sc.nextInt();
            if(amount % 5 != 0){
                System.out.println("The amount should be a multiple of 5");
                return;
            }
            dispenser.euro50Dispenser.dispense(new Currency(amount));
        }

    }
}

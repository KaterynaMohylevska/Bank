package com.mohylevska.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dispenser c1 = new Dollar50Dis();
        Dispenser c2 = new Dollar20Dis();
        Dispenser c3 = new Dollar10Dis();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            c1.dispense(new Currency(amount));
        }
    }
}

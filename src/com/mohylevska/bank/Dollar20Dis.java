package com.mohylevska.bank;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class Dollar20Dis implements Dispenser {
    private Dispenser chain;

    @Override
    public void setNextChain(Dispenser nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;

            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }

            System.out.println("Throw "+ num +" of 20$");
        }
        else{
            this.chain.dispense(cur);
        }
    }
}

package com.mohylevska.bank;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class Dollar10Dis implements Dispenser {
    private Dispenser chain;

    @Override
    public void setNextChain(Dispenser nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;

            if(remainder != 0){
                System.out.println("Amount should be in multiple of 10s.");
            }

            System.out.println("Throw "+ num +" of 10$");
        }
        else{
            this.chain.dispense(cur);
        }
    }
}

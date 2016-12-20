package com.mohylevska.bank;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public interface Dispenser {
    void setNextChain(Dispenser nextChain);
    void dispense(Currency cur);
}


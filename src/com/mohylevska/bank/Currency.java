package com.mohylevska.bank;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class Currency {
    private int current;
    public Currency(int current){
        this.current = current;
    }
    public int getAmount(){
        return this.current;
    }
}

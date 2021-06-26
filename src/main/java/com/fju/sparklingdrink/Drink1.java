package com.fju.sparklingdrink;

public class Drink1 extends Drink{
    public Drink1(){
        no = 1;
    }

    @Override
    public String getName() {
        return "原味";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}

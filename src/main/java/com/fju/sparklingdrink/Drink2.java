package com.fju.sparklingdrink;

public class Drink2 extends Drink{
    public Drink2(){
        no = 2;
    }

    @Override
    public String getName() {
        return "檸檬";
    }

    @Override
    public int getPrice() {
        return 70;
    }
}

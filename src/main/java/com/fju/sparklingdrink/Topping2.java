package com.fju.sparklingdrink;

public class Topping2 extends Topping{
    public Topping2(){
        tno = 2;
    }

    @Override
    public String getName() {
        return "椰果";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

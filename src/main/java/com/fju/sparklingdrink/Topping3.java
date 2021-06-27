package com.fju.sparklingdrink;

public class Topping3 extends Topping{
    public Topping3(){
        tno = 3;
    }

    @Override
    public String getName() {
        return "蘆薈";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

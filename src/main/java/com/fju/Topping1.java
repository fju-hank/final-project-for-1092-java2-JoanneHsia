package com.fju;

import com.fju.Topping;

public class Topping1 extends Topping {
    public Topping1(){
        tno = 1;
    }

    @Override
    public String getName() {
        return "珍珠";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

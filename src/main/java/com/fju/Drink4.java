package com.fju;

import com.fju.Drink;

public class Drink4 extends Drink {
    public Drink4(){

        no = 4;
    }

    @Override
    public String getName() {

        return "青蘋果";
    }

    @Override
    public int getPrice() {

        return 85;
    }
}

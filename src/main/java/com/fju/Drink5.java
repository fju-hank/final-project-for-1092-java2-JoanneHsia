package com.fju;

import com.fju.Drink;

public class Drink5 extends Drink {
    public Drink5(){

        no = 5;
    }

    @Override
    public String getName() {

        return "水蜜桃";
    }

    @Override
    public int getPrice() {

        return 90;
    }
}

package com.fju.drink;

public class Drink1 extends Drink{
        public Drink1() {
            sparklingWater = "original";
            ice1 = "normal";
            ice2 = "less";
            ice3 = "no";
            topping1 = "珍珠";
            topping2 = "椰果";
            topping3 = "芋園";

        }

    @Override
    public String getName() {
            return "Drink1";
    }

    @Override
    public int getPrice() {
            return 60;
    }
}

package com.fju.drink;

public class Drink6 extends Drink{
        public Drink6() {
            sparklingWater = "Grape";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

        }

    @Override
    public String getName() {

            return "Drink6";
    }

    @Override
    public int getPrice() {

            return 85;
    }
}

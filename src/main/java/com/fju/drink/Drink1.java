package com.fju.drink;

public class Drink1 extends Drink{
        public Drink1() {
            sparklingWater = "Original";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

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

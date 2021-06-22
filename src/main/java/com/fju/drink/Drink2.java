package com.fju.drink;

public class Drink2 extends Drink{
        public Drink2() {
            sparklingWater = "Lemon";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

        }

    @Override
    public String getName() {
            return "Drink2";
    }

    @Override
    public int getPrice() {
            return 70;
    }
}

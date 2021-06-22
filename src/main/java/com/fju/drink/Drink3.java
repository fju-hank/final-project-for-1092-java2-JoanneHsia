package com.fju.drink;

public class Drink3 extends Drink{
        public Drink3() {
            sparklingWater = "Green apple";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

        }

    @Override
    public String getName() {

            return "Drink3";
    }

    @Override
    public int getPrice() {

            return 85;
    }
}

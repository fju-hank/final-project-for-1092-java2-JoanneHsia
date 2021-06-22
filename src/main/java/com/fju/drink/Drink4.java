package com.fju.drink;

public class Drink4 extends Drink{
        public Drink4() {
            sparklingWater = "Apple";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

        }

    @Override
    public String getName() {

            return "Drink4";
    }

    @Override
    public int getPrice() {

            return 80;
    }
}

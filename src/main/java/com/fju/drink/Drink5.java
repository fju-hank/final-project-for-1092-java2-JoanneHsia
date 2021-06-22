package com.fju.drink;

public class Drink5 extends Drink{
        public Drink5() {
            sparklingWater = "Peach";
            ice1 = "Regular ice";
            ice2 = "Less ice";
            ice3 = "No ice";
            topping1 = "pearl";
            topping2 = "coconut jelly";
            topping3 = "aloe";

        }

    @Override
    public String getName() {

            return "Drink5";
    }

    @Override
    public int getPrice() {

            return 90;
    }
}

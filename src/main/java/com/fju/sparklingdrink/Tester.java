package com.fju.sparklingdrink;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Drink[] drinks = {new Drink1(),new Drink2(),new Drink3(),new Drink4(), new Drink5(), new Drink6(), new Drink7(),new Drink8(), new Drink9(),new Drink10()};
        Ice[] ices = {new Ice1(), new Ice2(), new Ice3(), new Ice4()};
        Topping[] toppings = {new Topping1(), new Topping2(), new Topping3()};

        int total = 0;
        int end = 1;

        while (end != 0){
            System.out.println("[氣泡水菜單]");
            for (Drink drink : drinks) {
                System.out.print(drink.no);
                System.out.print(drink.getName());
                System.out.println(" $" + drink.getPrice());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("請選擇口味：");
            int kindD = Integer.parseInt(scanner.next());
            //total = total + drinks[kind-1].getPrice();
            System.out.println("你選擇的口味是： " + drinks[kindD-1].getName());
            //System.out.println("金額：" + drinks[kind-1].getPrice());


            System.out.println("[選擇冰量]");
            for (Ice ice : ices) {
                System.out.print(ice.ino + " ");
                System.out.println(ice.getName());
            }
            System.out.println("請選擇冰量：");
            int kind = Integer.parseInt(scanner.next());
            System.out.println("你選擇的冰量是： " + ices[kind-1].getName());

            System.out.println("[加料區]");
            System.out.println("要加料嗎？Y/N");
            String topp = scanner.next();
            if (topp.equals("Y") || topp.equals("y")) {
                System.out.println("[選擇配料]");
                for (Topping topping : toppings) {
                    System.out.print(topping.tno);
                    System.out.print(topping.getName());
                    System.out.println(" $" + topping.getPrice());
                }
                System.out.println("請選擇配料：");
                int kindT = Integer.parseInt(scanner.next());
                //total = total + drinks[kind-1].getPrice();
                System.out.println("你選擇的配料是：" + toppings[kindT-1].getName());
                //System.out.println(" $" + toppings[kind-1].getPrice());
                total = total + drinks[kindD-1].getPrice()+toppings[kindT-1].getPrice();


                System.out.println("累計金額：" + total);
            }else if (topp.equals("N") || topp.equals("n")) {
                total = total + drinks[kindD-1].getPrice();
                System.out.println("累計金額："+total);
            }
            System.out.println("是否繼續選購？1繼續/0結束");
            end = Integer.parseInt(scanner.next());
        }
        System.out.println("總金額：" + total);
    }
}

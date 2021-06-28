package com.fju.sparklingdrink;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Drink[] drinks = {new Drink1(),new Drink2(),new Drink3(),new Drink4(), new Drink5(), new Drink6(), new Drink7(),new Drink8(), new Drink9(),new Drink10()};
        Ice[] ices = {new Ice1(), new Ice2(), new Ice3(), new Ice4()};
        Topping[] toppings = {new Topping1(), new Topping2(), new Topping3()};

        String item = "";
        ArrayList<String> items = new ArrayList<>();

        int total = 0;
        int end = 1;
        int itemLength = 0;
        boolean itemSelect = true;
        Scanner scanner = new Scanner(System.in);
        int kindD = 0;
        int kind = 0;
        int kindT = 0;
        boolean topSelect = true;

        while (end != 0){
            item = "";
            System.out.println("[氣泡水菜單]");
            for (Drink drink : drinks) {
                System.out.print(drink.no);
                System.out.print(drink.getName());
                System.out.println(" $" + drink.getPrice());
            }
            itemLength = drinks.length;

            //選擇口味-選項超出範圍要重新選擇
            itemSelect = true;
            while (itemSelect) {
                try {
                    System.out.println("請選擇口味：");
                    kindD = Integer.parseInt(scanner.next());
                    total = total + drinks[kindD-1].getPrice();
                    item = item + drinks[kindD-1].getName() + "/";
                    System.out.println("你選擇的口味是： " + drinks[kindD-1].getName());
                    itemSelect = false;
                }catch (Exception e) {
                    //重新選擇
                }
            }


            System.out.println("[選擇冰量]");
            for (Ice ice : ices) {
                System.out.print(ice.ino + " ");
                System.out.println(ice.getName());
            }

            //選擇冰量-選項超出範圍要重新選擇
            itemSelect = true;
            while (itemSelect) {
                try {
                    System.out.println("請選擇冰量：");
                    kind = Integer.parseInt(scanner.next());
                    item = item + ices[kind-1].getName() + "/";
                    System.out.println("你選擇的冰量是： " + ices[kind-1].getName());
                    itemSelect = false;
                }catch (Exception e) {
                    //重新選擇
                }
            }

            //是否加料-選項超出範圍要重新選擇
            topSelect = true;
            while (topSelect) {
                topSelect = false;
                System.out.println("[加料區]");
                for (Topping topping : toppings) {
                    System.out.print(topping.tno);
                    System.out.print(topping.getName());
                    System.out.println(" $" + topping.getPrice());
                }
                System.out.println("要加料嗎？Y/N");
                String topp = scanner.next();

                if (topp.equals("Y") || topp.equals("y")) {
                    System.out.println("[選擇配料]");
                    for (Topping topping : toppings) {
                        System.out.print(topping.tno);
                        System.out.print(topping.getName());
                        System.out.println(" $" + topping.getPrice());
                    }
                    //選擇配料-選項超出範圍要重新選擇
                    itemSelect = true;
                    while (itemSelect) {
                        try {
                            System.out.println("請選擇配料：");
                            kindT = Integer.parseInt(scanner.next());
                            total = total + toppings[kindT-1].getPrice();
                            item = item + toppings[kindT-1].getName();
                            System.out.println("你選擇的配料是：" + toppings[kindT-1].getName());

                            System.out.println("累計金額：" + total);
                            itemSelect = false;
                        }catch (Exception e) {
                            //重新選擇
                        }
                    }

                }else if (topp.equals("N") || topp.equals("n")) {
                    //total = total;
                    System.out.println("累計金額："+total);
                }else {
                    //重新選擇
                    topSelect = true;
                }
            }

            items.add(item);

            System.out.println("是否繼續選購？1繼續/0結束");
            end = Integer.parseInt(scanner.next());
        }

        System.out.println("[您的購買清單]");
        items.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("總金額：" + total);
    }
}

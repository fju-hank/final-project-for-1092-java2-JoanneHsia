package com.fju.sparklingdrink;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Drink[] drinks = {new Drink1(),new Drink2(),new Drink3(),new Drink4(),new Drink5(),
                new Drink6(),new Drink7(),new Drink8(), new Drink9(),new Drink10()};

        Ice[] ices = {new Ice1(), new Ice2(), new Ice3(), new Ice4()};

        System.out.println("[氣泡水菜單]");
        for (Drink drink : drinks) {
            System.out.print(drink.no);
            System.out.print(drink.getName());
            System.out.println(" $" + drink.getPrice());
        }
        /*
        System.out.println(drinks[0].no);
        System.out.println(drinks[0].getName());
        System.out.println(drinks[0].getPrice());
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("請選擇口味：");
        int kind = Integer.parseInt(scanner.next());
        System.out.println("你選擇的口味是： " + drinks[kind-1].getName());
        //System.out.println("金額：" + drinks[kind-1].getPrice());


        System.out.println("[選擇冰量]");
        for (Ice ice : ices) {
            System.out.print(ice.ino + " ");
            System.out.println(ice.getName());
        }

        System.out.println("請選擇冰量：");
        kind = Integer.parseInt(scanner.next());
        System.out.println("你選擇的冰量是： " + ices[kind-1].getName());



    }
}

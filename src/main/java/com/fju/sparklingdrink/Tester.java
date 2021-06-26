package com.fju.sparklingdrink;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Drink[] drinks = {new Drink1(), new Drink2()};
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
        System.out.println("金額：" + drinks[kind-1].getPrice());


    }
}

package com.fju.drink;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Drink[] drink = {new Drink1(), new Drink2(), new Drink3(), new Drink4(), new Drink5(), new Drink6()};
        System.out.println("[氣泡飲菜單] original/lemon/green apple/apple");
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入想喝的口味：");
        String sparklingWater = scanner.nextLine();
        System.out.println("[選擇冰量]");
        String ice = scanner.nextLine();

        System.out.println("[是否加料？]");
        System.out.println(sparklingWater + "sparklingwater" + "冰量："+ ice);


        System.out.println(drink[1].getName() + " 價錢："+drink[1].getPrice());
    }
}

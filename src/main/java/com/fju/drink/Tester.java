package com.fju.drink;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("[氣泡飲菜單] original/lemon/green apple/apple");
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入想喝的口味：");
        String sparklingWater = scanner.nextLine();
        System.out.println("[選擇冰量]");
        String ice = scanner.nextLine();
        System.out.println(sparklingWater + "sparklingwater" + "冰量："+ ice);

        Drink1 drink1 = new Drink1();
        System.out.println(drink1.getName() + "價錢："+drink1.getPrice());
    }
}

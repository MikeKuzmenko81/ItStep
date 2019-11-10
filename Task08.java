package ru.mike;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double spedOfSound = 343.1; //скорость звука в м/с при 20 град по Целс
        System.out.println("Сколько времени в секундах прошло между вспышкой молнии и раскатом грома :");
        final double time = scan.nextDouble(); //время в секундах, между вспышкой и раскатом грома
        double s = spedOfSound * time;
        System.out.println("Расстоянии от молнии в метрах : " + s);
    }
}

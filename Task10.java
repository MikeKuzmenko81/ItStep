package ru.mike;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите ваш рост в см:");
        double height = scan.nextDouble();
        System.out.println("Напишите ваш вес в кг:");
        double weight = scan.nextDouble();
        double idealWeight = height - 110;
        if(idealWeight < weight){
            double wrongWeight = weight - idealWeight;
            System.out.println("Вам необходимо сбросить : " + wrongWeight + " кг");
        }else if(idealWeight > weight){
            double wrongWeight = idealWeight - weight;
            System.out.println("Вам необходимо набрать :" + wrongWeight + " кг");
        }else {
            System.out.println("У вас идеальный вес для вашего роста");
        }
    }
}

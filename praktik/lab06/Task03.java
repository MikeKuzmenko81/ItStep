package ru.mike.praktik.lab06;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12");
        int month = scan.nextInt();
        if (month <= 0 && month >=13){
            System.out.println("Нет такого месяца");
        }else{
            if(month <= 2 || month == 12){
                System.out.println("Это ЗИМА");
            }else if(month <= 5){
                System.out.println("Это ВЕСНА");
            }else if (month <= 8){
                System.out.println("Это ЛЕТО");
            }else if (month <= 11){
                System.out.println("Это ОСЕНЬ");
            }
        }
    }
}

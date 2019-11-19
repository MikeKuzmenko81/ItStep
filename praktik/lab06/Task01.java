package ru.mike.praktik.lab06;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введите шестизначное число");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //проверить что в веденной строке 6 символов
        //каждый введеный символ это число
        //if(str.matches("/d{6}/ui")){
        int sumLeft = 0;
        int sumRight = 0;
        String strLeft = "";
        String strRight = "";
        if(str.length() == 6){
            //начинаем считать
            for (int i = 0; i < str.length(); i++){
               int num = Integer.parseInt(str.substring(i, i+1));
               if(i < 3){
                   sumLeft += num;
                   strLeft += num + " + ";
               }else {
                   sumRight += num;
                   strRight += num + " + ";
               }
            }
            if(sumLeft == sumRight){
                System.out.println(strLeft + " == " + strRight);
                System.out.printf("Число %s счастливое", str);
            }else {
                System.out.println(strLeft + " != " + strRight);
                System.out.printf("Число %s НЕ счастливое", str);
            }
        }else {
            System.out.println("Вы ввели не правильное число!!!");
        }
    }
}

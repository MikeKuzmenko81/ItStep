package ru.mike.dz4;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа и операцию которую надо выполнить");
        System.out.print("Напишите первое число ");
        int num1 = scan.nextInt();
        System.out.print("Напишите второе число ");
        int num2 = scan.nextInt();
        System.out.print("Какую операцию надо выполнить? ");
        Scanner sc = new Scanner(System.in);
        String oper = sc.nextLine();

        /*
        if(oper.equals("+")){add(num1, num2);}
        else if(oper.equals("-")){sub(num1, num2);}
        else if(oper.equals("*")){mul(num1, num2);}
        else if(oper.equals("/")){div(num1, num2);}
        */

        switch (oper){
            case "+":{add(num1, num2); break;}
            case "-":{sub(num1, num2); break;}
            case "*":{mul(num1, num2); break;}
            case "/":{div(num1, num2); break;}
            default:{
                System.out.println("Такой операции нет!!!");
            }
        }
    }
    public static void add(int x, int y){
        int result = x + y;
        System.out.printf("Результат %d + %d = %d", x, y, result);
    }
    public static void sub(int x, int y){
        int result = x - y;
        System.out.printf("Результат %d - %d = %d", x, y, result);
    }
    public static void mul(int x, int y){
        int result = x * y;
        System.out.printf("Результат %d * %d = %d", x, y, result);
    }
    public static void div(int x, int y){
        if(y != 0) {
            double result = (double)x / (double)y;
            System.out.printf("Результат %d / %d = %f", x, y, result);
        }else {
            System.out.println("Попытка деления на 0");
        }

    }
}

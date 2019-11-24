package ru.mike.praktik;

import java.util.Scanner;

public class Task01_dz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа");
        System.out.println("Первое число");
        int a = scan.nextInt();
        System.out.println("Второе число");
        int b = scan.nextInt();
        System.out.println("Третье число");
        int c = scan.nextInt();
        calculate(a, b, c);
    }
    static void calculate(int ia, int ib, int ic){
        double srednee = (ia + ib + ic) / 3;
        System.out.println("Среднее арифметическое трех цифр = " + srednee);
    }
}

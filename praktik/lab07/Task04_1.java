package ru.mike.praktik.lab07;

import java.util.Scanner;

public class Task04_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число больше 0: ");
        int num = scan.nextInt();
        int counter = 1;
        int fack = 1;
        if(num > 0){
            while (counter <= num){
                fack *= counter;
                counter++;
            }
            System.out.println("Факториал числа " + num + " = " + fack);
        }
    }
}

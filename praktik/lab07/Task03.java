package ru.mike.praktik.lab07;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число диапазона");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число диапазона");
        int num2 = scan.nextInt();
        int numMin = 0;
        int numMax = 0;
        if(num1 < num2){
            numMin = num1;
            numMax = num2;
        }else {
            numMin = num2;
            numMax = num1;
        }
        int counter = numMin;
        while (counter <= numMax){
            if(counter % 2 != 0){
                System.out.print(counter + " | ");
            }
            ++counter;
        }
    }
}

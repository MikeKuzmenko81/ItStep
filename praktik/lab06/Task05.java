package ru.mike.praktik.lab06;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 0 && num >= 101){
            System.out.println("Это не правильное число");
        } else {
            if (num % 3 == 0){
                System.out.println("FIZZ");
            }else if(num % 5 == 0){
                System.out.println("BUZZ");
            }else if((num % 3 == 0) && (num % 5 == 0)){
                System.out.println("FIZZ BUZZ");
            }else {
                System.out.println(num);
            }
        }
    }
}

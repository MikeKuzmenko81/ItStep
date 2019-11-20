package com.company;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = "";
        while (!num.equals("q")) {
            System.out.print("Введите число, для выхода напишите: \"q\" ");
            num = scan.nextLine();
            if(!num.equals("q")) {
                CheckSign(Integer.parseInt(num));
                CheckOstatok(Integer.parseInt(num));
            }
        }
    }
    public static void CheckSign(int num){
        if(num >= 0){
            System.out.println("Это число положительное");
        }else {
            System.out.println("Это число отрицательное");
        }
    }
    public static void CheckOstatok(int num){
//        if((num % 2) == 0){ System.out.println("Число делится без остатка на 2"); }
//        if((num % 5) == 0){ System.out.println("Число делится без остатка на 5"); }
//        if((num % 3) == 0){ System.out.println("Число делится без остатка на 3"); }
//        if((num % 6) == 0){ System.out.println("Число делится без остатка на 6"); }
//        if((num % 9) == 0){ System.out.println("Число делится без остатка на 9"); }
        if(((num % 2) == 0) && ((num % 5) == 0) && ((num % 3) == 0) && ((num % 6) == 0) && ((num % 9) == 0)){
            System.out.println("Число делится без остатка на числа 2, 3, 5, 6, 9");
        }else {
            System.out.println("Число НЕ делится без остатка на числа 2, 3, 5, 6, 9");
        }
    }
}

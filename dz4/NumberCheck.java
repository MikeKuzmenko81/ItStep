package ru.mike.dz4;

import javax.swing.plaf.IconUIResource;
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
                checkSimple(Integer.parseInt(num));
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
        if(((num % 2) == 0) && ((num % 5) == 0) && ((num % 3) == 0) && ((num % 6) == 0) && ((num % 9) == 0)){
            System.out.println("Число делится без остатка на числа 2, 3, 5, 6, 9");
        }else {
            System.out.println("Число НЕ делится без остатка на числа 2, 3, 5, 6, 9");
        }
    }
    public static void checkSimple(int num){
        int predel = 0;
        if(num % 2 != 0){
            predel = (num / 2) + 1;
        }else {
            predel = (num / 2);
        }
        int count = 2;
        boolean isSimpl = true;
        while (count <= predel){
            if(num % count == 0){
                isSimpl = false;
            }
            count++;
        }
        if(isSimpl){
            System.out.println("Число " + num + " простое");
        }else {
            System.out.println("Число " + num + " составное");
        }
    }
}

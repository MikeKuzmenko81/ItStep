package ru.mike.praktik.lab06;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Введите шестизначное число");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //проверить что в веденной строке 6 символов
        //каждый введеный символ это число
        char leftBord = '0';
        char rightBord = '9';
        String checkStr = "";
        if(str.length() == 6){
            for (int i = 0; i < str.length(); i++){
                if(str.charAt(i) >= leftBord && str.charAt(i) <= rightBord){
                    checkStr += str.charAt(i);
                }
            }
            if(str.equals(checkStr)) {
                //HERE
                char[] arrChar = str.toCharArray();
                for (int i = 0; i < 2; i++){
                    char tmp = arrChar[i];
                    arrChar[i] = arrChar[arrChar.length - 1 - i];
                    arrChar[arrChar.length - 1 - i] = tmp;
                }
                System.out.println(Arrays.toString(arrChar));
                StringBuilder builder = new StringBuilder();
                for(char s : arrChar) {
                    builder.append(s);
                }
                String newStr = builder.toString();
                System.out.println(newStr);
            }else {
                System.out.println("Во введенной строке не все символы были числами!!!");
            }
        }else {
            System.out.println("Во введенной строке не 6 символов!!!");
    }
    }
}

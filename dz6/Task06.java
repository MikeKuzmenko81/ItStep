package ru.mike.dz6;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numIn = scan.nextInt();
        System.out.println("Ввод : " + numIn);
        int desGreat = findDes(numIn, 1);
        int desLess = desGreat / 10;
        int revNum = reversNum(numIn, desGreat, desLess, 1);
        System.out.println("Вывод : " + revNum);

    }
    public static int findDes(int num, int des){
        des *= 10;
        if((num / des) < 1){
            return des;
        }else {
            return findDes(num, des);
        }
    }

    public static int reversNum (int num, int great, int less, int mnogetel){
        int slag = num / less;
        int l = less/10;
        int m = mnogetel * 10;
        if(less > 1){
            num = num % less;
            great /= 10;
            return (slag * mnogetel) + reversNum(num, great, l, m);
        }else {
            return num * mnogetel;
        }
    }
}

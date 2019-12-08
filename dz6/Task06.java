package ru.mike.dz6;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numIn = scan.nextInt();
        int desGreat = findDes(numIn, 1);
        int desLess = desGreat / 10;
        int revNum = reversNum(numIn, desGreat, desLess, 1);
        System.out.println(revNum);

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
        int slag = 0;
        int result = 0;
        int l = less/10;
        if(l > 1){
            slag = num / less;
            num = num % less;
            great /= 10;
            mnogetel *= 10;
            return (slag * mnogetel) + reversNum(num, great, l, mnogetel);
        }else {
            return num * mnogetel;
        }
    }
}

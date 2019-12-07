package ru.mike.dz6;

public class Task03 {
    public static void main(String[] args) {
        int n = 179;
        int sum = sumNumbers(n);
        System.out.println(sum);
    }
    public static int sumNumbers (int num){
        int slag = 0;
        int result = 0;
        if((num < 1000) && (num >= 100)){
            slag = num / 100;
            num = num % 100;
            return slag + sumNumbers(num);
        }else if((num < 100) && (num >= 10)){
            slag = num / 10;
            num = num % 10;
            return slag + sumNumbers(num);
        }else {
            return num;
        }
    }
}

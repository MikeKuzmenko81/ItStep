package ru.mike.dz6;

public class Task04 {
    public static void main(String[] args) {
        int n = 179;
        orderNumbersAsc(n);
    }
    public static void orderNumbersAsc (int number){
        int num = 0;
        if((number < 1000) && (number >= 100)){
            num = number / 100;
            number = number % 100;
            System.out.println(num);
            orderNumbersAsc (number);
        }else if((number < 100) && (number >= 10)){
            num = number / 10;
            number = number % 10;
            System.out.println(num);
            orderNumbersAsc (number);
        }else {
            System.out.println(number);
        }
    }
}

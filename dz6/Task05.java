package ru.mike.dz6;

public class Task05 {
    public static void main(String[] args) {
        int n = 179;
        orderNumbersDesk(n);
    }
    public static void orderNumbersDesk(int number){
        int num = 0;
        if((number < 1000) && (number >= 100)){
            num = number / 100;
            number = number % 100;
            orderNumbersDesk(number);
            System.out.print(" " + num);
        }else if((number < 100) && (number >= 10)){
            num = number / 10;
            number = number % 10;
            orderNumbersDesk(number);
            System.out.print(" " + num);
        }else {
            System.out.print(number);
        }
    }
}

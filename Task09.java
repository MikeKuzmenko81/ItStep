package ru.mike;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        //double a = 3.14;
        System.out.println("Введите число для проверки, в качестве десятичного разделител использовать запятую(,) :");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        double celoe = (double) ((int)number);
        double veshestv = number - celoe;
        if(veshestv == 0.0){
            System.out.println("Число не имеет вещественную часть");
        }else {
            System.out.println("У числа есть вещественная часть");
        }
    }
}

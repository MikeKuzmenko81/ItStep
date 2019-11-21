package ru.mike;

import java.util.Scanner;

public class Conversion {
    static final double EURO_TO_DOL = 1.2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму и курс валюты");
        double sum = scan.nextDouble();
        double curs = scan.nextDouble();
        double res = convert(sum, curs);
        System.out.println(res);
    }

    public static double convert(double sum, double EURO_TO_DOL){
        double result = 0;
        double curs = EURO_TO_DOL;
        if(sum > 0 && curs > 0) {
            result = sum * curs;
        }
        return result;
    }
}

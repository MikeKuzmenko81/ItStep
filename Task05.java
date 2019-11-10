package ru.mike;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите радиус окружности для которой хотите посчитать площадь и длину окружности");
        final double R = scan.nextDouble();

        double squar = Math.PI * Math.pow(R, 2);
        System.out.println("Площадь окуружности : " + squar);

        double length = 2 * Math.PI * R;
        System.out.println("Длина окружности : " + length);
    }
}

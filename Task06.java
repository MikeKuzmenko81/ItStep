package ru.mike;

import javax.crypto.spec.PSource;

public class Task06 {
    public static void main(String[] args) {
        final double width = 24.6;
        final double height = 6.7;

        double perimetr = (width * 2) + (height * 2);
        System.out.println("Периметр прямоугольника : " + perimetr);

        double squar = width * height;
        System.out.println("Площадь прямоугольника : " + squar);
    }
}

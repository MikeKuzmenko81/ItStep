package ru.mike;

public class Task01 {
    public static void main(String[] args) {
        //Целочисленное деление
        int x = 26;
        int y = 4;

        //Целочисленное деление
        int intDivision = x / y;

        //Остаток от деления
        int ostatok = x % y;

        //Квадратный корень
        double sqrt = Math.sqrt(x);

        System.out.println("Целочисленное деление x на y: " + intDivision);
        System.out.println("Остаток от деления x на y: " + ostatok);
        System.out.println("Квадратный корень из x: " + sqrt);
    }
}

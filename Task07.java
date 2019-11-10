package ru.mike;

public class Task07 {
    public static void main(String[] args) {
        double percent = 9.9;
        double amount = 3456;

        amount = amount + (amount * percent) / 100;
        double result = amount + (amount * percent) / 100;

        System.out.println("Через 2 года сумма вклада : " + Math.round(result));
    }
}

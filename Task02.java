package ru.mike;

public class Task02 {
    public static void main(String[] args) {
        int n = 531;
        int sotki = n / 100;
        int des = (n - sotki * 100) / 10;
        int edinic = n - (sotki * 100) - (des * 10);
        int sum = sotki + des + edinic;
        System.out.println(sum);
    }
}

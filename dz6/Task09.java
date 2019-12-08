package ru.mike.dz6;

public class Task09 {
    public static void main(String[] args) {
        int start = 5;
        int finish = 9;
        int sum = sumInterval(start, finish);
        System.out.println(sum);
    }

    public static int sumInterval(int s, int f){
        if(s == f){
            return f;
        }else {
            return s + sumInterval(++s, f);
        }
    }
}

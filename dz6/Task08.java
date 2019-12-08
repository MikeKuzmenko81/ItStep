package ru.mike.dz6;

public class Task08 {
    public static void main(String[] args) {
        int m = 2; //число
        int n = 10; //степень
        int c = 1;
        int res = exanent(m, n, c);
        System.out.println(res);
    }

    public static int exanent(int num, int exp, int count){
        if(exp > count){
            return num * exanent(num, exp, ++count);
        }
        else {
            return num;
        }
    }
}

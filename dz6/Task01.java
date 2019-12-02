package ru.mike.dz6;

public class Task01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        numOrder(a, b);
    }
    public static void numOrder(int start, int end){
        if (start == end){
            System.out.print(end);
        }else if(start < end) {
            int s = start;
            System.out.print(s + " ");
            numOrder(++start, end);
        }else if(start > end){
            int s = start;
            System.out.print(s + " ");
            numOrder(--start, end);
        }
    }
}

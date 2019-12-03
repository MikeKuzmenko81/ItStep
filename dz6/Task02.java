package ru.mike.dz6;

public class Task02 {
    public static void main(String[] args) {
        int n = 1025;
        int i = 1;
        isPow(i, n);
    }
    public static void isPow(int start, int num){
        start *= 2;
        if(start == num){
            System.out.println("YES");
        }else if(start > num) {
            System.out.println("NO");
        }else {
            isPow(start, num);
        }
    }
}

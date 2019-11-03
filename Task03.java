package ru.mike;

public class Task03 {
    public static void main(String[] args) {
        float n = 21.49999f;
        int unit = (int)n;
        float f = n - unit;
        int result;
        if(f < 0.5f){
            result = unit;
        }else {
            result = ++unit;
        }
        System.out.println(result);
    }
}

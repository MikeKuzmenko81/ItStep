package ru.mike.dz6;

public class Task10 {
    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        int c = nod(a, b);
        System.out.println(c);
    }
    public static int nod(int num1, int num2){
        int result = 0;
        int ostatok = 0;
        int tmp = 0;
        if(num2 < num1){
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if(num1 < num2){
            ostatok = num2 % num1;
            if(ostatok == 0){
                result = num1;
            }else {
                result = nod(ostatok, num1);
            }
        }
        return result;
    }
}

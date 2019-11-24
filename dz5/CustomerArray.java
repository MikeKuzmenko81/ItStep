package ru.mike.dz5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        String sizeArr = scan.nextLine();
        int[] array = new int[Integer.parseInt(sizeArr)];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 99);
        }

        String oper = "";
        do {
            //int[] array = {34, 453, 33, 86, 324, 45, 87, 32};
            System.out.println(Arrays.toString(array));
            System.out.println("Какую операцию надо выполнить?");
            System.out.println("Наибольшее - 1\nНаименьшее - 2\nСумма элементов - 3\nСр.Арифмет - 4\nНечет значения - 5\nВыход -q");
            oper = scan.nextLine();
            if(!oper.equals("q")) {
                int op = Integer.parseInt(oper);
                switch (op) {
                    case 1: {
                        System.out.println(minVal(array));
                        break;
                    }
                    case 2: {
                        System.out.println(maxVal(array));
                        break;
                    }
                    case 3: {
                        System.out.println(sumVal(array));
                        break;
                    }
                    case 4: {
                        System.out.println(avarVal(array));
                        break;
                    }
                    case 5: {
                        System.out.println(Arrays.toString(nechetVal(array)));
                        break;
                    }
                    default: {
                        System.out.println("Нет такой операции");
                    }
                }
            }
        } while(!(oper.equals("q")));
    }
    static int minVal(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int maxVal(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int sumVal(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static int avarVal(int[] arr){
        int avr = (int)(sumVal(arr)/arr.length);
        return avr;
    }
    static int[] nechetVal(int[] arr){
        int[] nechet = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                nechet[++index] = arr[i];
            }
        }
        return nechet;
    }
}


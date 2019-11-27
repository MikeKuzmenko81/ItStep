package ru.mike.dz5;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        String sizeArr = scan.nextLine();
        int[] arr = new int[Integer.parseInt(sizeArr)];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 99);
        }
        //int[] array = {34, 453, 33, 86, 324, 45, 87, 32};
        System.out.println("Начальный массив");
        System.out.println(Arrays.toString(arr));
        System.out.println("Дополненный массив");
        System.out.println(Arrays.toString(append(arr, (int)(Math.random() * 99))));
    }
    static int[] append(int[] array, int value){
        int[] arResult = new int[array.length + 1];
        arResult[0] = value;
        for (int i = 1; i < arResult.length; i++){
            arResult[i] = array[i - 1];
        }
        return arResult;
    }
}

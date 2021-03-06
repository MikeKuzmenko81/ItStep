package ru.mike.dz5;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
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
        System.out.println("Перевернутый массив");
        System.out.println(Arrays.toString(myReverse(arr)));

        System.out.println("Часть начального массива");
        System.out.println(Arrays.toString(subArray(arr, 3, 5)));

    }
    static int[] myReverse(int[] array){
        int temp = 0;
        for (int i = 0; i < (int)(array.length/2); i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    static int[] subArray(int[] array, int index, int count){
        int[] resultArr = new int[count];
        for (int i = index, c = 0; c < count; i++, c++){
            if(i < array.length) {
                resultArr[c] = array[i];
            }else {
                resultArr[c] = 1;
            }
        }

        return resultArr;
    }
}
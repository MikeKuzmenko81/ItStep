package ru.mike.dz7;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[][] arr = edinMatrix(4);
        int[][] nol = nolMatrix(5);
        printer(arr);
        printer(nol);
    }
    public static int[][] edinMatrix(int size){
        int[][] result = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }

    public static int[][] nolMatrix(int size){
        int[][] result = new int[size][size];
        return result;
    }

    public static void printer(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

package ru.mike.dz7;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[][] arr = edinMatrix(3);
        int[][] nol = nolMatrix(3);
        int[][] slag1 = genRandMatrix(3);
        int[][] slag2 = genRandMatrix(3);
        int[][] arSum = sumMatrix(slag1, slag2);

        int[][] mnog1 = genRandMatrix(3);
        int[][] mnog2 = genRandMatrix(3);
        int[][] arMultiple = multMatrix(mnog1, mnog2);


        System.out.println("Единичная матрица");
        printer(arr);
        System.out.println("____________");
        System.out.println("Нулевая матрица");
        printer(nol);
        System.out.println("____________");
        System.out.println("Сложение матриц");
        printer(slag1);
        System.out.println("+");
        printer(slag2);
        System.out.println("=");
        printer(arSum);
        System.out.println("____________");
        System.out.println("Умножение матриц");
        printer(mnog1);
        System.out.println("*");
        printer(mnog2);
        System.out.println("=");
        printer(arMultiple);

        //printer(genRandMatrix(5));
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

    private static int[][] sumMatrix(int[][] slag1, int[][] slag2) {
        int[][] result = new int[slag1.length][slag1.length];
        if(slag1.length == slag2.length){
            for(int i = 0; i < slag1.length; i++){
                for(int j = 0; j < slag2.length; j++){
                    result[i][j] = slag1[i][j] + slag2[i][j];
                }
            }
        }
        else {
            System.out.println("Матрицы разных размеров складывать нельзя");
            return result;
        }
        return result;
    }

    private static int[][] multMatrix(int[][] mnog1, int[][] mnog2) {
        int[][] result = new int[mnog1[0].length][mnog2.length];
        int item;
        if(mnog1.length == mnog2[0].length) {
            for (int i = 0; i < mnog1.length; i++) {
                item = 0;
                for (int j = 0; j < mnog2.length; j++) {
                    item += mnog1[i][j] + mnog2[j][i];
                    result[i][j] = mnog1[i][j] + mnog2[i][j];
                }
            }
        }else {
            System.out.println("Нельзя перемножать матрицы с размерами : "
                    + mnog1[0].length + "X" + mnog1.length + " и " + mnog2.length + "X" + mnog2[0].length);
            return result;
        }
        return result;
    }

    public static void printer(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[][]genRandMatrix(int size){
        int[][] result = new int[size][size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                result[i][j] = rand.nextInt(50) - 25;
            }
        }
        return result;
    }
}

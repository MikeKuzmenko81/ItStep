package ru.mike.nauroke.lab_19_11_2019;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRekurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        BigInteger value = facktorial(sc.nextInt());
        System.out.printf("Факториал = %1$d", value);
    }
    public static BigInteger facktorial(int val){
        BigInteger result = BigInteger.valueOf(0);
        //System.out.println("begin " + val);

        if(val == 0){
            result = BigInteger.valueOf(1);
        }else {
            result = BigInteger.valueOf(val).multiply(facktorial(val - 1));
        }

        //System.out.println("end " + val);
        return result;
    }
}

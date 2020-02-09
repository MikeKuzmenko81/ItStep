package ru.mike.dz11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
    private static ArrayList<Integer> intList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько чисел в списке будет?");
        int n = Integer.parseInt(bf.readLine());
        System.out.println("Введите " + n + " чисел для заполнения списка.");
        for (int i = 0; i < n; i++){
            int number = Integer.parseInt(bf.readLine());
            setIntegerList(number);
        }
        int minNumber = getMininum(intList);
        System.out.println("Минимальное число в списке = " + minNumber);
    }

    public static void setIntegerList(int number){
        intList.add(number);
    }

    public static int getMininum(List<Integer> list){
        int result = list.get(0);
        for (int item: list) {
           if(item < result){
               result = item;
           }
        }
        return result;
    }
}

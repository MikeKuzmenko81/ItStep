package ru.mike.dz6;

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова для проверки");
        String str = scan.nextLine();
        String[] arWords = str.split(" ");
        //String arResult = iterWords(arWords, 0);
        iterWords(arWords, 0);
    }
    public static String iterWords(String[] arWords, int count){
        String result = "";
        if(count < arWords.length){
            result = arWords[count];
            //System.out.println(result);
            boolean isPoly = isPolindrom(result.toCharArray(), 0, true);
            if(isPoly){
                System.out.print("YES ");
            }else {
                System.out.print("NO ");
            }
            iterWords(arWords, ++count);
        }
        return result;
    }

    public static boolean isPolindrom(char[] word, int pos, boolean check){
        boolean result = check;
        if(pos < (word.length / 2)){
            if((word[pos] == word[(word.length - 1 - pos)]) && check){
                isPolindrom(word, ++pos, true);
            }else{
                result = false;
            }
        }else{
            result = check;
        }
        return result;
    }
}

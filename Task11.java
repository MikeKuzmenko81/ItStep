package ru.mike;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //int secondsLast = 134056;
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите сколько секундо осталось до Нового Года");

        int secondsLast = scan.nextInt();

        final int secInDay = 60 * 60 * 24;
        final int secInHour = 60 * 60;
        final int secInMinut = 60;
        int days = secondsLast / secInDay;
        secondsLast = secondsLast % secInDay;
        int hours = secondsLast / secInHour;
        secondsLast = secondsLast % secInHour;
        int minuts = secondsLast / secInMinut;
        int seconds = secondsLast % secInMinut;

        String[] arrDays = {" дней ", " день ", " дня "};
        String strDays = arrDays[forSklonenie(days)];

        String[] arrHours = {" часов ", " час ", " часа "};
        String strHours = arrHours[forSklonenie(hours)];

        String[] arrMinuts = {" минут ", " минута ", " минуты "};
        String strMinuts = arrMinuts[forSklonenie(minuts)];

        String[] arrSeconds = {" секунд ", " секунда ", " секунды "};
        String strSeconds = arrSeconds[forSklonenie(seconds)];

        System.out.println("До Нового Года осталось :");
        System.out.println(days + strDays + hours + strHours + minuts + strMinuts + seconds + strSeconds);
    }

    public static int forSklonenie(int time){
        int result = 0;
        int num = time % 100;
        int ed = num % 10;
        if((num >= 5 && num <= 20) || (ed >=5 && ed <=9) || (ed == 0)){
            result = 0;
        }else if(ed == 1){
            result = 1;
        }else if((ed >= 2) && (ed <= 4)){
            result = 2;
        }
        return result;
    }
}

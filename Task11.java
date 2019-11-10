package ru.mike;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //int secondsLast = 134056;
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите сколько секундо осталось до Нового Года");

        int secondsLast = scan.nextInt();
        int minuts = secondsLast / 60;
        int hours = minuts / 60;
        int days = hours / 24;
        System.out.println(minuts + " " + hours + " " + days);

        final int secInDay = 60 * 60 * 24;
        final int secInHour = 60 * 60;
        final int secInMinut = 60;
        days = secondsLast / secInDay;
        secondsLast = secondsLast % secInDay;
        hours = secondsLast / secInHour;
        secondsLast = secondsLast % secInHour;
        minuts = secondsLast / secInMinut;
        int seconds = secondsLast % secInMinut;

        String strDays = " ";
        String strHours = " ";
        String strMinuts = " ";
        String strSeconds = " ";

        System.out.println("До Нового Года осталось :");
        System.out.println( strDays + days + strHours + hours + strMinuts + minuts + strSeconds + seconds);
    }
}

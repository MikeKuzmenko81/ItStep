package ru.mike;

public class Task11 {
    public static void main(String[] args) {
        //int secondsLast = 134056;
        int secondsLast = 4611660;
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

        System.out.println(days + " " + hours + " " + minuts + " " + seconds);

    }
}

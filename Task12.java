package ru.mike;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите сколько человек в перых классах :");
        int n = scan.nextInt();
        int normaPirogok = n;
        int normaMoloko = 0;
        final int stakanMolka = 200;
        final int paketMoloka = 900;
        int totalPaketovMoloka = 0;
        int totalPirogok = normaPirogok;
        int totalMoloko = normaMoloko;
        int melkiyUchenik = 0; //ученики с весом меньше 30 кг
        int tmp = 0;


        System.out.println("cлучай когда все ученики весят меньше 30 кг");
        melkiyUchenik = n;
        totalPirogok = normaPirogok + (1 * melkiyUchenik);
        totalMoloko = normaMoloko + (stakanMolka * melkiyUchenik);
        totalPaketovMoloka = totalMoloko / paketMoloka;
        tmp = totalMoloko % paketMoloka;
        if(tmp > 0) totalPaketovMoloka++;
        System.out.println("Если 100% всех учеников меньше 30кг потребуется:");
        System.out.println("Пирожков : " + totalPirogok);
        System.out.println("Пакетов молока : " + totalPaketovMoloka);

        System.out.println("случай если 60%  учеников имеют вес меньше 30 кг");
        melkiyUchenik = (int)(n * 0.6);
        totalPirogok = normaPirogok + (1 * melkiyUchenik);
        totalMoloko = normaMoloko + (stakanMolka * melkiyUchenik);
        totalPaketovMoloka = totalMoloko / paketMoloka;
        tmp = totalMoloko % paketMoloka;
        if(tmp > 0) totalPaketovMoloka++;
        System.out.println("Если 60% всех учеников меньше 30кг потребуется:");
        System.out.println("Пирожков : " + totalPirogok);
        System.out.println("Пакетов молока : " + totalPaketovMoloka);

        System.out.println("случай если 60%  учеников имеют вес меньше 30 кг");
        melkiyUchenik = (int)(n * 0.01);
        totalPirogok = normaPirogok + (1 * melkiyUchenik);
        totalMoloko = normaMoloko + (stakanMolka * melkiyUchenik);
        totalPaketovMoloka = totalMoloko / paketMoloka;
        tmp = totalMoloko % paketMoloka;
        if(tmp > 0) totalPaketovMoloka++;
        System.out.println("Если 1% всех учеников меньше 30кг потребуется:");
        System.out.println("Пирожков : " + totalPirogok);
        System.out.println("Пакетов молока : " + totalPaketovMoloka);
    }
}

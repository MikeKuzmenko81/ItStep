package ru.mike.dz9;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<>();
        ml.add(12);
        ml.add(32);
        ml.add(53);
        ml.add(67);
        ml.add(23);
        ml.add(75);
        ml.remove(3);
        for (int i = 0; i < ml.size(); i++) {
            System.out.println(ml.get(i));
        }

        System.out.println("============================");

        MyDict<String, Integer> md = new MyDict<>();
        md.add("qw", 2);
        md.add("as", 14);
        md.add("tr", 45);
        md.add("we", 64);
        md.add("sd", 34);
        md.add("cv", 65);
        md.add("xc", 75);
        md.add("yt", 45);
        System.out.println("qw = " + md.get("qw"));
        System.out.println("tr = " + md.get("tr"));
        System.out.println("sd = " + md.get("sd"));
        System.out.println("xc = " + md.get("xc"));
    }
}

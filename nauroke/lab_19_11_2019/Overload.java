package ru.mike.nauroke.lab_19_11_2019;

public class Overload {
    static void operation(){
        operation("val", 10, 12.2);
    }
    static void operation(String str){
        operation(str, 12, 23.4);
    }
    static void operation(String str, int value2){
        operation(str, value2, 46.4);
    }
    static void operation(String value1, int value2, double value3){
        System.out.println(value1 + ", " + value2 + "," + value3);
    }

    public static void main(String[] args) {
        operation();
        operation("val2");
        operation("val3", 23);
        operation("val4", 25, 34.5);
    }
}

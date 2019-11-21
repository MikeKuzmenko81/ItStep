package ru.mike.nauroke.lab_19_11_2019;

public class MethodMainOverload {
    public static void main(String[] args) {
        if(args.length > 0){
            int value = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            System.out.println(value);
        }else {
            MethodMainOverload obj = new MethodMainOverload();
            main();
        }
    }
    public static void main(){
        System.out.println("Это метод main без аргументов");
    }
}

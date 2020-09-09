package me.decentos.creationalPatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");
        Singleton singleton1 = Singleton.getInstance();

        System.out.println();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}

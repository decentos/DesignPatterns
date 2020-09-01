package me.decentos.behavioralPatterns.state;

public class Demo {
    public static void main(String[] args) {

        BulbContext context = new BulbContext();
        context.performAction();

        context.performAction();

        context.performAction();
    }
}


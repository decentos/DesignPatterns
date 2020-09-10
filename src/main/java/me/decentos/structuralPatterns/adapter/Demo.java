package me.decentos.structuralPatterns.adapter;

public class Demo {
    public static void main(String[] args) {
        new Demo().usePattern();
        new Demo().alternative();
    }

    public void usePattern() {
        RotaryHammer rotaryHammer = new RotaryHammer();
        Drill drill = new Drill();
        rotaryHammer.drill(new SDSadapter(drill));
    }

    public void alternative() {
        RotaryHammer rotaryHammer = new RotaryHammer();
        Drill drill = new Drill();
        rotaryHammer.drill(() -> System.out.println(drill));
    }
}

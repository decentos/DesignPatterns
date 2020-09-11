package me.decentos.structuralPatterns.bridge;

public class MirPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("Mir");
    }
}

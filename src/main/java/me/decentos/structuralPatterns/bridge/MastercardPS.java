package me.decentos.structuralPatterns.bridge;

public class MastercardPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("MastercardPS");
    }
}

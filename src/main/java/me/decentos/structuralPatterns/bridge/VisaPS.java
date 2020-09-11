package me.decentos.structuralPatterns.bridge;

public class VisaPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("VisaPS");
    }
}

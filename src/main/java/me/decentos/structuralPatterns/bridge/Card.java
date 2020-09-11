package me.decentos.structuralPatterns.bridge;

public abstract class Card {

    private final PaymentSystem paymentSystem;

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void info() {
        paymentSystem.printName();
        cardType();
    }

    protected abstract void cardType();
}

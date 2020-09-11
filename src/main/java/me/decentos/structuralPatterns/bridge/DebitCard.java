package me.decentos.structuralPatterns.bridge;

public class DebitCard extends Card {

    public DebitCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Debit card");
    }
}

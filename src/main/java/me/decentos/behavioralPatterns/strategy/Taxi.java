package me.decentos.behavioralPatterns.strategy;

public class Taxi implements Strategy {

    @Override
    public void transportation() {
        System.out.println("Доехать на такси");
    }
}

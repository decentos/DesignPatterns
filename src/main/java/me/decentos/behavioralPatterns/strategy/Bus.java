package me.decentos.behavioralPatterns.strategy;

public class Bus implements Strategy {

    @Override
    public void transportation() {
        System.out.println("Доехать на автобусе");
    }
}

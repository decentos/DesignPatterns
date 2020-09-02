package me.decentos.behavioralPatterns.strategy;

public class Car implements Strategy {

    @Override
    public void transportation() {
        System.out.println("Доехать на машине");
    }
}

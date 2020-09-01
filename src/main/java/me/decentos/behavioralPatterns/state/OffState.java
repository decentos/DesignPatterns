package me.decentos.behavioralPatterns.state;

public class OffState implements State {

    @Override
    public State action() {
        System.out.println("Темно");
        return StateProvider.getOnState();
    }
}

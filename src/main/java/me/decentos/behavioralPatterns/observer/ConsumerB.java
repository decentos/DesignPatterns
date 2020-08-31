package me.decentos.behavioralPatterns.observer;

public class ConsumerB {

    /*
     * Big and fat class
     */

    private final Listener listener = data -> System.out.println("ConsumerB data:" + data);

    public Listener getListener() {
        return listener;
    }
}

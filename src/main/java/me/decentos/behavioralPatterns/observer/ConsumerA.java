package me.decentos.behavioralPatterns.observer;

public class ConsumerA implements Listener {

    @Override
    public void onUpdate(String data) {
        System.out.println("ConsumerA data:" + data);
    }
}

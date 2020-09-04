package me.decentos.creationalPatterns.abstractfactory.led;

import me.decentos.creationalPatterns.abstractfactory.Lampholder;

public class LampholderLed implements Lampholder {

    @Override
    public void hold() {
        System.out.println("Led hold");
    }
}

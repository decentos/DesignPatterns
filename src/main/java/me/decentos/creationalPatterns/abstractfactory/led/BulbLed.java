package me.decentos.creationalPatterns.abstractfactory.led;

import me.decentos.creationalPatterns.abstractfactory.Bulb;

public class BulbLed implements Bulb {

    @Override
    public void light() {
        System.out.println("Led light");
    }
}

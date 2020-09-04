package me.decentos.creationalPatterns.abstractfactory.led;

import me.decentos.creationalPatterns.abstractfactory.AbstractFactory;
import me.decentos.creationalPatterns.abstractfactory.Bulb;
import me.decentos.creationalPatterns.abstractfactory.Lampholder;

public class LedFactory implements AbstractFactory {

    @Override
    public Bulb createBulb() {
        return new BulbLed();
    }

    @Override
    public Lampholder createLampholder() {
        return new LampholderLed();
    }
}

package me.decentos.creationalPatterns.abstractfactory.updated;

import me.decentos.creationalPatterns.abstractfactory.AbstractFactory;
import me.decentos.creationalPatterns.abstractfactory.led.LedFactory;

public class LedStrategy implements Strategy {

    @Override
    public AbstractFactory configuration() {
        return new LedFactory();
    }
}

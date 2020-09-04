package me.decentos.creationalPatterns.abstractfactory.updated;

import me.decentos.creationalPatterns.abstractfactory.AbstractFactory;
import me.decentos.creationalPatterns.abstractfactory.Bulb;
import me.decentos.creationalPatterns.abstractfactory.Lampholder;

public class Demo {

    public Demo(AbstractFactory abstractFactory) {
        Bulb bulb = abstractFactory.createBulb();
        Lampholder lampholder = abstractFactory.createLampholder();

        bulb.light();
        lampholder.hold();
    }

    public static AbstractFactory configuration(Strategy strategy) {
        return strategy.configuration();
    }

    public static void main(String[] args) {
        new Demo(configuration(new LedStrategy()));
        new Demo(configuration(new LuminescentStrategy()));
    }
}

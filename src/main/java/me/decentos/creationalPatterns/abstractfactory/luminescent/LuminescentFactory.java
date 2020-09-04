package me.decentos.creationalPatterns.abstractfactory.luminescent;

import me.decentos.creationalPatterns.abstractfactory.AbstractFactory;
import me.decentos.creationalPatterns.abstractfactory.Bulb;
import me.decentos.creationalPatterns.abstractfactory.Lampholder;

public class LuminescentFactory implements AbstractFactory {

    @Override
    public Bulb createBulb() {
        return new BulbLuminescent();
    }

    @Override
    public Lampholder createLampholder() {
        return new LampholderLuminescent();
    }
}

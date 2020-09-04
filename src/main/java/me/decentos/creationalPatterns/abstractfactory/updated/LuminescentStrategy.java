package me.decentos.creationalPatterns.abstractfactory.updated;

import me.decentos.creationalPatterns.abstractfactory.AbstractFactory;
import me.decentos.creationalPatterns.abstractfactory.luminescent.LuminescentFactory;

public class LuminescentStrategy implements Strategy {

    @Override
    public AbstractFactory configuration() {
        return new LuminescentFactory();
    }
}

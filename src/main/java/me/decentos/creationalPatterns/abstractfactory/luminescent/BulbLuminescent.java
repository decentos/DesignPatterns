package me.decentos.creationalPatterns.abstractfactory.luminescent;

import me.decentos.creationalPatterns.abstractfactory.Bulb;

public class BulbLuminescent implements Bulb {

    @Override
    public void light() {
        System.out.println("Luminescent light");
    }
}

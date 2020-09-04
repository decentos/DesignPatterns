package me.decentos.creationalPatterns.abstractfactory.luminescent;

import me.decentos.creationalPatterns.abstractfactory.Lampholder;

public class LampholderLuminescent implements Lampholder {

    @Override
    public void hold() {
        System.out.println("Luminescent light");
    }
}

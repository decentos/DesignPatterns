package me.decentos.creationalPatterns.factorymethod;

public class ConfigurationDB implements Configuration {

    @Override
    public String params() {
        return "params from DB";
    }
}

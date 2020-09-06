package me.decentos.creationalPatterns.factorymethod;

public class ConfigurationFile implements Configuration {

    @Override
    public String params() {
        return "params from file";
    }
}

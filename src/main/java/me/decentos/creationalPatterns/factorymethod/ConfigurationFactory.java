package me.decentos.creationalPatterns.factorymethod;

class ConfigurationFactory {

    static Configuration getConfiguration(String param) {
        if ("file".equals(param)) {
            return new ConfigurationFile();
        } else if ("db".equals(param)) {
            return new ConfigurationDB();
        } else {
            throw new IllegalArgumentException("unknown param:" + param);
        }
    }
}

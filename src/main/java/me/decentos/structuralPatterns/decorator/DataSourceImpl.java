package me.decentos.structuralPatterns.decorator;

public final class DataSourceImpl implements DataSource {

    @Override
    public int getInteger() {
        return 15;
    }
}

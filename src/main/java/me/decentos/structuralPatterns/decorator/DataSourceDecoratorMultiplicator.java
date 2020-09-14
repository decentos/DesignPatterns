package me.decentos.structuralPatterns.decorator;

public class DataSourceDecoratorMultiplicator implements DataSource {

    private final DataSource dataSource;

    public DataSourceDecoratorMultiplicator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int getInteger() {
        return dataSource.getInteger() * 2;
    }
}

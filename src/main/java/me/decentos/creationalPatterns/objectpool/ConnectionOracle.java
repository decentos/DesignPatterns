package me.decentos.creationalPatterns.objectpool;

public class ConnectionOracle implements Connection {

    @Override
    public void connect() {
        System.out.println("connection to Oracle");
    }

    @Override
    public void select() {
        System.out.println("select from Oracle");
    }
}

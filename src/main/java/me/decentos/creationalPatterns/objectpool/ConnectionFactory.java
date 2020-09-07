package me.decentos.creationalPatterns.objectpool;

class ConnectionFactory {

    Connection create() {
        return new ConnectionOracle();
    }
}

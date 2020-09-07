package me.decentos.creationalPatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

class ConnectionPool {
    private final List<Connection> pool;
    private int current = 0;

    ConnectionPool(int size, ConnectionFactory factory) {
        pool = new ArrayList<>(size);
        for (int idx = 0; idx < size; idx++) {
            Connection connection = factory.create();
            connection.connect();
            pool.add(connection);
        }
    }

    Connection get() {
        if (pool.size() == current) {
            throw new RuntimeException("all connection are used");
        }
        return pool.get(current++);
    }
}

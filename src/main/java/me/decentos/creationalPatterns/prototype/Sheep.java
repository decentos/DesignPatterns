package me.decentos.creationalPatterns.prototype;

import java.util.Objects;

class Sheep implements Cloneable {
    private String name;

    Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Sheep clone() {
        return new Sheep(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return Objects.equals(name, sheep.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}

class Sheep2 extends Sheep {
    Sheep2(String name) {
        super(name);
    }
}

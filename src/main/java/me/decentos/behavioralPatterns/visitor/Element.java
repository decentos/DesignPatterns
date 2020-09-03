package me.decentos.behavioralPatterns.visitor;

public interface Element {

    void accept(Visitor v);
}

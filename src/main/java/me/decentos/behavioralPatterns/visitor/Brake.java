package me.decentos.behavioralPatterns.visitor;

public class Brake implements Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    String replaceBrakePad() {
        return "Заменить тормозные колодки";
    }
}

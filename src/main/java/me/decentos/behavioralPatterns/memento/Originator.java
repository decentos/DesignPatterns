package me.decentos.behavioralPatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

class Originator {
    private final Deque<Memento> stack = new ArrayDeque<>();

    void saveState(State state) {
        stack.push(new Memento(state));
    }

    State restoreState() {
        return stack.pop().getState();
    }
}

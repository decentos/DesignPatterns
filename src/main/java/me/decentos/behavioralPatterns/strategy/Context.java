package me.decentos.behavioralPatterns.strategy;

class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void applyStrategy() {
        strategy.transportation();
    }
}

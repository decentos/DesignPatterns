package me.decentos.behavioralPatterns.state;

class BulbContext {

    private State state = StateProvider.getOffState();

    void performAction() {
        this.setState(state.action());
    }

    void setState(State state) {
        this.state = state;
    }
}

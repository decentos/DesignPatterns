package me.decentos.behavioralPatterns.state;

public class StateProvider {
    private static final State onState = new OnState();
    private static final State offState = new OffState();

    public static State getOnState() {
        return onState;
    }

    public static State getOffState() {
        return offState;
    }
}

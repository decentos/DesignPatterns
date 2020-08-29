package me.decentos.behavioralPatterns.command;

public class AdderABC implements Command {

    @Override
    public String execute(String data) {
        return data + "ABC";
    }
}

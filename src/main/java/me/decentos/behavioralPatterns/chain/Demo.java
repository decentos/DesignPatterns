package me.decentos.behavioralPatterns.chain;

public class Demo {
    public static void main(String[] args) {
        Application app = new Application();

        AppProcessor input = new AppInput();
        AppProcessor reader = new AppReader();
        AppProcessor result = new AppResult();

        input.setNext(reader);
        reader.setNext(result);

        input.process(app);
        app.printHistory();
    }
}

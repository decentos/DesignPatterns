package me.decentos.behavioralPatterns.chain;

public class AppInput extends AppProcessor {

    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление принято");
    }

    @Override
    public String getProcessorName() {
        return "Прием заявления";
    }
}

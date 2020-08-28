package me.decentos.behavioralPatterns.chain;

public class AppReader extends AppProcessor {

    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление рассмотрено");
    }

    @Override
    public String getProcessorName() {
        return "Рассмотрение заявления";
    }
}

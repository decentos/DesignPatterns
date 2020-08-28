package me.decentos.behavioralPatterns.chain;

public class AppResult extends AppProcessor {

    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Результат выдан");
    }

    @Override
    public String getProcessorName() {
        return "Выдача результата";
    }
}

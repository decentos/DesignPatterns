package me.decentos.behavioralPatterns.chain;

abstract class AppProcessor {
    private AppProcessor next;

    private AppProcessor getNext() {
        return next;
    }

    void setNext(AppProcessor next) {
        this.next = next;
    }

    void process(Application application) {
        before();
        processInternal(application);
        after();
        if (getNext() != null) {
            getNext().process(application);
        }
    }

    protected abstract void processInternal(Application application);

    public abstract String getProcessorName();

    private void before() {
        System.out.println("before:" + getProcessorName());
    }

    private void after() {
        System.out.println("after:" + getProcessorName());
    }
}

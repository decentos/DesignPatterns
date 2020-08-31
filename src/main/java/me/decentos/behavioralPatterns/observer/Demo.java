package me.decentos.behavioralPatterns.observer;

public class Demo {
    public static void main(String[] args) {
        EventProducer producer = new EventProducer();
        ConsumerA consumerA = new ConsumerA();
        ConsumerB consumerB = new ConsumerB();

        producer.addListener(consumerA);
        producer.addListener(consumerB.getListener());

        producer.event("eventA");
        producer.event("eventB");

        producer.removeListener(consumerA);
        producer.removeListener(consumerB.getListener());

        producer.event("eventC");
        producer.event("eventD");
    }
}

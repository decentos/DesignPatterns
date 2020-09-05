package me.decentos.creationalPatterns.builder;

public class Demo {
    public static void main(String[] args) {
        // Bad practice
        BigObject bigObject1 = new BigObject(null, "2", null, "4", "5");
        System.out.println(bigObject1);

        // Good practice
        BigObject bigObject2 = new BigObject.BigObjectBuilder("1")
                .withParam2("2")
                .withParam3("3")
                //.withParam4("4")
                .withParam5("5")
                .build();
        System.out.println(bigObject2);
    }
}

package me.decentos.creationalPatterns.builder;

public class BigObject {
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;

    public BigObject(String param1, String param2, String param3, String param4, String param5) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
    }

    private BigObject(BigObjectBuilder builder) {
        this.param1 = builder.param1;
        this.param2 = builder.param2;
        this.param3 = builder.param3;
        this.param4 = builder.param4;
        this.param5 = builder.param5;
    }

    @Override
    public String toString() {
        return "BigObject{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                ", param5='" + param5 + '\'' +
                '}';
    }

    public static class BigObjectBuilder {
        private final String param1;
        private String param2;
        private String param3;
        private String param4;
        private String param5;

        BigObjectBuilder(String param1) {
            this.param1 = param1; //mandatory
        }

        BigObjectBuilder withParam2(String param2) {
            this.param2 = param2;
            return this; //fluent
        }

        BigObjectBuilder withParam3(String param3) {
            this.param3 = param3;
            return this;
        }

        public BigObjectBuilder withParam4(String param4) {
            this.param4 = param4;
            return this;
        }

        BigObjectBuilder withParam5(String param5) {
            this.param5 = param5;
            return this;
        }

        BigObject build() {
            return new BigObject(this);
        }
    }
}

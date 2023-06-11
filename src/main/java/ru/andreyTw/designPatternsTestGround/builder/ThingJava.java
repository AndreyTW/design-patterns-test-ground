package ru.andreyTw.designPatternsTestGround.builder;

public class ThingJava {

    // object fields
    private final String name;
    private final int weight;
    private final String feature;
    private final int dangerousness;

    // object constructor
    private ThingJava(String name, int weight, String feature, int dangerousness) {
        this.name = name;
        this.weight = weight;
        this.feature = feature;
        this.dangerousness = dangerousness;
    }

    public void print() {
        System.out.println("\nMonster info:" +
                "\n\tname: " + this.name +
                "\n\tweight: " + this.weight +
                "\n\tfeature: " + this.feature +
                "\n\tdangerousness: " + this.dangerousness);
    }

    // director?
    public static ThingJavaBuilder builder() {
        return new ThingJavaBuilder();
    }

    // builder
    public static class ThingJavaBuilder {

        private String name = "Unknown thing";
        private int weight = 1000;
        private String feature = "WTF";
        private int dangerousness = 50;

        public ThingJavaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ThingJavaBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public ThingJavaBuilder setFeature(String feature) {
            this.feature = feature;
            return this;
        }

        public ThingJavaBuilder setDangerousness(int dangerousness) {
            this.dangerousness = dangerousness;
            return this;
        }

        public ThingJava build() {
            return new ThingJava(name, weight, feature, dangerousness);
        }
    }
}


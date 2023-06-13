package ru.andreyTw.designPatternsTestGround.builder;

public class BuilderJavaTestGround {
    public static void main(String[] args) {

        ThingJava unknownThingJava = ThingJava.builder().build();
        ThingJava cuteThingJava = ThingJava.builder()
                .setName("Cutie")
                .setWeight(5)
                .setFeature("Very sweet")
                .setDangerousness(0)
                .build();
        ThingJava dangerThingJava = ThingJava.builder()
                .setFeature("Danger as covid")
                .setDangerousness(100)
                .setName("Devastator")
                .setWeight(500)
                .build();

        unknownThingJava.print();
        cuteThingJava.print();
        dangerThingJava.print();

        ThingJavaLombok lombokThingJava = ThingJavaLombok.builder()
                .name("Cutie")
                .weight(5)
                .feature("Very sweet")
                .dangerousness(0)
                .build();

        System.out.println(lombokThingJava);

    }
}

package ru.andreyTw.designPatternsTestGround.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ThingJavaLombok {
    private final String name;
    private final int weight;
    private final String feature;
    private final int dangerousness;
}
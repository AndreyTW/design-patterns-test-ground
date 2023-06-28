package ru.andreyTw.designPatternsTestGround.observer;

public class Trader implements Observer {
    String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(int oilPrice) {
        System.out.println("Message for " + name + ":\n\t--> current oil price is " + oilPrice + "!");
    }
}

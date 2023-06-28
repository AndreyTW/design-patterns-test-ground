package ru.andreyTw.designPatternsTestGround.observer;

import java.util.ArrayList;
import java.util.List;

public class OilMarket implements Observed {
    int oilPrice = 100;
    List<Observer> traders = new ArrayList<>();

    public void setCurrentOilPrice() {
        this.oilPrice = (int) ((Math.random() - 0.5) * 100 + 50);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.traders.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.traders.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : traders) {
            observer.handleEvent(this.oilPrice);
        }
    }
}

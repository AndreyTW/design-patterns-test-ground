package ru.andreyTw.designPatternsTestGround.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OilMarket oilMarket = new OilMarket();

        Observer firstTrader = new Trader("Vasya Rogov");
        Observer secondTrader = new Trader("Ivan Dulin");
        Observer thirdTrader = new Trader("Sergey Gluharev");

        oilMarket.addObserver(firstTrader);
        oilMarket.addObserver(secondTrader);
        oilMarket.addObserver(thirdTrader);

        while (true) {
            Thread.sleep(2000);
            oilMarket.setCurrentOilPrice();
        }
    }
}

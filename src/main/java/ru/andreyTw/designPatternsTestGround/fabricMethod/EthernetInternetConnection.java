package ru.andreyTw.designPatternsTestGround.fabricMethod;

public class EthernetInternetConnection implements InternetConnection {

    private final String ip;

    public EthernetInternetConnection(String ip) {
        this.ip = ip;
    }

    @Override
    public void connect() {
        //
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public void disconnect() {
//
    }
}

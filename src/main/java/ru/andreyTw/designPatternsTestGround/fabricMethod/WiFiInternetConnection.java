package ru.andreyTw.designPatternsTestGround.fabricMethod;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class WiFiInternetConnection implements InternetConnection {

    private final String bsid;

    private final String password;

    @Override
    public void connect() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void disconnect() {

    }
}

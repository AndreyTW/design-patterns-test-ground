package ru.andreyTw.designPatternsTestGround.fabricMethod;

public class FabricMethodJavaTestGround {

    public static InternetConnection createInternetConnection(InternetConnectionEnum type) {
        switch (type) {
            case ETHERNET -> {
                return new EthernetInternetConnection("10.10.10.01");
            }
            case WI_FI -> {
                return new WiFiInternetConnection("my_network", "se!ret");
            }
            default -> {
                return new InternetConnection() {
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
                };
            }
        }
    }

    public static void main(String[] args) {
        // val == final var
        // var == var
        final var internetConnection =
                FabricMethodJavaTestGround.createInternetConnection(InternetConnectionEnum.ETHERNET);
    }


}

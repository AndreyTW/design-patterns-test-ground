package ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.SoftwareEngineer;

public class SeaVesselSoftwareEngineer implements SoftwareEngineer {
    @Override
    public void developSoftware() {
        System.out.println("Developing sophisticated software for new modern boat...");
    }
}

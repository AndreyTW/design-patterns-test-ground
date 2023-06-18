package ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.SoftwareEngineer;

public class AircraftSoftwareEngineer implements SoftwareEngineer {
    @Override
    public void developSoftware() {
        System.out.println("Developing sophisticated software for new transport helicopter...");
    }
}

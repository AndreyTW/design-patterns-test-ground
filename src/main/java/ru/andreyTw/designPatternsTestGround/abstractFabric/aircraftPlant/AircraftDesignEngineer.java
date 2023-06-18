package ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.DesignEngineer;

public class AircraftDesignEngineer implements DesignEngineer {
    @Override
    public void developDesign() {
        System.out.println("Developing new transport helicopter design...");
    }
}

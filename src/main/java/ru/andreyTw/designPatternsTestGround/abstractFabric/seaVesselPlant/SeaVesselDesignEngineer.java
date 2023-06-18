package ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.DesignEngineer;

public class SeaVesselDesignEngineer implements DesignEngineer {
    @Override
    public void developDesign() {
        System.out.println("Developing new modern boat design...");
    }
}

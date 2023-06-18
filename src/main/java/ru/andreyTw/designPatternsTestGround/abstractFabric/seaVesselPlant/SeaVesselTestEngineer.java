package ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.TestEngineer;

public class SeaVesselTestEngineer implements TestEngineer {
    @Override
    public void testUnit() {
        System.out.println("Living in the port and kicking new modern boat unit...");
    }
}

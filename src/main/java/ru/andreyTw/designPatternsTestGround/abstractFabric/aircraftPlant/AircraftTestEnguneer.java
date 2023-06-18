package ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.TestEngineer;

public class AircraftTestEnguneer implements TestEngineer {
    @Override
    public void testUnit() {
        System.out.println("Living in the airfield and kicking new transport helicopter unit...");
    }
}

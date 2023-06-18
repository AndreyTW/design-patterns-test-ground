package ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.EquipmentAssembler;

public class AircraftEquipmentAssembler implements EquipmentAssembler {
    @Override
    public void assembleUnit() {
        System.out.println("Assembling new transport helicopter unit...");
    }
}

package ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.EquipmentAssembler;

public class SeaVesselEquipmentAssembler implements EquipmentAssembler {
    @Override
    public void assembleUnit() {
        System.out.println("Assembling new modern boat unit...");
    }
}

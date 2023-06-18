package ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.*;

public class SeaVesselPlantStaffFactory implements PlantStaffFactory {
    @Override
    public DesignEngineer getDesignEngineer() {
        return new SeaVesselDesignEngineer();
    }

    @Override
    public SoftwareEngineer getSoftwareEngineer() {
        return new SeaVesselSoftwareEngineer();
    }

    @Override
    public EquipmentAssembler getEquipmentAssembler() {
        return new SeaVesselEquipmentAssembler();
    }

    @Override
    public TestEngineer getTestEngineer() {
        return new SeaVesselTestEngineer();
    }
}

package ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant;

import ru.andreyTw.designPatternsTestGround.abstractFabric.*;

public class AircraftPlantStaffFactory implements PlantStaffFactory {
    @Override
    public DesignEngineer getDesignEngineer() {
        return new AircraftDesignEngineer();
    }

    @Override
    public SoftwareEngineer getSoftwareEngineer() {
        return new AircraftSoftwareEngineer();
    }

    @Override
    public EquipmentAssembler getEquipmentAssembler() {
        return new AircraftEquipmentAssembler();
    }

    @Override
    public TestEngineer getTestEngineer() {
        return new AircraftTestEnguneer();
    }
}

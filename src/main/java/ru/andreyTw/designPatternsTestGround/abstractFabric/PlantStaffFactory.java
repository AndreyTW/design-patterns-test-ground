package ru.andreyTw.designPatternsTestGround.abstractFabric;

public interface PlantStaffFactory {
    DesignEngineer getDesignEngineer();
    SoftwareEngineer getSoftwareEngineer();
    EquipmentAssembler getEquipmentAssembler();
    TestEngineer getTestEngineer();
}

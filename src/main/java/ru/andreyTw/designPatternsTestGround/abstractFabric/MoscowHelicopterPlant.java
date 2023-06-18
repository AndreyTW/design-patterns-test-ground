package ru.andreyTw.designPatternsTestGround.abstractFabric;

import ru.andreyTw.designPatternsTestGround.abstractFabric.aircraftPlant.AircraftPlantStaffFactory;

public class MoscowHelicopterPlant {
    public static void main(String[] args) {
        PlantStaffFactory plantStaffFactory = new AircraftPlantStaffFactory();

        DesignEngineer designEngineerOne = plantStaffFactory.getDesignEngineer();
        DesignEngineer designEngineerTwo = plantStaffFactory.getDesignEngineer();
        SoftwareEngineer softwareEngineerOne = plantStaffFactory.getSoftwareEngineer();
        SoftwareEngineer softwareEngineerTwo = plantStaffFactory.getSoftwareEngineer();
        EquipmentAssembler equipmentAssembler = plantStaffFactory.getEquipmentAssembler();
        TestEngineer testEngineer = plantStaffFactory.getTestEngineer();

        System.out.println("Moscow helicopter plant is ready for work:");
        designEngineerOne.developDesign();
        designEngineerTwo.developDesign();
        softwareEngineerOne.developSoftware();
        softwareEngineerTwo.developSoftware();
        equipmentAssembler.assembleUnit();
        testEngineer.testUnit();
    }
}

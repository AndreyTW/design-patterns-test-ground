package ru.andreyTw.designPatternsTestGround.abstractFabric;

import ru.andreyTw.designPatternsTestGround.abstractFabric.seaVesselPlant.SeaVesselPlantStaffFactory;

public class BlackSeaShipbuildingPlant {
    public static void main(String[] args) {
        PlantStaffFactory plantStaffFactory = new SeaVesselPlantStaffFactory();

        DesignEngineer designEngineer = plantStaffFactory.getDesignEngineer();
        SoftwareEngineer softwareEngineer = plantStaffFactory.getSoftwareEngineer();
        EquipmentAssembler equipmentAssemblerOne = plantStaffFactory.getEquipmentAssembler();
        EquipmentAssembler equipmentAssemblerTwo = plantStaffFactory.getEquipmentAssembler();
        TestEngineer testEngineer = plantStaffFactory.getTestEngineer();

        System.out.println("Black Sea Shipbuilding plant is ready for work:");
        designEngineer.developDesign();
        softwareEngineer.developSoftware();
        equipmentAssemblerOne.assembleUnit();
        equipmentAssemblerTwo.assembleUnit();
        testEngineer.testUnit();
    }
}

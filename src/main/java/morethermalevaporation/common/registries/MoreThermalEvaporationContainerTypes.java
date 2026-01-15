package morethermalevaporation.common.registries;

import mekanism.common.inventory.container.tile.MekanismTileContainer;
import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationController;

public class MoreThermalEvaporationContainerTypes {
    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister(MoreThermalEvaporation.MODID);

    // Basic
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> BASIC_THERMAL_EVAPORATION_CONTROLLER = CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.BASIC), TileEntityMoreThermalEvaporationController.class);

    // Advanced
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> ADVANCED_THERMAL_EVAPORATION_CONTROLLER = CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ADVANCED), TileEntityMoreThermalEvaporationController.class);

    // Elite
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> ELITE_THERMAL_EVAPORATION_CONTROLLER = CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ELITE), TileEntityMoreThermalEvaporationController.class);

    // Ultimate
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER = CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ULTIMATE), TileEntityMoreThermalEvaporationController.class);

    // Creative
    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> CREATIVE_THERMAL_EVAPORATION_CONTROLLER = CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.CREATIVE), TileEntityMoreThermalEvaporationController.class);


    private MoreThermalEvaporationContainerTypes() {
    }

    public static ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> getContainerType(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_CONTROLLER;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_CONTROLLER;
            case ELITE -> ELITE_THERMAL_EVAPORATION_CONTROLLER;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER;
            case CREATIVE -> CREATIVE_THERMAL_EVAPORATION_CONTROLLER;
        };
    }
}

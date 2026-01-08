package morethermalevaporation.common.registries;

import mekanism.common.registration.impl.TileEntityTypeDeferredRegister;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.base.TileEntityMekanism;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.tile.multiblock.TileEntityMoreThermalEvaporationBlock;
import morethermalevaporation.tile.multiblock.TileEntityMoreThermalEvaporationController;
import morethermalevaporation.tile.multiblock.TileEntityMoreThermalEvaporationValve;

public class MoreThermalEvaporationTileEntityTypes {
    public static final TileEntityTypeDeferredRegister TILE_ENTITY_TYPES = new TileEntityTypeDeferredRegister(MoreThermalEvaporation.MODID);

    // Basic
    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock> BASIC_THERMAL_EVAPORATION_BLOCK =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getBlock(MoreThermalEvaporationTier.BASIC),
                    (pos, state) -> new TileEntityMoreThermalEvaporationBlock(MoreThermalEvaporationTier.BASIC, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve> BASIC_THERMAL_EVAPORATION_VALVE =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getValve(MoreThermalEvaporationTier.BASIC),
                    (pos, state) -> new TileEntityMoreThermalEvaporationValve(MoreThermalEvaporationTier.BASIC, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController> BASIC_THERMAL_EVAPORATION_CONTROLLER =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.BASIC),
                    (pos, state) -> new TileEntityMoreThermalEvaporationController(MoreThermalEvaporationTier.BASIC, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    // Advanced
    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock> ADVANCED_THERMAL_EVAPORATION_BLOCK =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getBlock(MoreThermalEvaporationTier.ADVANCED),
                    (pos, state) -> new TileEntityMoreThermalEvaporationBlock(MoreThermalEvaporationTier.ADVANCED, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve> ADVANCED_THERMAL_EVAPORATION_VALVE =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getValve(MoreThermalEvaporationTier.ADVANCED),
                    (pos, state) -> new TileEntityMoreThermalEvaporationValve(MoreThermalEvaporationTier.ADVANCED, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController> ADVANCED_THERMAL_EVAPORATION_CONTROLLER =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ADVANCED),
                    (pos, state) -> new TileEntityMoreThermalEvaporationController(MoreThermalEvaporationTier.ADVANCED, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    // Elite
    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock> ELITE_THERMAL_EVAPORATION_BLOCK =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getBlock(MoreThermalEvaporationTier.ELITE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationBlock(MoreThermalEvaporationTier.ELITE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve> ELITE_THERMAL_EVAPORATION_VALVE =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getValve(MoreThermalEvaporationTier.ELITE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationValve(MoreThermalEvaporationTier.ELITE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController> ELITE_THERMAL_EVAPORATION_CONTROLLER =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ELITE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationController(MoreThermalEvaporationTier.ELITE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    // Ultimate
    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock> ULTIMATE_THERMAL_EVAPORATION_BLOCK =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getBlock(MoreThermalEvaporationTier.ULTIMATE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationBlock(MoreThermalEvaporationTier.ULTIMATE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve> ULTIMATE_THERMAL_EVAPORATION_VALVE =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getValve(MoreThermalEvaporationTier.ULTIMATE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationValve(MoreThermalEvaporationTier.ULTIMATE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static final TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER =
            TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.getController(MoreThermalEvaporationTier.ULTIMATE),
                    (pos, state) -> new TileEntityMoreThermalEvaporationController(MoreThermalEvaporationTier.ULTIMATE, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient
            );

    public static TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock> getTileEntityTypeBlock(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_BLOCK;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_BLOCK;
            case ELITE -> ELITE_THERMAL_EVAPORATION_BLOCK;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_BLOCK;
        };
    }

    public static TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve> getTileEntityTypeValve(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_VALVE;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_VALVE;
            case ELITE -> ELITE_THERMAL_EVAPORATION_VALVE;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_VALVE;
        };
    }

    public static TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController> getTileEntityTypeController(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_CONTROLLER;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_CONTROLLER;
            case ELITE -> ELITE_THERMAL_EVAPORATION_CONTROLLER;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER;
        };
    }


}


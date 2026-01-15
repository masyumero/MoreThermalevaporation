package morethermalevaporation.common.registries;

import mekanism.api.tier.BaseTier;
import mekanism.common.block.prefab.BlockBasicMultiblock;
import mekanism.common.content.blocktype.BlockTypeTile;
import mekanism.common.registration.impl.BlockDeferredRegister;
import mekanism.common.registration.impl.BlockRegistryObject;
import mekanism.common.tile.base.TileEntityMekanism;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.item.block.ItemBlockMoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationBlock;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationController;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationValve;
import net.minecraft.world.level.material.MapColor;

public class MoreThermalEvaporationBlocks {

    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(MoreThermalEvaporation.MODID);

    // Basic
    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationBlock>, ItemBlockMoreThermalEvaporation> BASIC_THERMAL_EVAPORATION_BLOCK =
            registerMoreThermalEvaporationPart(
                    BaseTier.BASIC,
                    "block",
                    MoreThermalEvaporationBlockTypes.BASIC_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationValve>, ItemBlockMoreThermalEvaporation> BASIC_THERMAL_EVAPORATION_VALVE =
            registerMoreThermalEvaporationPart(
                    BaseTier.BASIC,
                    "valve",
                    MoreThermalEvaporationBlockTypes.BASIC_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationController>, ItemBlockMoreThermalEvaporation> BASIC_THERMAL_EVAPORATION_CONTROLLER =
            registerMoreThermalEvaporationPart(
                    BaseTier.BASIC,
                    "controller",
                    MoreThermalEvaporationBlockTypes.BASIC_THERMAL_EVAPORATION_CONTROLLER
            );

    // Advanced
    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationBlock>, ItemBlockMoreThermalEvaporation> ADVANCED_THERMAL_EVAPORATION_BLOCK =
            registerMoreThermalEvaporationPart(
                    BaseTier.ADVANCED,
                    "block",
                    MoreThermalEvaporationBlockTypes.ADVANCED_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationValve>, ItemBlockMoreThermalEvaporation> ADVANCED_THERMAL_EVAPORATION_VALVE =
            registerMoreThermalEvaporationPart(
                    BaseTier.ADVANCED,
                    "valve",
                    MoreThermalEvaporationBlockTypes.ADVANCED_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationController>, ItemBlockMoreThermalEvaporation> ADVANCED_THERMAL_EVAPORATION_CONTROLLER =
            registerMoreThermalEvaporationPart(
                    BaseTier.ADVANCED,
                    "controller",
                    MoreThermalEvaporationBlockTypes.ADVANCED_THERMAL_EVAPORATION_CONTROLLER
            );

    // Elite
    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationBlock>, ItemBlockMoreThermalEvaporation> ELITE_THERMAL_EVAPORATION_BLOCK =
            registerMoreThermalEvaporationPart(
                    BaseTier.ELITE,
                    "block",
                    MoreThermalEvaporationBlockTypes.ELITE_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationValve>, ItemBlockMoreThermalEvaporation> ELITE_THERMAL_EVAPORATION_VALVE =
            registerMoreThermalEvaporationPart(
                    BaseTier.ELITE,
                    "valve",
                    MoreThermalEvaporationBlockTypes.ELITE_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationController>, ItemBlockMoreThermalEvaporation> ELITE_THERMAL_EVAPORATION_CONTROLLER =
            registerMoreThermalEvaporationPart(
                    BaseTier.ELITE,
                    "controller",
                    MoreThermalEvaporationBlockTypes.ELITE_THERMAL_EVAPORATION_CONTROLLER
            );

    // Ultimate
    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationBlock>, ItemBlockMoreThermalEvaporation> ULTIMATE_THERMAL_EVAPORATION_BLOCK =
            registerMoreThermalEvaporationPart(
                    BaseTier.ULTIMATE,
                    "block",
                    MoreThermalEvaporationBlockTypes.ULTIMATE_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationValve>, ItemBlockMoreThermalEvaporation> ULTIMATE_THERMAL_EVAPORATION_VALVE =
            registerMoreThermalEvaporationPart(
                    BaseTier.ULTIMATE,
                    "valve",
                    MoreThermalEvaporationBlockTypes.ULTIMATE_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationController>, ItemBlockMoreThermalEvaporation> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER =
            registerMoreThermalEvaporationPart(
                    BaseTier.ULTIMATE,
                    "controller",
                    MoreThermalEvaporationBlockTypes.ULTIMATE_THERMAL_EVAPORATION_CONTROLLER
            );

    // Creative
    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationBlock>, ItemBlockMoreThermalEvaporation> CREATIVE_THERMAL_EVAPORATION_BLOCK =
            registerMoreThermalEvaporationPart(
                    BaseTier.CREATIVE,
                    "block",
                    MoreThermalEvaporationBlockTypes.CREATIVE_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationValve>, ItemBlockMoreThermalEvaporation> CREATIVE_THERMAL_EVAPORATION_VALVE =
            registerMoreThermalEvaporationPart(
                    BaseTier.CREATIVE,
                    "valve",
                    MoreThermalEvaporationBlockTypes.CREATIVE_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockRegistryObject<BlockBasicMultiblock<TileEntityMoreThermalEvaporationController>, ItemBlockMoreThermalEvaporation> CREATIVE_THERMAL_EVAPORATION_CONTROLLER =
            registerMoreThermalEvaporationPart(
                    BaseTier.CREATIVE,
                    "controller",
                    MoreThermalEvaporationBlockTypes.CREATIVE_THERMAL_EVAPORATION_CONTROLLER
            );

    private MoreThermalEvaporationBlocks() {
    }

    private static <TILE extends TileEntityMekanism> BlockRegistryObject<BlockBasicMultiblock<TILE>, ItemBlockMoreThermalEvaporation> registerMoreThermalEvaporationPart(BaseTier tier, String suffix, BlockTypeTile<TILE> type) {

        String name = tier.getLowerName() + "_thermal_evaporation_" + suffix;
        MapColor color = tier.getMapColor();

        return BLOCKS.register(name, () -> new BlockBasicMultiblock<>(type, properties -> properties.mapColor(color)), ItemBlockMoreThermalEvaporation::new);
    }

    public static BlockRegistryObject<? extends BlockBasicMultiblock<?>, ItemBlockMoreThermalEvaporation> getBlock(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_BLOCK;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_BLOCK;
            case ELITE -> ELITE_THERMAL_EVAPORATION_BLOCK;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_BLOCK;
            case CREATIVE -> CREATIVE_THERMAL_EVAPORATION_BLOCK;
        };
    }

    public static BlockRegistryObject<? extends BlockBasicMultiblock<?>, ItemBlockMoreThermalEvaporation> getValve(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_VALVE;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_VALVE;
            case ELITE -> ELITE_THERMAL_EVAPORATION_VALVE;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_VALVE;
            case CREATIVE -> CREATIVE_THERMAL_EVAPORATION_VALVE;
        };
    }

    public static BlockRegistryObject<? extends BlockBasicMultiblock<?>, ItemBlockMoreThermalEvaporation> getController(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_CONTROLLER;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_CONTROLLER;
            case ELITE -> ELITE_THERMAL_EVAPORATION_CONTROLLER;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER;
            case CREATIVE -> CREATIVE_THERMAL_EVAPORATION_CONTROLLER;
        };
    }
}

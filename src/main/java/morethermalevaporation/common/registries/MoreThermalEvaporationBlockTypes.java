package morethermalevaporation.common.registries;

import mekanism.api.Upgrade;
import mekanism.common.MekanismLang;
import mekanism.common.block.attribute.AttributeStateFacing;
import mekanism.common.block.attribute.AttributeTier;
import mekanism.common.block.attribute.Attributes;
import mekanism.common.content.blocktype.BlockTypeTile;
import mekanism.common.content.blocktype.BlockTypeTile.BlockTileBuilder;
import morethermalevaporation.common.MoreThermalEvaporationLang;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationBlock;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationController;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationValve;

import java.util.EnumSet;

public class MoreThermalEvaporationBlockTypes {
    // Basic
    public static final BlockTypeTile<TileEntityMoreThermalEvaporationBlock> BASIC_THERMAL_EVAPORATION_BLOCK =
            createMoreThermalEvaporationBlock(
                    MoreThermalEvaporationTier.BASIC,
                    MoreThermalEvaporationLang.DESCRIPTION_BASIC_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationValve> BASIC_THERMAL_EVAPORATION_VALVE =
            createMoreThermalEvaporationValve(
                    MoreThermalEvaporationTier.BASIC,
                    MoreThermalEvaporationLang.DESCRIPTION_BASIC_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationController> BASIC_THERMAL_EVAPORATION_CONTROLLER =
            createMoreThermalEvaporationController(
                    MoreThermalEvaporationTier.BASIC,
                    MoreThermalEvaporationLang.DESCRIPTION_BASIC_THERMAL_EVAPORATION_CONTROLLER
            );

    // Advanced
    public static final BlockTypeTile<TileEntityMoreThermalEvaporationBlock> ADVANCED_THERMAL_EVAPORATION_BLOCK =
            createMoreThermalEvaporationBlock(
                    MoreThermalEvaporationTier.ADVANCED,
                    MoreThermalEvaporationLang.DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationValve> ADVANCED_THERMAL_EVAPORATION_VALVE =
            createMoreThermalEvaporationValve(
                    MoreThermalEvaporationTier.ADVANCED,
                    MoreThermalEvaporationLang.DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationController> ADVANCED_THERMAL_EVAPORATION_CONTROLLER =
            createMoreThermalEvaporationController(
                    MoreThermalEvaporationTier.ADVANCED,
                    MoreThermalEvaporationLang.DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_CONTROLLER
            );

    // Elite
    public static final BlockTypeTile<TileEntityMoreThermalEvaporationBlock> ELITE_THERMAL_EVAPORATION_BLOCK =
            createMoreThermalEvaporationBlock(
                    MoreThermalEvaporationTier.ELITE,
                    MoreThermalEvaporationLang.DESCRIPTION_ELITE_THERMAL_EVAPORATION_BLOCK
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationValve> ELITE_THERMAL_EVAPORATION_VALVE =
            createMoreThermalEvaporationValve(
                    MoreThermalEvaporationTier.ELITE,
                    MoreThermalEvaporationLang.DESCRIPTION_ELITE_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationController> ELITE_THERMAL_EVAPORATION_CONTROLLER =
            createMoreThermalEvaporationController(
                    MoreThermalEvaporationTier.ELITE,
                    MoreThermalEvaporationLang.DESCRIPTION_ELITE_THERMAL_EVAPORATION_CONTROLLER
            );

    // Ultimate
    public static final BlockTypeTile<TileEntityMoreThermalEvaporationBlock> ULTIMATE_THERMAL_EVAPORATION_BLOCK =
            createMoreThermalEvaporationBlock(
                    MoreThermalEvaporationTier.ULTIMATE, MoreThermalEvaporationLang.DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_BLOCK);

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationValve> ULTIMATE_THERMAL_EVAPORATION_VALVE =
            createMoreThermalEvaporationValve(
                    MoreThermalEvaporationTier.ULTIMATE,
                    MoreThermalEvaporationLang.DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_VALVE
            );

    public static final BlockTypeTile<TileEntityMoreThermalEvaporationController> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER =
            createMoreThermalEvaporationController(
                    MoreThermalEvaporationTier.ULTIMATE,
                    MoreThermalEvaporationLang.DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_CONTROLLER
            );

    private MoreThermalEvaporationBlockTypes() {
    }

    private static BlockTypeTile<TileEntityMoreThermalEvaporationBlock> createMoreThermalEvaporationBlock(MoreThermalEvaporationTier tier, MoreThermalEvaporationLang lang) {
        return BlockTileBuilder.createBlock(() -> MoreThermalEvaporationTileEntityTypes.getTileEntityTypeBlock(tier), lang).
                with(new AttributeTier<>(tier), new Attributes.AttributeCustomResistance(9)).
                externalMultiblock()
                .build();
    }

    private static BlockTypeTile<TileEntityMoreThermalEvaporationValve> createMoreThermalEvaporationValve(MoreThermalEvaporationTier tier, MoreThermalEvaporationLang lang) {
        return BlockTileBuilder.createBlock(() -> MoreThermalEvaporationTileEntityTypes.getTileEntityTypeValve(tier), lang)
                .with(new AttributeTier<>(tier), Attributes.COMPARATOR, new Attributes.AttributeCustomResistance(9))
                .externalMultiblock()
                .withComputerSupport(tier.getBaseTier().getLowerName() + "ThermalEvaporationValve")
                .build();
    }

    private static BlockTypeTile<TileEntityMoreThermalEvaporationController> createMoreThermalEvaporationController(MoreThermalEvaporationTier tier, MoreThermalEvaporationLang lang) {
        return BlockTileBuilder.createBlock(() -> MoreThermalEvaporationTileEntityTypes.getTileEntityTypeController(tier), lang)
                .withGui(() -> MoreThermalEvaporationContainerTypes.getContainerType(tier), MekanismLang.EVAPORATION_PLANT)
                .withSupportedUpgrades(EnumSet.of(Upgrade.ANCHOR))
                .with(new AttributeTier<>(tier), Attributes.INVENTORY, Attributes.ACTIVE, new AttributeStateFacing(), new Attributes.AttributeCustomResistance(9))
                .externalMultiblock()
                .withComputerSupport(tier.getBaseTier().getLowerName() + "ThermalEvaporationController")
                .build();
    }

    public static BlockTypeTile<TileEntityMoreThermalEvaporationBlock> getBlockTypeBlock(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_BLOCK;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_BLOCK;
            case ELITE -> ELITE_THERMAL_EVAPORATION_BLOCK;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_BLOCK;
        };
    }

    public static BlockTypeTile<TileEntityMoreThermalEvaporationValve> getBlockTypeValve(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_VALVE;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_VALVE;
            case ELITE -> ELITE_THERMAL_EVAPORATION_VALVE;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_VALVE;
        };
    }

    public static BlockTypeTile<TileEntityMoreThermalEvaporationController> getBlockTypeController(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_THERMAL_EVAPORATION_CONTROLLER;
            case ADVANCED -> ADVANCED_THERMAL_EVAPORATION_CONTROLLER;
            case ELITE -> ELITE_THERMAL_EVAPORATION_CONTROLLER;
            case ULTIMATE -> ULTIMATE_THERMAL_EVAPORATION_CONTROLLER;
        };
    }
}

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

import java.util.EnumMap;
import java.util.EnumSet;

public class MoreThermalEvaporationBlockTypes {

    private static final EnumMap<MoreThermalEvaporationTier, BlockTypeTile<TileEntityMoreThermalEvaporationBlock>> BLOCKS = new EnumMap<>(MoreThermalEvaporationTier.class);
    private static final EnumMap<MoreThermalEvaporationTier, BlockTypeTile<TileEntityMoreThermalEvaporationValve>> VALVES = new EnumMap<>(MoreThermalEvaporationTier.class);
    private static final EnumMap<MoreThermalEvaporationTier, BlockTypeTile<TileEntityMoreThermalEvaporationController>> CONTROLLERS = new EnumMap<>(MoreThermalEvaporationTier.class);

    static {
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            BLOCKS.put(tier, createMoreThermalEvaporationBlock(tier, MoreThermalEvaporationLang.getLangBlock(tier)));
            VALVES.put(tier, createMoreThermalEvaporationValve(tier, MoreThermalEvaporationLang.getLangValve(tier)));
            CONTROLLERS.put(tier, createMoreThermalEvaporationController(tier, MoreThermalEvaporationLang.getLangController(tier)));
        }
    }

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
        return BLOCKS.get(tier);
    }

    public static BlockTypeTile<TileEntityMoreThermalEvaporationValve> getBlockTypeValve(MoreThermalEvaporationTier tier) {
        return VALVES.get(tier);
    }

    public static BlockTypeTile<TileEntityMoreThermalEvaporationController> getBlockTypeController(MoreThermalEvaporationTier tier) {
        return CONTROLLERS.get(tier);
    }
}

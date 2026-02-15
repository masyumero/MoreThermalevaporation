package morethermalevaporation.common.registries;

import mekanism.common.registration.impl.TileEntityTypeDeferredRegister;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.base.TileEntityMekanism;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.common.tile.machine.TileEntityMoreThermalEvaporationCompact;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationBlock;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationController;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationValve;

import java.util.EnumMap;

public class MoreThermalEvaporationTileEntityTypes {
    public static final TileEntityTypeDeferredRegister TILE_ENTITY_TYPES = new TileEntityTypeDeferredRegister(MoreThermalEvaporation.MODID);

    public static final EnumMap<MoreThermalEvaporationTier, TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationBlock>> BLOCKS = new EnumMap<>(MoreThermalEvaporationTier.class);
    public static final EnumMap<MoreThermalEvaporationTier, TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationValve>> VALVES = new EnumMap<>(MoreThermalEvaporationTier.class);
    public static final EnumMap<MoreThermalEvaporationTier, TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationController>> CONTROLLERS = new EnumMap<>(MoreThermalEvaporationTier.class);
    public static final EnumMap<MoreThermalEvaporationTier, TileEntityTypeRegistryObject<TileEntityMoreThermalEvaporationCompact>> COMPACTS = new EnumMap<>(MoreThermalEvaporationTier.class);

    static {
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            BLOCKS.put(tier, TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.BLOCKS.get(tier),
                    (pos, state) -> new TileEntityMoreThermalEvaporationBlock(tier, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient)
            );

            VALVES.put(tier, TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.VALVES.get(tier),
                    (pos, state) -> new TileEntityMoreThermalEvaporationValve(tier, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient)
            );

            CONTROLLERS.put(tier, TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.CONTROLLERS.get(tier),
                    (pos, state) -> new TileEntityMoreThermalEvaporationController(tier, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient)
            );

            COMPACTS.put(tier, TILE_ENTITY_TYPES.register(
                    MoreThermalEvaporationBlocks.COMPACTS.get(tier),
                    (pos, state) -> new TileEntityMoreThermalEvaporationCompact(tier, pos, state),
                    TileEntityMekanism::tickServer,
                    TileEntityMekanism::tickClient)
            );
        }
    }

    private MoreThermalEvaporationTileEntityTypes() {
    }

}


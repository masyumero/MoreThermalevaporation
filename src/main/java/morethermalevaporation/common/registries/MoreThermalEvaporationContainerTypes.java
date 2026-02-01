package morethermalevaporation.common.registries;

import mekanism.common.inventory.container.tile.MekanismTileContainer;
import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import morethermalevaporation.common.tile.multiblock.TileEntityMoreThermalEvaporationController;

import java.util.EnumMap;

public class MoreThermalEvaporationContainerTypes {
    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister(MoreThermalEvaporation.MODID);

    private static final EnumMap<MoreThermalEvaporationTier, ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>>> CONTAINERS = new EnumMap<>(MoreThermalEvaporationTier.class);

    static {
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            CONTAINERS.put(tier, CONTAINER_TYPES.register(MoreThermalEvaporationBlocks.getController(tier), TileEntityMoreThermalEvaporationController.class));
        }
    }

    private MoreThermalEvaporationContainerTypes() {
    }

    public static ContainerTypeRegistryObject<MekanismTileContainer<TileEntityMoreThermalEvaporationController>> getContainerType(MoreThermalEvaporationTier tier) {
        return CONTAINERS.get(tier);
    }
}

package morethermalevaporation.common.registries;

import mekanism.common.lib.multiblock.MultiblockCache;
import mekanism.common.lib.multiblock.MultiblockManager;
import morethermalevaporation.common.content.evaporation.MoreThermalEvaporationMultiblockData;
import morethermalevaporation.common.content.evaporation.MoreThermalEvaporationValidator;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;

public class MoreThermalEvaporationManager {
    public static final MultiblockManager<MoreThermalEvaporationMultiblockData> BasicMoreThermalEvaporationManager = new MultiblockManager<>("BasicThermalEvaporation", MultiblockCache::new, () -> new MoreThermalEvaporationValidator(MoreThermalEvaporationTier.BASIC));
    public static final MultiblockManager<MoreThermalEvaporationMultiblockData> AdvancedMoreThermalEvaporationManager = new MultiblockManager<>("AdvancedThermalEvaporation", MultiblockCache::new, () -> new MoreThermalEvaporationValidator(MoreThermalEvaporationTier.ADVANCED));
    public static final MultiblockManager<MoreThermalEvaporationMultiblockData> EliteMoreThermalEvaporationManager = new MultiblockManager<>("EliteThermalEvaporation", MultiblockCache::new, () -> new MoreThermalEvaporationValidator(MoreThermalEvaporationTier.ELITE));
    public static final MultiblockManager<MoreThermalEvaporationMultiblockData> UltimateMoreThermalEvaporationManager = new MultiblockManager<>("UltimateThermalEvaporation", MultiblockCache::new, () -> new MoreThermalEvaporationValidator(MoreThermalEvaporationTier.ULTIMATE));
    public static final MultiblockManager<MoreThermalEvaporationMultiblockData> CreativeMoreThermalEvaporationManager = new MultiblockManager<>("CreativeThermalEvaporation", MultiblockCache::new, () -> new MoreThermalEvaporationValidator(MoreThermalEvaporationTier.CREATIVE));

    public static MultiblockManager<MoreThermalEvaporationMultiblockData> getManager(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BasicMoreThermalEvaporationManager;
            case ADVANCED -> AdvancedMoreThermalEvaporationManager;
            case ELITE -> EliteMoreThermalEvaporationManager;
            case ULTIMATE -> UltimateMoreThermalEvaporationManager;
            case CREATIVE -> CreativeMoreThermalEvaporationManager;
        };
    }
}

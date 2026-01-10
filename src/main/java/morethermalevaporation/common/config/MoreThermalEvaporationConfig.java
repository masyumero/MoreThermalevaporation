package morethermalevaporation.common.config;

import mekanism.common.config.MekanismConfigHelper;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;

public class MoreThermalEvaporationConfig {
    public static final MoreThermalEvaporationPlantConfig config = new MoreThermalEvaporationPlantConfig();

    private MoreThermalEvaporationConfig() {
    }

    public static void registerConfig(ModLoadingContext modLoadingContext) {
        ModContainer modContainer = modLoadingContext.getActiveContainer();
        MekanismConfigHelper.registerConfig(modContainer, config);
    }
}

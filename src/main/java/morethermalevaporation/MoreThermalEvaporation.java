package morethermalevaporation;

import mekanism.common.command.builders.BuildCommand;
import morethermalevaporation.common.MoreThermalEvaporationLang;
import morethermalevaporation.common.command.builders.MoreThermalEvaporationBuilders.MoreEvaporationBuilder;
import morethermalevaporation.common.config.MoreThermalEvaporationConfig;
import morethermalevaporation.common.registries.MoreThermalEvaporationBlocks;
import morethermalevaporation.common.registries.MoreThermalEvaporationContainerTypes;
import morethermalevaporation.common.registries.MoreThermalEvaporationCreativeTabs;
import morethermalevaporation.common.registries.MoreThermalEvaporationTileEntityTypes;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreThermalEvaporation.MODID)
public class MoreThermalEvaporation {

    public static final String MODID = "morethermalevaporation";

    public MoreThermalEvaporation() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MoreThermalEvaporationBlocks.BLOCKS.register(modEventBus);
        MoreThermalEvaporationTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        MoreThermalEvaporationContainerTypes.CONTAINER_TYPES.register(modEventBus);
        MoreThermalEvaporationCreativeTabs.register(modEventBus);
        MoreThermalEvaporationConfig.registerConfig(ModLoadingContext.get());
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation("morethermalevaporation", path);
    }

    private void registerCommands(RegisterCommandsEvent event) {
        BuildCommand.register("evaporation_basic", MoreThermalEvaporationLang.BASIC_EVAPORATION_PLANT, new MoreEvaporationBuilder(MoreThermalEvaporationTier.BASIC));
        BuildCommand.register("evaporation_advanced", MoreThermalEvaporationLang.ADVANCED_EVAPORATION_PLANT, new MoreEvaporationBuilder(MoreThermalEvaporationTier.ADVANCED));
        BuildCommand.register("evaporation_elite", MoreThermalEvaporationLang.ELITE_EVAPORATION_PLANT, new MoreEvaporationBuilder(MoreThermalEvaporationTier.ELITE));
        BuildCommand.register("evaporation_ultimate", MoreThermalEvaporationLang.ULTIMATE_EVAPORATION_PLANT, new MoreEvaporationBuilder(MoreThermalEvaporationTier.ULTIMATE));
    }
}
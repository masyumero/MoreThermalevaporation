package morethermalevaporation.common.registries;

import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MoreThermalEvaporationCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreThermalEvaporation.MODID);

    public static final RegistryObject<CreativeModeTab> TAB_MORE_THERMAL_EVAPORATION = CREATIVE_TABS.register("tab_more_thermal_evaporation", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.morethermalevaporation.tab"))
                    .icon(() -> new ItemStack(MoreThermalEvaporationBlocks.getBlock(MoreThermalEvaporationTier.BASIC).asItem()))
                    .displayItems((parameters, output) -> {
                        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
                            output.accept(MoreThermalEvaporationBlocks.getBlock(tier));
                            output.accept(MoreThermalEvaporationBlocks.getValve(tier));
                            output.accept(MoreThermalEvaporationBlocks.getController(tier));
                        }
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
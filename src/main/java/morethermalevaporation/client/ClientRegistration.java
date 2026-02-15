package morethermalevaporation.client;

import mekanism.client.ClientRegistrationUtil;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.client.gui.GuiMoreThermalEvaporationCompact;
import morethermalevaporation.client.gui.GuiMoreThermalEvaporationController;
import morethermalevaporation.client.render.tileentity.RenderMoreThermalEvaporationPlant;
import morethermalevaporation.common.registries.MoreThermalEvaporationContainerTypes;
import morethermalevaporation.common.registries.MoreThermalEvaporationTileEntityTypes;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = MoreThermalEvaporation.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegistration {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            event.registerBlockEntityRenderer(MoreThermalEvaporationTileEntityTypes.CONTROLLERS.get(tier).get(), (context) -> new RenderMoreThermalEvaporationPlant(tier, context));
        }
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerContainers(RegisterEvent event) {
        event.register(Registries.MENU, helper -> {
            for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
                ClientRegistrationUtil.registerScreen(MoreThermalEvaporationContainerTypes.MORE_THERMAL_EVAPORATION_CONTROLLER.get(tier), GuiMoreThermalEvaporationController::new);
                ClientRegistrationUtil.registerScreen(MoreThermalEvaporationContainerTypes.MORE_THERMAL_EVAPORATION_COMPACT.get(tier), GuiMoreThermalEvaporationCompact::new);
            }
        });
    }
}
package morethermalevaporation.common.config;

import mekanism.common.config.BaseMekanismConfig;
import mekanism.common.config.value.CachedBooleanValue;
import mekanism.common.config.value.CachedDoubleValue;
import mekanism.common.config.value.CachedIntValue;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

import java.util.Locale;

public class MoreThermalEvaporationPlantConfig extends BaseMekanismConfig {
    public static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public final CachedBooleanValue RenderFluid;
    public final ForgeConfigSpec configSpec;

    MoreThermalEvaporationPlantConfig() {

        addMoreThermalEvaporationCategory(builder);
        builder.comment("Settings for the Render fluid");
        RenderFluid = CachedBooleanValue.wrap(this, builder.comment("Render fluid inside of Thermal Evaporation Plants.").define("RenderFluid", true));
        builder.pop(); // Render
        configSpec = builder.build();
    }

    private void addMoreThermalEvaporationCategory(ForgeConfigSpec.Builder builder) {
        builder.comment("More Thermal Evaporations Settings").push("more_thermal_evaporation");
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            String tierName = tier.getBaseTier().getSimpleName();
            CachedDoubleValue multiplierTempReference = CachedDoubleValue.wrap(this, builder.comment("Maximum " + "temperature capping the temperature multiplier for the " + tierName + " Thermal Evaporation Plant.")
                    .defineInRange(tierName.toLowerCase(Locale.ROOT) + "ThermalEvaporationMultiplierTempCap",
                            tier.getBaseMultiplierTemp(), 3000, 2147483646));

            CachedIntValue heightReference = CachedIntValue.wrap(this, builder.comment("Buildable Height (in blocks) for the " + tierName + " Thermal Evaporation Plant.")
                    .defineInRange(tierName.toLowerCase(Locale.ROOT) + "ThermalEvaporationHeight", tier.getBaseHeight(), 18, 2147483646));

            CachedIntValue inputTankCapacityReference = CachedIntValue.wrap(this, builder.comment("Amount of fluid (mB) that each block of the " + tierName + " Thermal Evaporation Plant contributes to the input tank capacity. Max = volume * fluidPerTank")
                    .defineInRange(tierName.toLowerCase(Locale.ROOT) + "ThermalEvaporationInputTankCapacity", tier.getBaseInputTankCapacity(), 1, 29826161));

            CachedIntValue outputTankCapacityReference = CachedIntValue.wrap(this, builder.comment("Amount of output fluid (mB) that the " + tierName + " Thermal Evaporation Plant can store.")
                    .defineInRange(tierName.toLowerCase(Locale.ROOT) + "ThermalEvaporationOutputTankCapacity", tier.getBaseOutputTankCapacity(), 1, 2147483646));

            tier.setConfigReference(multiplierTempReference, heightReference, inputTankCapacityReference, outputTankCapacityReference);
        }
    }

    @Override
    public String getFileName() {
        return "more-thermal-evaporations";
    }

    @Override
    public ForgeConfigSpec getConfigSpec() {
        return configSpec;
    }

    @Override
    public ModConfig.Type getConfigType() {
        return ModConfig.Type.COMMON;
    }

    @Override
    public boolean addToContainer() {
        return false;
    }
}
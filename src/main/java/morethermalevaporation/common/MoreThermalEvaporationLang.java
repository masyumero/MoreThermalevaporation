package morethermalevaporation.common;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.text.ILangEntry;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.Util;

@NothingNullByDefault
public enum MoreThermalEvaporationLang implements ILangEntry {

    // Basic
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_CONTROLLER("description", "basic_thermal_evaporation_controller"),
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_VALVE("description", "basic_thermal_evaporation_valve"),
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_BLOCK("description", "basic_thermal_evaporation_block"),

    BASIC_EVAPORATION_HEIGHT("evaporation", "basic_height"),
    BASIC_FLUID_PRODUCTION("evaporation", "basic_fluid_production"),
    BASIC_EVAPORATION_PLANT("evaporation", "basic_evaporation_plant"),

    // Advanced
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_CONTROLLER("description", "advanced_thermal_evaporation_controller"),
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_VALVE("description", "advanced_thermal_evaporation_valve"),
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_BLOCK("description", "advanced_thermal_evaporation_block"),

    ADVANCED_EVAPORATION_HEIGHT("evaporation", "advanced_height"),
    ADVANCED_FLUID_PRODUCTION("evaporation", "advanced_fluid_production"),
    ADVANCED_EVAPORATION_PLANT("evaporation", "advanced_evaporation_plant"),

    // Elite
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_CONTROLLER("description", "elite_thermal_evaporation_controller"),
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_VALVE("description", "elite_thermal_evaporation_valve"),
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_BLOCK("description", "elite_thermal_evaporation_block"),

    ELITE_EVAPORATION_HEIGHT("evaporation", "elite_height"),
    ELITE_FLUID_PRODUCTION("evaporation", "elite_fluid_production"),
    ELITE_EVAPORATION_PLANT("evaporation", "elite_evaporation_plant"),

    // Ultimate
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_CONTROLLER("description", "ultimate_thermal_evaporation_controller"),
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_VALVE("description", "ultimate_thermal_evaporation_valve"),
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_BLOCK("description", "ultimate_thermal_evaporation_block"),

    ULTIMATE_EVAPORATION_HEIGHT("evaporation", "ultimate_height"),
    ULTIMATE_FLUID_PRODUCTION("evaporation", "ultimate_fluid_production"),
    ULTIMATE_EVAPORATION_PLANT("evaporation", "ultimate_evaporation_plant"),

    // Creative
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_CONTROLLER("description", "creative_thermal_evaporation_controller"),
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_VALVE("description", "creative_thermal_evaporation_valve"),
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_BLOCK("description", "creative_thermal_evaporation_block"),

    CREATIVE_EVAPORATION_HEIGHT("evaporation", "creative_height"),
    CREATIVE_FLUID_PRODUCTION("evaporation", "creative_fluid_production"),
    CREATIVE_EVAPORATION_PLANT("evaporation", "creative_evaporation_plant"),
    ;

    private final String key;

    MoreThermalEvaporationLang(String type, String path) {
        this(Util.makeDescriptionId(type, MoreThermalEvaporation.rl(path)));
    }

    MoreThermalEvaporationLang(String key) {
        this.key = key;
    }

    public static MoreThermalEvaporationLang getLangPlant(MoreThermalEvaporationTier tier) {
        return switch (tier) {
            case BASIC -> BASIC_EVAPORATION_PLANT;
            case ADVANCED -> ADVANCED_EVAPORATION_PLANT;
            case ELITE -> ELITE_EVAPORATION_PLANT;
            case ULTIMATE -> ULTIMATE_EVAPORATION_PLANT;
            case CREATIVE -> CREATIVE_EVAPORATION_PLANT;
        };
    }

    @Override
    public String getTranslationKey() {
        return key;
    }
}

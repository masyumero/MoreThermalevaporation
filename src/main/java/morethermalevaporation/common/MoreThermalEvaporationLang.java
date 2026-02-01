package morethermalevaporation.common;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.text.ILangEntry;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.Util;

import java.util.EnumMap;

@NothingNullByDefault
public enum MoreThermalEvaporationLang implements ILangEntry {

    // Basic
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_BLOCK("description", "basic_thermal_evaporation_block"),
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_VALVE("description", "basic_thermal_evaporation_valve"),
    DESCRIPTION_BASIC_THERMAL_EVAPORATION_CONTROLLER("description", "basic_thermal_evaporation_controller"),

    BASIC_EVAPORATION_HEIGHT("evaporation", "basic_height"),
    BASIC_FLUID_PRODUCTION("evaporation", "basic_fluid_production"),
    BASIC_EVAPORATION_PLANT("evaporation", "basic_evaporation_plant"),

    // Advanced
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_BLOCK("description", "advanced_thermal_evaporation_block"),
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_VALVE("description", "advanced_thermal_evaporation_valve"),
    DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_CONTROLLER("description", "advanced_thermal_evaporation_controller"),

    ADVANCED_EVAPORATION_HEIGHT("evaporation", "advanced_height"),
    ADVANCED_FLUID_PRODUCTION("evaporation", "advanced_fluid_production"),
    ADVANCED_EVAPORATION_PLANT("evaporation", "advanced_evaporation_plant"),

    // Elite
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_BLOCK("description", "elite_thermal_evaporation_block"),
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_VALVE("description", "elite_thermal_evaporation_valve"),
    DESCRIPTION_ELITE_THERMAL_EVAPORATION_CONTROLLER("description", "elite_thermal_evaporation_controller"),

    ELITE_EVAPORATION_HEIGHT("evaporation", "elite_height"),
    ELITE_FLUID_PRODUCTION("evaporation", "elite_fluid_production"),
    ELITE_EVAPORATION_PLANT("evaporation", "elite_evaporation_plant"),

    // Ultimate
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_BLOCK("description", "ultimate_thermal_evaporation_block"),
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_VALVE("description", "ultimate_thermal_evaporation_valve"),
    DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_CONTROLLER("description", "ultimate_thermal_evaporation_controller"),

    ULTIMATE_EVAPORATION_HEIGHT("evaporation", "ultimate_height"),
    ULTIMATE_FLUID_PRODUCTION("evaporation", "ultimate_fluid_production"),
    ULTIMATE_EVAPORATION_PLANT("evaporation", "ultimate_evaporation_plant"),

    // Creative
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_BLOCK("description", "creative_thermal_evaporation_block"),
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_VALVE("description", "creative_thermal_evaporation_valve"),
    DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_CONTROLLER("description", "creative_thermal_evaporation_controller"),

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

    @Override
    public String getTranslationKey() {
        return key;
    }

    private static final EnumMap<MoreThermalEvaporationTier, MoreThermalEvaporationLang> BLOCK_LANGS = new EnumMap<>(MoreThermalEvaporationTier.class);
    private static final EnumMap<MoreThermalEvaporationTier, MoreThermalEvaporationLang> VALVE_LANGS = new EnumMap<>(MoreThermalEvaporationTier.class);
    private static final EnumMap<MoreThermalEvaporationTier, MoreThermalEvaporationLang> CONTROLLER_LANGS = new EnumMap<>(MoreThermalEvaporationTier.class);
    private static final EnumMap<MoreThermalEvaporationTier, MoreThermalEvaporationLang> PLANT_LANGS = new EnumMap<>(MoreThermalEvaporationTier.class);


    static {
        BLOCK_LANGS.put(MoreThermalEvaporationTier.BASIC, DESCRIPTION_BASIC_THERMAL_EVAPORATION_BLOCK);
        BLOCK_LANGS.put(MoreThermalEvaporationTier.ADVANCED, DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_BLOCK);
        BLOCK_LANGS.put(MoreThermalEvaporationTier.ELITE, DESCRIPTION_ELITE_THERMAL_EVAPORATION_BLOCK);
        BLOCK_LANGS.put(MoreThermalEvaporationTier.ULTIMATE, DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_BLOCK);
        BLOCK_LANGS.put(MoreThermalEvaporationTier.CREATIVE, DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_BLOCK);

        VALVE_LANGS.put(MoreThermalEvaporationTier.BASIC, DESCRIPTION_BASIC_THERMAL_EVAPORATION_VALVE);
        VALVE_LANGS.put(MoreThermalEvaporationTier.ADVANCED, DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_VALVE);
        VALVE_LANGS.put(MoreThermalEvaporationTier.ELITE, DESCRIPTION_ELITE_THERMAL_EVAPORATION_VALVE);
        VALVE_LANGS.put(MoreThermalEvaporationTier.ULTIMATE, DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_VALVE);
        VALVE_LANGS.put(MoreThermalEvaporationTier.CREATIVE, DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_VALVE);

        CONTROLLER_LANGS.put(MoreThermalEvaporationTier.BASIC, DESCRIPTION_BASIC_THERMAL_EVAPORATION_CONTROLLER);
        CONTROLLER_LANGS.put(MoreThermalEvaporationTier.ADVANCED, DESCRIPTION_ADVANCED_THERMAL_EVAPORATION_CONTROLLER);
        CONTROLLER_LANGS.put(MoreThermalEvaporationTier.ELITE, DESCRIPTION_ELITE_THERMAL_EVAPORATION_CONTROLLER);
        CONTROLLER_LANGS.put(MoreThermalEvaporationTier.ULTIMATE, DESCRIPTION_ULTIMATE_THERMAL_EVAPORATION_CONTROLLER);
        CONTROLLER_LANGS.put(MoreThermalEvaporationTier.CREATIVE, DESCRIPTION_CREATIVE_THERMAL_EVAPORATION_CONTROLLER);

        PLANT_LANGS.put(MoreThermalEvaporationTier.BASIC, BASIC_EVAPORATION_PLANT);
        PLANT_LANGS.put(MoreThermalEvaporationTier.ADVANCED, ADVANCED_EVAPORATION_PLANT);
        PLANT_LANGS.put(MoreThermalEvaporationTier.ELITE, ELITE_EVAPORATION_PLANT);
        PLANT_LANGS.put(MoreThermalEvaporationTier.ULTIMATE, ULTIMATE_EVAPORATION_PLANT);
        PLANT_LANGS.put(MoreThermalEvaporationTier.CREATIVE, CREATIVE_EVAPORATION_PLANT);
    }


    public static MoreThermalEvaporationLang getLangBlock(MoreThermalEvaporationTier tier) {
        return BLOCK_LANGS.get(tier);
    }

    public static MoreThermalEvaporationLang getLangValve(MoreThermalEvaporationTier tier) {
        return VALVE_LANGS.get(tier);
    }

    public static MoreThermalEvaporationLang getLangController(MoreThermalEvaporationTier tier) {
        return CONTROLLER_LANGS.get(tier);
    }

    public static MoreThermalEvaporationLang getLangPlant(MoreThermalEvaporationTier tier) {
        return PLANT_LANGS.get(tier);
    }


}

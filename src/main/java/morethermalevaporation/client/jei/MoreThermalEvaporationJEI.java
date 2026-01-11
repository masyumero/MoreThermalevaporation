package morethermalevaporation.client.jei;

import giselle.jei_mekanism_multiblocks.client.JEI_MekanismMultiblocks_Client;
import giselle.jei_mekanism_multiblocks.client.SavedData;
import giselle.jei_mekanism_multiblocks.client.jei.MultiblockCategory;
import giselle.jei_mekanism_multiblocks.client.jei.MultiblockWidget;
import giselle.jei_mekanism_multiblocks.common.JEI_MekanismMultiblocks;
import giselle.jei_mekanism_multiblocks.common.config.ClientConfig;
import giselle.jei_mekanism_multiblocks.common.config.JEI_MekanismMultiblocks_Config;
import mekanism.client.jei.CatalystRegistryHelper;
import mekanism.client.jei.MekanismJEIRecipeType;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import morethermalevaporation.MoreThermalEvaporation;
import morethermalevaporation.client.jei.category.MoreEvaporationPlantCategory;
import morethermalevaporation.common.registries.MoreThermalEvaporationBlocks;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

@JeiPlugin
public class MoreThermalEvaporationJEI implements IModPlugin {

    private final List<MultiblockCategory<? extends MultiblockWidget>> categories;

    public MoreThermalEvaporationJEI() {
        this.categories = new ArrayList<>();
    }

    @Override
    public ResourceLocation getPluginUid() {
        return MoreThermalEvaporation.rl("jei_plugin");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registry) {
        for (MoreThermalEvaporationTier tier : MoreThermalEvaporationTier.values()) {
            CatalystRegistryHelper.register(registry, MekanismJEIRecipeType.EVAPORATING, MoreThermalEvaporationBlocks.getController(tier),
                    MoreThermalEvaporationBlocks.getValve(tier), MoreThermalEvaporationBlocks.getBlock(tier));
        }

        // ↓↓↓ Just Enough Mekanism Multiblocks連携
        for (MultiblockCategory<?> category : this.getCategories()) {
            category.registerRecipeCatalysts(registry);
        }
    }

    // ↓↓↓ Just Enough Mekanism Multiblocks連携 ↓↓↓
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

        ClientConfig config = JEI_MekanismMultiblocks_Config.CLIENT;
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        this.categories.clear();
        this.addCategory(config.evaporationPlantVisible, () -> new MoreEvaporationPlantCategory(guiHelper, MoreThermalEvaporationTier.BASIC, MoreEvaporationPlantCategory.BasicEvaporationPlantWidget.class));
        this.addCategory(config.evaporationPlantVisible, () -> new MoreEvaporationPlantCategory(guiHelper, MoreThermalEvaporationTier.ADVANCED, MoreEvaporationPlantCategory.AdvancedEvaporationPlantWidget.class));
        this.addCategory(config.evaporationPlantVisible, () -> new MoreEvaporationPlantCategory(guiHelper, MoreThermalEvaporationTier.ELITE, MoreEvaporationPlantCategory.EliteEvaporationPlantWidget.class));
        this.addCategory(config.evaporationPlantVisible, () -> new MoreEvaporationPlantCategory(guiHelper, MoreThermalEvaporationTier.ULTIMATE, MoreEvaporationPlantCategory.UltimateEvaporationPlantWidget.class));

        for (MultiblockCategory<?> category : this.getCategories()) {
            registration.addRecipeCategories(category);
        }
    }

    private <CATEGOERY extends MultiblockCategory<?>> void addCategory(ForgeConfigSpec.BooleanValue config, Supplier<CATEGOERY> constructor) {
        if (config.get()) {
            this.categories.add(constructor.get());
        }

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        if (JEI_MekanismMultiblocks.EMILoaded) {
            return;
        }

        IModPlugin.super.registerRecipes(registration);

        for (MultiblockCategory<?> category : this.getCategories()) {
            @SuppressWarnings("unchecked")
            RecipeType<MultiblockWidget> recipeType = (RecipeType<MultiblockWidget>) category.getRecipeType();
            registration.addRecipes(recipeType, Arrays.asList(this.createWidget(category)));
        }

    }

    public <WIDGET extends MultiblockWidget> WIDGET createWidget(MultiblockCategory<WIDGET> category) {
        try {
            RecipeType<WIDGET> recipeType = category.getRecipeType();
            WIDGET widget = recipeType.getRecipeClass().getDeclaredConstructor().newInstance();

            if (SavedData.hasMultiblock(recipeType.getUid())) {
                widget.load(SavedData.getMultiblock(recipeType.getUid()));
            }

            widget.addChangedHandler(w -> this.onWidgetChanged(category, widget));
            return widget;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Category: " + category.getRecipeType(), e);
        }

    }

    private void onWidgetChanged(MultiblockCategory<?> category, MultiblockWidget widget) {
        CompoundTag tag = new CompoundTag();
        widget.save(tag);

        SavedData.setMultiblockData(category.getRecipeType().getUid(), tag);
        JEI_MekanismMultiblocks_Client.markNeedSave();
    }

    public List<MultiblockCategory<? extends MultiblockWidget>> getCategories() {
        return Collections.unmodifiableList(this.categories);
    }

}

package com.tezemi.coppercomplement.core.init;

import com.tezemi.coppercomplement.core.crafting.LowHeatingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public interface RecipeTypeInit<T extends AbstractCookingRecipe>
{
    RecipeType<LowHeatingRecipe> LOW_HEATING = register("low_heating");

    static <T extends Recipe<?>> RecipeType<T> register(final String p_44120_)
    {
        return Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(p_44120_), new RecipeType<T>()
        {
            public String toString() {
                return p_44120_;
            }
        });
    }
}

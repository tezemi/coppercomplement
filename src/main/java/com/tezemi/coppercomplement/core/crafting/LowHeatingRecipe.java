package com.tezemi.coppercomplement.core.crafting;

import com.tezemi.coppercomplement.core.init.BlockInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Blocks;

public class LowHeatingRecipe extends AbstractCookingRecipe
{
    public LowHeatingRecipe(ResourceLocation p_44469_, String p_44470_, Ingredient p_44471_, ItemStack p_44472_, float p_44473_, int p_44474_)
    {
        super(RecipeType.SMOKING, p_44469_, p_44470_, p_44471_, p_44472_, p_44473_, p_44474_);
    }

    public ItemStack getToastSymbol()
    {
        return new ItemStack(Blocks.BLAST_FURNACE);
    }

    public RecipeSerializer<?> getSerializer()
    {
        return null;
    }
}

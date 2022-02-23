package com.tezemi.coppercomplement.common.entity;

import com.tezemi.coppercomplement.core.init.RecipeTypeInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class LowHeatFurnaceBlockEntity extends AbstractFurnaceBlockEntity
{
    public LowHeatFurnaceBlockEntity(BlockPos pos, BlockState state)
    {
        super(BlockEntityType.BLAST_FURNACE, pos, state, RecipeTypeInit.LOW_HEATING);
    }

    protected Component getDefaultName()
    {
        return new TranslatableComponent("container.low_heat_furnace");
    }

    protected int getBurnDuration(ItemStack itemStack)
    {
        return super.getBurnDuration(itemStack) / 2;
    }

    protected AbstractContainerMenu createMenu(int var1, Inventory inventory)
    {
        return new BlastFurnaceMenu(var1, inventory, this, this.dataAccess);
    }
}

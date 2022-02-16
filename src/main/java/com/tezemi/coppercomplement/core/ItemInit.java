package com.tezemi.coppercomplement.core;


import com.tezemi.coppercomplement.CopperComplement;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperComplement.MODID);

    // Block Items
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register
    (
            "tin_ore",
            () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS))
    );

    private ItemInit()
    {

    }
}
package com.tezemi.coppercomplement.core.init;


import com.tezemi.coppercomplement.CopperComplement;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperComplement.MODID);

    // Tin Items
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register
    (
        "tin_ore",
        () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS))
    );

    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE_ITEM = ITEMS.register
    (
        "deepslate_tin_ore",
        () -> new BlockItem(BlockInit.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS))
    );

    public static final RegistryObject<Item> RAW_TIN_ITEM = ITEMS.register
    (
        "raw_tin",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> TIN_INGOT_ITEM = ITEMS.register
    (
        "tin_ingot",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS))
    );

    // Bronze Items
    public static final RegistryObject<Item> BRONZE_INGOT_ITEM = ITEMS.register
    (
        "bronze_ingot",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> BRONZE_HELMET_ITEM = ITEMS.register
    (
        "bronze_helmet",
        () -> new ArmorItem(ArmorMaterialInit.BRONZE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<Item> BRONZE_CHESTPLATE_ITEM = ITEMS.register
    (
        "bronze_chestplate",
        () -> new ArmorItem(ArmorMaterialInit.BRONZE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register
    (
        "bronze_leggings",
        () -> new ArmorItem(ArmorMaterialInit.BRONZE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register
    (
        "bronze_boots",
        () -> new ArmorItem(ArmorMaterialInit.BRONZE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    private ItemInit()
    {

    }
}
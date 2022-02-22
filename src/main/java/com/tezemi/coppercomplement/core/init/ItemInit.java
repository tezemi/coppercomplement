package com.tezemi.coppercomplement.core.init;


import com.tezemi.coppercomplement.CopperComplement;
import com.tezemi.coppercomplement.core.BaseToolMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperComplement.MODID);
    private static final float BASE_SWING_SPEED = -4f;

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

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register
    (
        "bronze_sword",
        () -> new SwordItem(BaseToolMaterial.BRONZE, 5, BASE_SWING_SPEED + 1.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register
    (
        "bronze_pickaxe",
        () -> new PickaxeItem(BaseToolMaterial.BRONZE, 3, BASE_SWING_SPEED + 1.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))
    );

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register
    (
        "bronze_axe",
        () -> new AxeItem(BaseToolMaterial.BRONZE, 9f, BASE_SWING_SPEED + 0.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))
    );

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register
    (
        "bronze_shovel",
        () -> new ShovelItem(BaseToolMaterial.BRONZE, 3.5f, BASE_SWING_SPEED + 1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))
    );

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register
    (
        "bronze_hoe",
        () -> new HoeItem(BaseToolMaterial.BRONZE, 1, BASE_SWING_SPEED + 2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))
    );

    private ItemInit()
    {

    }
}
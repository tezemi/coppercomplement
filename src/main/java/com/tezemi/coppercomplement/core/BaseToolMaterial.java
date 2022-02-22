package com.tezemi.coppercomplement.core;

import com.tezemi.coppercomplement.CopperComplement;
import com.tezemi.coppercomplement.core.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BaseToolMaterial implements Tier
{

    BRONZE(CopperComplement.MODID + ":bronze", 905, 5.0f, -1f, 3, 20, () ->
    {
        return Ingredient.of(ItemInit.BRONZE_INGOT_ITEM.get());
    });

    private final String name;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private BaseToolMaterial(String name, int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getUses() {
        return this.uses;
    }
}

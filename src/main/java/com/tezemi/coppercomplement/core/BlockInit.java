package com.tezemi.coppercomplement.core;

import com.tezemi.coppercomplement.CopperComplement;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CopperComplement.MODID);

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register
    (
        "tin_ore",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE))
    );

    private BlockInit()
    {

    }
}
package com.tezemi.coppercomplement.core.init;

import com.tezemi.coppercomplement.CopperComplement;
import com.tezemi.coppercomplement.common.block.LowHeatFurnaceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public final class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CopperComplement.MODID);

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register
    (
        "tin_ore",
        () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE))
    );

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register
    (
        "deepslate_tin_ore",
        () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE))
    );

    public static final RegistryObject<Block> LOW_HEAT_FURNACE = BLOCKS.register
    (
        "low_heat_furnace",
        () -> new LowHeatFurnaceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5F).lightLevel(litBlockEmission(13)))
    );

    private BlockInit()
    {

    }

    private static ToIntFunction<BlockState> litBlockEmission(int i)
    {
        return (state) ->
        {
            return state.getValue(BlockStateProperties.LIT) ? i : 0;
        };
    }
}
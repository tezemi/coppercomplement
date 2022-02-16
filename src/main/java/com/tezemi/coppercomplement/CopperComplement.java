package com.tezemi.coppercomplement;

import com.tezemi.coppercomplement.core.BlockInit;
import com.tezemi.coppercomplement.core.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("coppercomplement")
public class CopperComplement
{
    public static final String MODID = "coppercomplement";

    /*
    public static final CreativeModeTab COPPER_COMPLEMENT_TAB = new CreativeModeTab(MODID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return null;
        }
    };
    */

    public CopperComplement()
    {
        final var bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}

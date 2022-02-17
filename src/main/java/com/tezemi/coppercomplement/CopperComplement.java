package com.tezemi.coppercomplement;

import com.tezemi.coppercomplement.core.init.BlockInit;
import com.tezemi.coppercomplement.core.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

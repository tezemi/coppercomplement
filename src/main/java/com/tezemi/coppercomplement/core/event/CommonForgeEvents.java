package com.tezemi.coppercomplement.core.event;

import java.util.List;
import java.util.function.Supplier;

import com.tezemi.coppercomplement.CopperComplement;
import com.tezemi.coppercomplement.core.world.OreGeneration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = CopperComplement.MODID, bus = Bus.FORGE)
public class CommonForgeEvents
{
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event)
    {
        final List<Supplier<PlacedFeature>> features = event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES);

        switch (event.getCategory())
        {
            case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
            case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
            default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
        }

        /*
        if (event.getName().equals(new ResourceLocation("minecraft:plains")))
        {
            Object EntityInit;
            event.getSpawns().addSpawn(MobCategory.CREATURE,
                    new SpawnerData(EntityInit.EXAMPLE_ENTITY.get(), 5, 1, 7));
        }
        */
    }
}

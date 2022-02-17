package com.tezemi.coppercomplement.core.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.tezemi.coppercomplement.CopperComplement;
import com.tezemi.coppercomplement.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class OreGeneration
{
    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
    public static final List<PlacedFeature> END_ORES = new ArrayList<>();
    public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();

    public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);

    public static void registerOres() {

        var oreConfig = new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState())), 11);

        final var tinOre = FeatureUtils.register("tin_ore", Feature.ORE.configured(oreConfig));

        final var placedTinOre = PlacementUtils.register
        (
            "tin_ore",
            tinOre.placed(commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(80))))
        );
        OVERWORLD_ORES.add(placedTinOre);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier placementMod1, PlacementModifier placementMod2)
    {
        return List.of(placementMod1, InSquarePlacement.spread(), placementMod2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_)
    {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
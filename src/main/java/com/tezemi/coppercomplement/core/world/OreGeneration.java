package com.tezemi.coppercomplement.core.world;

import java.util.ArrayList;
import java.util.List;

import com.tezemi.coppercomplement.core.init.BlockInit;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OreGeneration
{
    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
    public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();
    public static final List<PlacedFeature> END_ORES = new ArrayList<>();


    public static void registerOres()
    {
        final ConfiguredFeature<?, ?> beansOre = FeatureUtils.register
        (
            "tin_ore",
            Feature.ORE.configured(new OreConfiguration
            (
                    List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState())),
                    3
            ))
        );

        final PlacedFeature placedBeansOre = PlacementUtils.register
        (
            "beans_ore",
            beansOre.placed(commonOrePlacement
            (
                100,
                HeightRangePlacement.triangle(VerticalAnchor.absolute(50), VerticalAnchor.absolute(120)))
            )
        );

        OVERWORLD_ORES.add(placedBeansOre);
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
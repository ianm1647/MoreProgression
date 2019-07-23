package com.moreprogression.main.world;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.ProgressionWorldGenConfig;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ProgressionRockGeneration {
    private static final CountRangeConfig MARBLE = new CountRangeConfig(25, 20, 0, 128);
    private static final int MARBLE_VEINSIZE = 18;
    private static final CountRangeConfig LIMESTONE = new CountRangeConfig(25, 20, 0, 128);
    private static final int LIMESTONE_VEINSIZE = 26;
    private static final CountRangeConfig BASALT = new CountRangeConfig(25, 10, 0, 128);
    private static final int BASALT_VEINSIZE = 23;
    
    public static void setupRockGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
                    if (ProgressionWorldGenConfig.enableMarble.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.marble.getDefaultState(), MARBLE_VEINSIZE), Placement.COUNT_RANGE, MARBLE));
                    }
                    if (ProgressionWorldGenConfig.enableLimestone.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.limestone.getDefaultState(), LIMESTONE_VEINSIZE), Placement.COUNT_RANGE, LIMESTONE));
                    }
                
        }
    }
    
    public static void setupNetherRockGeneration() {
        if (ProgressionWorldGenConfig.enableBasalt.get()) {
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, 
            		ProgressionBlocks.basalt.getDefaultState(), BASALT_VEINSIZE), Placement.COUNT_RANGE, BASALT));
        }
    }
}


package com.moreprogression.main.world;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.ProgressionWorldGenConfig;
import com.moreprogression.main.world.feature.EndOreFeature;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ProgressionOreGeneration {
    private static final CountRangeConfig IANITE = new CountRangeConfig(3, 5, 0, 13);
    private static final int IANITE_VEINSIZE = 5;
    private static final CountRangeConfig TRITANIUM = new CountRangeConfig(5, 10, 0, 128);
    private static final int TRITANIUM_VEINSIZE = 8;
    private static final CountRangeConfig ENDER = new CountRangeConfig(8, 2, 0, 128);
    private static final EndOreFeature END_OREGEN = new EndOreFeature(null);
    private static final int ENDER_VEINSIZE = 9;
    private static final CountRangeConfig FOSSIL = new CountRangeConfig(10, 30, 0, 70);
    private static final int FOSSIL_VEINSIZE = 15;

    public static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
                    if (ProgressionWorldGenConfig.enableIaniteOre.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.ianite_ore.getDefaultState(), IANITE_VEINSIZE), Placement.COUNT_RANGE, IANITE));
                    }
                    if (ProgressionWorldGenConfig.enableFossils.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.fossil_ore.getDefaultState(), FOSSIL_VEINSIZE), Placement.COUNT_RANGE, FOSSIL));
                    }
                
        }
    }

    public static void setupNetherOreGeneration() {
        if (ProgressionWorldGenConfig.enableTritaniumOre.get()) {
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, 
            		ProgressionBlocks.tritanium_ore.getDefaultState(), TRITANIUM_VEINSIZE), Placement.COUNT_RANGE, TRITANIUM));
        }
    }
    
    //End Generation provided by kwpugh
    public static void setupEndOreGeneration() {
        if (ProgressionWorldGenConfig.enableEnderOre.get()) {
        	Biomes.END_HIGHLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(END_OREGEN, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
        			ProgressionBlocks.ender_ore.getDefaultState(), ENDER_VEINSIZE), Placement.COUNT_RANGE, ENDER)); 
        	Biomes.END_MIDLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(END_OREGEN, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
        			ProgressionBlocks.ender_ore.getDefaultState(), ENDER_VEINSIZE), Placement.COUNT_RANGE, ENDER)); 
        	Biomes.END_BARRENS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(END_OREGEN, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
        			ProgressionBlocks.ender_ore.getDefaultState(), ENDER_VEINSIZE), Placement.COUNT_RANGE, ENDER)); 
        	Biomes.SMALL_END_ISLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(END_OREGEN, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
        			ProgressionBlocks.ender_ore.getDefaultState(), ENDER_VEINSIZE), Placement.COUNT_RANGE, ENDER)); 
        	Biomes.THE_END.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(END_OREGEN, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
        			ProgressionBlocks.ender_ore.getDefaultState(), ENDER_VEINSIZE), Placement.COUNT_RANGE, ENDER)); 
        }
    }
}

package com.moreprogression.main.world;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.ProgressionWorldGenConfig;
import com.moreprogression.main.world.feature.SilverwoodTreeFeature;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BirchForestBiome;
import net.minecraft.world.biome.FlowerForestBiome;
import net.minecraft.world.biome.MountainsBiome;
import net.minecraft.world.biome.PlainsBiome;
import net.minecraft.world.biome.TaigaBiome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ProgressionPlantGeneration {
	public static final ChanceConfig BLUEBERRY = new ChanceConfig(10);
	
	public static void setupPlantGeneration() {
		for(Biome biome : ForgeRegistries.BIOMES) {
				if(ProgressionWorldGenConfig.enableBlueberryBush.get()) {
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
								new BushConfig(ProgressionBlocks.blueberry_bush.getDefaultState()), Placement.CHANCE_HEIGHTMAP, BLUEBERRY));
				}
			
			if(biome instanceof PlainsBiome || biome instanceof BirchForestBiome || biome instanceof TaigaBiome || biome instanceof FlowerForestBiome || biome instanceof MountainsBiome) {
				biome.addFeature(Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new SilverwoodTreeFeature(NoFeatureConfig::deserialize, false), 
						IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig((int) 0.2, 0.01f, 1)));
			}
		}
	}
}

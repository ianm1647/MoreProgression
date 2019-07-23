package com.moreprogression.main.world;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.ProgressionWorldGenConfig;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ProgressionPlantGeneration {
	public static final ChanceConfig BLUEBERRY = new ChanceConfig(8);
	public static final ChanceConfig BLOODWOOD = new ChanceConfig(8);
	
	public static void setupPlantGeneration() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			if(ProgressionWorldGenConfig.enableBlueberryBush.get()) {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
					new BushConfig(ProgressionBlocks.blueberry_bush.getDefaultState()), Placement.CHANCE_HEIGHTMAP, BLUEBERRY));
			}
		}
	}
}

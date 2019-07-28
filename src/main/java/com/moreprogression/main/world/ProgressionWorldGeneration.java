package com.moreprogression.main.world;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.WorldGenConfig;
import com.moreprogression.main.world.feature.EndOreFeature;
import com.moreprogression.main.world.feature.SilverwoodTreeFeature;

import net.minecraft.world.biome.BadlandsBiome;
import net.minecraft.world.biome.BadlandsPlateauBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.BirchForestBiome;
import net.minecraft.world.biome.DesertBiome;
import net.minecraft.world.biome.DesertHillsBiome;
import net.minecraft.world.biome.FlowerForestBiome;
import net.minecraft.world.biome.ModifiedBadlandsPlateauBiome;
import net.minecraft.world.biome.ModifiedWoodedBadlandsPlateauBiome;
import net.minecraft.world.biome.MountainsBiome;
import net.minecraft.world.biome.PlainsBiome;
import net.minecraft.world.biome.TaigaBiome;
import net.minecraft.world.biome.WoodedBadlandsPlateauBiome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ProgressionWorldGeneration {
	//Plants
	public static final ChanceConfig BLUEBERRY = new ChanceConfig(10);
	public static final ChanceConfig CACTUS = new ChanceConfig(10);
	
	//Ores
    private static final CountRangeConfig IANITE = new CountRangeConfig(3, 5, 0, 13);
    private static final int IANITE_VEINSIZE = 5;
    private static final CountRangeConfig TRITANIUM = new CountRangeConfig(5, 10, 0, 128);
    private static final int TRITANIUM_VEINSIZE = 8;
    private static final CountRangeConfig ENDER = new CountRangeConfig(8, 2, 0, 128);
    private static final EndOreFeature END_OREGEN = new EndOreFeature(null);
    private static final int ENDER_VEINSIZE = 9;
    private static final CountRangeConfig FOSSIL = new CountRangeConfig(10, 30, 0, 70);
    private static final int FOSSIL_VEINSIZE = 15;
    
    //Rocks
    private static final CountRangeConfig MARBLE = new CountRangeConfig(25, 20, 0, 128);
    private static final int MARBLE_VEINSIZE = 18;
    private static final CountRangeConfig LIMESTONE = new CountRangeConfig(25, 20, 0, 128);
    private static final int LIMESTONE_VEINSIZE = 26;
    private static final CountRangeConfig BASALT = new CountRangeConfig(25, 10, 0, 128);
    private static final int BASALT_VEINSIZE = 23;

    public static void setupOverworldGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
                    if (WorldGenConfig.enableIaniteOre.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.ianite_ore.getDefaultState(), IANITE_VEINSIZE), Placement.COUNT_RANGE, IANITE));
                    }
                    if (WorldGenConfig.enableFossils.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.fossil_ore.getDefaultState(), FOSSIL_VEINSIZE), Placement.COUNT_RANGE, FOSSIL));
                    }
                    if (WorldGenConfig.enableMarble.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.marble.getDefaultState(), MARBLE_VEINSIZE), Placement.COUNT_RANGE, MARBLE));
                    }
                    if (WorldGenConfig.enableLimestone.get()) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                        		ProgressionBlocks.limestone.getDefaultState(), LIMESTONE_VEINSIZE), Placement.COUNT_RANGE, LIMESTONE));
                    }
                
        }
    }

    public static void setupNetherGeneration() {
        if (WorldGenConfig.enableTritaniumOre.get()) {
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, 
            		ProgressionBlocks.tritanium_ore.getDefaultState(), TRITANIUM_VEINSIZE), Placement.COUNT_RANGE, TRITANIUM));
        }
        if (WorldGenConfig.enableBasalt.get()) {
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, 
            		ProgressionBlocks.basalt.getDefaultState(), BASALT_VEINSIZE), Placement.COUNT_RANGE, BASALT));
        }
    }
    
    //End Generation provided by kwpugh
    public static void setupEndGeneration() {
        if (WorldGenConfig.enableEnderOre.get()) {
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
    
	public static void setupPlantGeneration() {
		for(Biome biome : ForgeRegistries.BIOMES) {
				if(WorldGenConfig.enableBlueberryBush.get()) {
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
								new BushConfig(ProgressionBlocks.blueberry_bush.getDefaultState()), Placement.CHANCE_HEIGHTMAP, BLUEBERRY));
				}
				if(WorldGenConfig.enableSilverwoodTreeGen.get()) {
						if(biome instanceof PlainsBiome || biome instanceof BirchForestBiome || biome instanceof TaigaBiome || biome instanceof FlowerForestBiome || biome instanceof MountainsBiome) {
							biome.addFeature(Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new SilverwoodTreeFeature(NoFeatureConfig::deserialize, false), 
							IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig((int) 0.2, 0.01f, 1)));
						}	
				}
				if(WorldGenConfig.enableBlueberryBush.get()) {
						if(biome instanceof DesertBiome || biome instanceof BadlandsBiome || biome instanceof BadlandsPlateauBiome || biome instanceof DesertHillsBiome ||
								biome instanceof ModifiedBadlandsPlateauBiome || biome instanceof WoodedBadlandsPlateauBiome || biome instanceof ModifiedWoodedBadlandsPlateauBiome) {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
							new BushConfig(ProgressionBlocks.cactus_berry_bush.getDefaultState()), Placement.CHANCE_HEIGHTMAP, CACTUS));
						}
				}
		}
	}
}

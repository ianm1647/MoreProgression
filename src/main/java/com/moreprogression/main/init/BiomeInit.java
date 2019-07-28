package com.moreprogression.main.init;

import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.config.BiomeConfig;
import com.moreprogression.main.config.BlockConfig;
import com.moreprogression.main.world.biome.CherryForestBiome;
import com.moreprogression.main.world.biome.CorruptedForestBiome;
import com.moreprogression.main.world.biome.DustWastelandBiome;
import com.moreprogression.main.world.biome.FieldBiome;
import com.moreprogression.main.world.biome.ProgressionBiomes;
import com.moreprogression.main.world.biome.RedwoodForestBiome;
import com.moreprogression.main.world.biome.TerracottaPlainsBiome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BiomeInit {
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class registryEvents {
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			if(ProgressionBiomes.biomeRegistry == null)
				ProgressionBiomes.biomeRegistry = event.getRegistry();

		if (BlockConfig.enableCherryWoodType.get()) {
			ProgressionBiomes.registerBiome(new CherryForestBiome(), "Cherry Forest", 10, true, BiomeManager.BiomeType.WARM, Type.FOREST);
		}
		if (BiomeConfig.enableCorruptedForest.get()) {
			ProgressionBiomes.registerBiome(new CorruptedForestBiome(), "Corrupted Forest", 15, true, BiomeManager.BiomeType.COOL, Type.FOREST);
		}
		if (BiomeConfig.enableTerracottaPlains.get()) {
			ProgressionBiomes.registerBiome(new TerracottaPlainsBiome(), "Terracotta Plains", 12, true, BiomeManager.BiomeType.WARM, Type.PLAINS);
		}
		if (BiomeConfig.enableDustWasteland.get()) {
			ProgressionBiomes.registerBiome(new DustWastelandBiome(), "Dust Wasteland", 8, true, BiomeManager.BiomeType.DESERT, Type.DRY);
		}
		if (BlockConfig.enableRedwoodWoodType.get()) {
			ProgressionBiomes.registerBiome(new RedwoodForestBiome(), "Redwood Forest", 10, true, BiomeManager.BiomeType.WARM, Type.LUSH);
		}
		if (BiomeConfig.enableField.get()) {
			ProgressionBiomes.registerBiome(new FieldBiome(), "Field", 10, true, BiomeManager.BiomeType.WARM, Type.LUSH);
		}
			MoreProgression.LOGGER.debug("Biomes registered");

		}
	}
}

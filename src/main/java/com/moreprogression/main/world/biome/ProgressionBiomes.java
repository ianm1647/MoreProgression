package com.moreprogression.main.world.biome;

import java.util.ArrayList;
import java.util.List;

import com.moreprogression.main.MoreProgression;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.IForgeRegistry;

public class ProgressionBiomes {
	
	public static Biome corrupted_forest;
	public static Biome cherry_forest;
	public static Biome terracotta_plains;
	public static Biome dust_wasteland;
	
	public static BiomeMeta registerBiome(Biome biome, String name, int weight, boolean allowPlayerSpawning, BiomeManager.BiomeType spawnType, Type... types)
	{
		if(biomeRegistry == null)
			throw new NullPointerException("Biome Registry not set");

		biome.setRegistryName(MoreProgression.MODID, name.toLowerCase().replaceAll(" ", "_"));
		biomeRegistry.register(biome);

		BiomeMeta meta = new BiomeMeta(biome, weight, allowPlayerSpawning, types);
		biomes.add(meta);

		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(spawnType, new BiomeManager.BiomeEntry(biome, weight));

		return meta;
	}

	private static final List<BiomeMeta> biomes = new ArrayList<>();
	public static IForgeRegistry<Biome> biomeRegistry;

	private static class BiomeMeta
	{
		private final Biome biome;
		private final int biomeWeight;
		private final Type[] types;
		private final boolean allowPlayerSpawning;

		public BiomeMeta(Biome biome, int spawnWeight, boolean allowPlayerSpawning, Type... types)
		{
			this.biome = biome;
			this.biomeWeight = spawnWeight;
			this.allowPlayerSpawning = allowPlayerSpawning;
			this.types = types;
		}

		@SuppressWarnings("unused")
		public Biome getBiome()
		{
			return biome;
		}

		@SuppressWarnings("unused")
		public int getBiomeWeight()
		{
			return biomeWeight;
		}

		@SuppressWarnings("unused")
		public boolean allowPlayerSpawning()
		{
			return allowPlayerSpawning;
		}

		@SuppressWarnings("unused")
		public Type[] getTypes()
		{
			return types;
		}
	}

}

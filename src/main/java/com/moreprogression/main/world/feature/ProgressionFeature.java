package com.moreprogression.main.world.feature;

import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class ProgressionFeature<FC extends IFeatureConfig> extends ForgeRegistryEntry<Feature<?>> {
	public static final Feature<NoFeatureConfig> CHERRY_TREE = register("cherry_tree", new CherryTreeFeature(NoFeatureConfig::deserialize, false));
	public static final Feature<NoFeatureConfig> CORRUPTED_FLOWER = register("corrupted_flower", new CorruptedFlowerFeature(NoFeatureConfig::deserialize));
	public static final Feature<NoFeatureConfig> REDWOOD_LARGE = register("redwood_large", new MegaRedwoodTreeFeature(NoFeatureConfig::deserialize, false, 10, 20,
			ProgressionBlocks.redwood_log.getDefaultState(), ProgressionBlocks.redwood_leaves.getDefaultState()));
	public static final Feature<NoFeatureConfig> REDWOOD_NORMAL = register("redwood_normal", new RedwoodTreeFeature(NoFeatureConfig::deserialize, false, 4, 
			ProgressionBlocks.redwood_log.getDefaultState(), ProgressionBlocks.redwood_leaves.getDefaultState(), false));	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
		return (F)(Registry.<Feature<?>>register(Registry.FEATURE, key, value));
	}
}

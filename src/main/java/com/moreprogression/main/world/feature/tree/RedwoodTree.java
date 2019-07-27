package com.moreprogression.main.world.feature.tree;

import java.util.Random;

import javax.annotation.Nullable;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.world.feature.MegaRedwoodTreeFeature;
import com.moreprogression.main.world.feature.RedwoodTreeFeature;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class RedwoodTree extends BigTree {
	@Nullable
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new RedwoodTreeFeature(NoFeatureConfig::deserialize, true, 4 + random.nextInt(7), ProgressionBlocks.redwood_log.getDefaultState(), ProgressionBlocks.redwood_leaves.getDefaultState(), false).setSapling((SaplingBlock)ProgressionBlocks.redwood_sapling);
	}

	@Nullable
	protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
		return new MegaRedwoodTreeFeature(NoFeatureConfig::deserialize, true, 10, 20, ProgressionBlocks.redwood_log.getDefaultState(), ProgressionBlocks.redwood_leaves.getDefaultState()).setSapling((SaplingBlock)ProgressionBlocks.redwood_sapling);
	}
}

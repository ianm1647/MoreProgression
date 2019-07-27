package com.moreprogression.main.world.feature.tree;

import java.util.Random;

import javax.annotation.Nullable;

import com.moreprogression.main.world.feature.SilverwoodTreeFeature;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class SilverwoodTree extends Tree {
	@Nullable
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new SilverwoodTreeFeature(NoFeatureConfig::deserialize, true);
		}
}

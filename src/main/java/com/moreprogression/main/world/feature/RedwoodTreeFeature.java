package com.moreprogression.main.world.feature;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;
import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraftforge.common.IPlantable;

public class RedwoodTreeFeature extends TreeFeature {
	   public RedwoodTreeFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51488_1_, boolean p_i51488_2_, int p_i51488_3_, BlockState p_i51488_4_, BlockState p_i51488_5_, boolean p_i51488_6_) {
	      super(p_i51488_1_, p_i51488_2_, p_i51488_3_, p_i51488_4_, p_i51488_5_, p_i51488_6_);
	      setSapling((IPlantable)ProgressionBlocks.redwood_sapling);
	   }

	   protected int getHeight(Random random) {
	      return this.minTreeHeight + random.nextInt(7);
	   }
	}

package com.moreprogression.main.world.feature;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;
import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class CorruptedFlowerFeature extends Feature<NoFeatureConfig> {
   private static final FlowerBlock CORRUPTED_FLOWER_BLOCK = (FlowerBlock)ProgressionBlocks.corrupted_flower;

   public CorruptedFlowerFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49894_1_) {
      super(p_i49894_1_);
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
      for(BlockState blockstate = worldIn.getBlockState(pos); (blockstate.isAir(worldIn, pos) || blockstate.isIn(BlockTags.SMALL_FLOWERS)) && pos.getY() > 0; blockstate = worldIn.getBlockState(pos)) {
         pos = pos.down();
      }

      BlockState blockstate1 = CORRUPTED_FLOWER_BLOCK.getDefaultState();

      for(int i = 0; i < 4; ++i) {
         BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
         if (worldIn.isAirBlock(blockpos) && blockstate1.isValidPosition(worldIn, blockpos)) {
            worldIn.setBlockState(blockpos, blockstate1, 2);
         }
      }

      return true;
   }
}

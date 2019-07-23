package com.moreprogression.main.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class TerracottaGrassBlock extends BushBlock {
	   protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

	   public TerracottaGrassBlock(Block.Properties properties) {
	      super(properties);
	   }

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return SHAPE;
	   }
	   
	   protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) 
	   {
		   return state.getBlock() == Blocks.BLUE_TERRACOTTA;
	      
	   }
	   
	   public Block.OffsetType getOffsetType() {
		      return Block.OffsetType.XYZ;
		   }
}

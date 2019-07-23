package com.moreprogression.main.block.custom;

import java.util.Random;

import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class CustomOreBlock extends OreBlock 
{
	public CustomOreBlock(Block.Properties properties) {
		super(properties);
	   }
	
	protected int func_220281_a(Random p_220281_1_) {
		if (this == ProgressionBlocks.ianite_ore) {
				return MathHelper.nextInt(p_220281_1_, 0, 7);
			} else {
				return this == ProgressionBlocks.fossil_ore ? MathHelper.nextInt(p_220281_1_, 2, 3) : 0;
			}
	}	
}

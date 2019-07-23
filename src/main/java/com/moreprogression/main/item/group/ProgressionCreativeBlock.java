package com.moreprogression.main.item.group;

import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ProgressionCreativeBlock extends ItemGroup {
	public ProgressionCreativeBlock() {
		super("moreprogression.block");

	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.BLOCK_TO_ITEM.get(ProgressionBlocks.ianite_ore));
	}

}

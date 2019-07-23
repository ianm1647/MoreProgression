package com.moreprogression.main.item.group;

import com.moreprogression.main.item.ProgressionItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ProgressionCreativeTool extends ItemGroup {
	public ProgressionCreativeTool() {
		super("moreprogression.tool");

	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ProgressionItems.bone_sword);
	}
}

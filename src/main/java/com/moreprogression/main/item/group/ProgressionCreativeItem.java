package com.moreprogression.main.item.group;

import com.moreprogression.main.item.ProgressionItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ProgressionCreativeItem extends ItemGroup {
	public ProgressionCreativeItem() {
		super("moreprogression.item");

	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ProgressionItems.tritanium_ingot);
	}
}

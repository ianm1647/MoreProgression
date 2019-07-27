package com.moreprogression.main.item.custom;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class CustomStickAndStone extends FlintAndSteelItem {

	public CustomStickAndStone(Properties builder) {
		super(builder);
	}
	
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.DARK_RED + "ONLY 1 USE"));
	} 

}

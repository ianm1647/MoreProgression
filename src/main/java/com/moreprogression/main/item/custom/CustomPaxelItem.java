package com.moreprogression.main.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class CustomPaxelItem extends ToolItem
{
	
	public CustomPaxelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder) {
		super(attackDamageIn, attackSpeedIn, tier, null, builder.addToolType(ToolType.AXE, tier.getHarvestLevel())
				.addToolType(ToolType.PICKAXE, tier.getHarvestLevel()).addToolType(ToolType.SHOVEL, tier.getHarvestLevel()));
	}
	
	public boolean canHarvestBlock(BlockState blockIn) {
		int i = this.getTier().getHarvestLevel();
		return i >= blockIn.getHarvestLevel();
	}

	public float getDestroySpeed(ItemStack stack, BlockState state) {
		Material material = state.getMaterial();
		return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK
				&& material != Material.WOOD && material != Material.PLANTS ? super.getDestroySpeed(stack, state)
						: this.efficiency;
	}
	
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return true;
	}
}

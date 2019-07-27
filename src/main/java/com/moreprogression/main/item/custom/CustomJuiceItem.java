package com.moreprogression.main.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class CustomJuiceItem extends Item {
	   public CustomJuiceItem(Item.Properties p_i50054_1_) {
	      super(p_i50054_1_);
	   }
	   
	   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
	      super.onItemUseFinish(stack, worldIn, entityLiving);
	      return new ItemStack(Items.GLASS_BOTTLE);
	   }
	   
	   public UseAction getUseAction(ItemStack stack) {
		      return UseAction.DRINK;
		   }
	   
	   public static Food buildJuice(int p_221412_0_) {
		      return (new Food.Builder()).hunger(p_221412_0_).saturation(0.6F).build();
		   }
}


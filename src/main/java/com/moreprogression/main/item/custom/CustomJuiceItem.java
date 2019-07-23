package com.moreprogression.main.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CustomJuiceItem extends Item {

	public CustomJuiceItem(Properties builder) {
		super(builder);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		if (entityLiving instanceof ServerPlayerEntity) {
			ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
			CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
			serverplayerentity.addStat(Stats.ITEM_USED.get(this));
		}
		if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode) {
			stack.shrink(1);
		}
		return stack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : stack;
	}
	
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.setActiveHand(handIn);
		return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
	}
}

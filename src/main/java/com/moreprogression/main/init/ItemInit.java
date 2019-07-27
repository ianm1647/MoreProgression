package com.moreprogression.main.init;

import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.item.ProgressionArmorMaterials;
import com.moreprogression.main.item.ProgressionItems;
import com.moreprogression.main.item.ProgressionToolMaterials;
import com.moreprogression.main.item.custom.CustomJuiceItem;
import com.moreprogression.main.item.custom.CustomStickAndStone;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TallBlockItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemInit {
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class registryEvents {
		
		//Items
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					//Items
					ProgressionItems.stone_pebble = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("stone_pebble")),
					ProgressionItems.ianite_gem = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("ianite_gem")),
					ProgressionItems.tritanium_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("tritanium_ingot")),
					ProgressionItems.ender_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("ender_ingot")),
					ProgressionItems.bone_fragment = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("bone_fragment")),
					ProgressionItems.dragon_scale = new Item(new Item.Properties().group(MoreProgression.ITEM).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("dragon_scale")),
					ProgressionItems.enderanium_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM).rarity(Rarity.UNCOMMON)).setRegistryName(MoreProgression.location("enderanium_ingot")),
					
					//Dust
					ProgressionItems.coal_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("coal_dust")),
					ProgressionItems.iron_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("iron_dust")),
					ProgressionItems.gold_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("gold_dust")),
					ProgressionItems.diamond_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("diamond_dust")),
					ProgressionItems.emerald_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("emerald_dust")),
					ProgressionItems.quartz_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("quartz_dust")),
					ProgressionItems.ianite_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("ianite_dust")),
					ProgressionItems.tritanium_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("tritanium_dust")),
					ProgressionItems.ender_dust = new Item(new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("ender_dust")),
					
					//Foods
					ProgressionItems.cherry = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build())).setRegistryName(MoreProgression.location("cherry")),
					ProgressionItems.cherry_pie = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(12).saturation(0.4F).build())).setRegistryName(MoreProgression.location("cherry_pie")),
					ProgressionItems.hamburger = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(10).saturation(0.8F).build())).setRegistryName(MoreProgression.location("hamburger")),
					ProgressionItems.corn = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.8F).build())).setRegistryName(MoreProgression.location("corn")),
					ProgressionItems.cooked_carrot = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build())).setRegistryName(MoreProgression.location("cooked_carrot")),
					ProgressionItems.peach = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(4).saturation(0.3F).build())).setRegistryName(MoreProgression.location("peach")),
					ProgressionItems.peach_pie = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(10).saturation(0.4F).build())).setRegistryName(MoreProgression.location("peach_pie")),
					ProgressionItems.raw_horse = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build())).setRegistryName(MoreProgression.location("raw_horse")),
					ProgressionItems.cooked_horse = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(8).saturation(0.8F).build())).setRegistryName(MoreProgression.location("cooked_horse")),
					ProgressionItems.raw_calamari = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build())).setRegistryName(MoreProgression.location("raw_calamari")),
					ProgressionItems.cooked_calamari = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(6).saturation(0.8F).build())).setRegistryName(MoreProgression.location("cooked_calamari")),
					
					//Drinks
					ProgressionItems.apple_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(5))).setRegistryName(MoreProgression.location("apple_juice")),
					ProgressionItems.cherry_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(6))).setRegistryName(MoreProgression.location("cherry_juice")),
					ProgressionItems.peach_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(5))).setRegistryName(MoreProgression.location("peach_juice")),
					ProgressionItems.carrot_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(6))).setRegistryName(MoreProgression.location("carrot_juice")),
					
					//FoodSeeds
					ProgressionItems.blue_berries = new BlockNamedItem(ProgressionBlocks.blueberry_bush, new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build()))
						.setRegistryName(MoreProgression.location("blue_berries")),
					
					//Seeds
					ProgressionItems.corn_seeds = new BlockNamedItem(ProgressionBlocks.corn_crop, new Item.Properties().group(MoreProgression.ITEM)).setRegistryName(MoreProgression.location("corn_seeds")),
					
					//Tools
					ProgressionItems.stick_and_stone = new CustomStickAndStone(new Item.Properties().group(MoreProgression.TOOL).maxDamage(1)).setRegistryName(MoreProgression.location("stick_and_stone")),
						//Ianite
					ProgressionItems.ianite_sword = new SwordItem(ProgressionToolMaterials.Ianite, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_sword")),
					ProgressionItems.ianite_pickaxe = new PickaxeItem(ProgressionToolMaterials.Ianite, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_pickaxe")),
					ProgressionItems.ianite_axe = new AxeItem(ProgressionToolMaterials.Ianite, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_axe")),
					ProgressionItems.ianite_shovel = new ShovelItem(ProgressionToolMaterials.Ianite, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_shovel")),
					ProgressionItems.ianite_hoe = new HoeItem(ProgressionToolMaterials.Ianite, 1.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_hoe")),
						//Tritanium
					ProgressionItems.tritanium_sword = new SwordItem(ProgressionToolMaterials.Tritanium, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_sword")),
					ProgressionItems.tritanium_pickaxe = new PickaxeItem(ProgressionToolMaterials.Tritanium, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_pickaxe")),
					ProgressionItems.tritanium_axe = new AxeItem(ProgressionToolMaterials.Tritanium, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_axe")),
					ProgressionItems.tritanium_shovel = new ShovelItem(ProgressionToolMaterials.Tritanium, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_shovel")),
					ProgressionItems.tritanium_hoe = new HoeItem(ProgressionToolMaterials.Tritanium, 1.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_hoe")),
						//Bone
					ProgressionItems.bone_sword = new SwordItem(ProgressionToolMaterials.Bone, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_sword")),
					ProgressionItems.bone_pickaxe = new PickaxeItem(ProgressionToolMaterials.Bone, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_pickaxe")),
					ProgressionItems.bone_axe = new AxeItem(ProgressionToolMaterials.Bone, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_axe")),
					ProgressionItems.bone_shovel = new ShovelItem(ProgressionToolMaterials.Bone, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_shovel")),
					ProgressionItems.bone_hoe = new HoeItem(ProgressionToolMaterials.Bone, 1.0f, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_hoe")),
						//Star
					ProgressionItems.star_sword = new SwordItem(ProgressionToolMaterials.Star, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("star_sword")),
					ProgressionItems.star_pickaxe = new PickaxeItem(ProgressionToolMaterials.Star, -20, -2.8f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("star_pickaxe")),
					ProgressionItems.star_axe = new AxeItem(ProgressionToolMaterials.Star, 20, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("star_axe")),
					ProgressionItems.star_shovel = new ShovelItem(ProgressionToolMaterials.Star, -10, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("star_shovel")),
					ProgressionItems.star_hoe = new HoeItem(ProgressionToolMaterials.Star, 1.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("star_hoe")),
						//Enderanium
					ProgressionItems.enderanium_sword = new SwordItem(ProgressionToolMaterials.Enderanium, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_sword")),
					ProgressionItems.enderanium_pickaxe = new PickaxeItem(ProgressionToolMaterials.Enderanium, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_pickaxe")),
					ProgressionItems.enderanium_axe = new AxeItem(ProgressionToolMaterials.Enderanium, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_axe")),
					ProgressionItems.enderanium_shovel = new ShovelItem(ProgressionToolMaterials.Enderanium, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_shovel")),
					ProgressionItems.enderanium_hoe = new HoeItem(ProgressionToolMaterials.Enderanium, 1.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_hoe")),
					
					//Armor
						//Ianite
					ProgressionItems.ianite_helmet = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_helmet")),
					ProgressionItems.ianite_chestplate = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_chestplate")),
					ProgressionItems.ianite_leggings = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_leggings")),
					ProgressionItems.ianite_boots = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("ianite_boots")),
						//Tritanium
					ProgressionItems.tritanium_helmet = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_helmet")),
					ProgressionItems.tritanium_chestplate = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_chestplate")),
					ProgressionItems.tritanium_leggings = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_leggings")),
					ProgressionItems.tritanium_boots = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("tritanium_boots")),
						//Bone
					ProgressionItems.bone_helmet = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_helmet")),
					ProgressionItems.bone_chestplate = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_chestplate")),
					ProgressionItems.bone_leggings = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_leggings")),
					ProgressionItems.bone_boots = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL)).setRegistryName(MoreProgression.location("bone_boots")),
						//Dragon
					ProgressionItems.dragon_helmet = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("dragon_helmet")),
					ProgressionItems.dragon_chestplate = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("dragon_chestplate")),
					ProgressionItems.dragon_leggings = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("dragon_leggings")),
					ProgressionItems.dragon_boots = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC)).setRegistryName(MoreProgression.location("dragon_boots")),
						//Enderanium
					ProgressionItems.enderanium_helmet = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_helmet")),
					ProgressionItems.enderanium_chestplate = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_chestplate")),
					ProgressionItems.enderanium_leggings = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_leggings")),
					ProgressionItems.enderanium_boots = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE)).setRegistryName(MoreProgression.location("enderanium_boots")),
					
					//BlockItems
					ProgressionItems.ianite_block = new BlockItem(ProgressionBlocks.ianite_block, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.ianite_block.getRegistryName()),
					ProgressionItems.ianite_ore = new BlockItem(ProgressionBlocks.ianite_ore, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.ianite_ore.getRegistryName()),
					ProgressionItems.tritanium_block = new BlockItem(ProgressionBlocks.tritanium_block, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.tritanium_block.getRegistryName()),
					ProgressionItems.tritanium_ore = new BlockItem(ProgressionBlocks.tritanium_ore, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.tritanium_ore.getRegistryName()),
					ProgressionItems.ender_block = new BlockItem(ProgressionBlocks.ender_block, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.ender_block.getRegistryName()),
					ProgressionItems.ender_ore = new BlockItem(ProgressionBlocks.ender_ore, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.ender_ore.getRegistryName()),
					ProgressionItems.enderanium_block = new BlockItem(ProgressionBlocks.enderanium_block, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.enderanium_block.getRegistryName()),
					ProgressionItems.flint_block = new BlockItem(ProgressionBlocks.flint_block, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.flint_block.getRegistryName()),
					ProgressionItems.marble = new BlockItem(ProgressionBlocks.marble, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble.getRegistryName()),
					ProgressionItems.marble_bricks = new BlockItem(ProgressionBlocks.marble_bricks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_bricks.getRegistryName()),
					ProgressionItems.limestone = new BlockItem(ProgressionBlocks.limestone, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone.getRegistryName()),
					ProgressionItems.limestone_bricks = new BlockItem(ProgressionBlocks.limestone_bricks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_bricks.getRegistryName()),
					ProgressionItems.basalt = new BlockItem(ProgressionBlocks.basalt, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt.getRegistryName()),
					ProgressionItems.basalt_bricks = new BlockItem(ProgressionBlocks.basalt_bricks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_bricks.getRegistryName()),
					ProgressionItems.fossil_ore = new BlockItem(ProgressionBlocks.fossil_ore, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.fossil_ore.getRegistryName()),
					ProgressionItems.corrupted_ore = new BlockItem(ProgressionBlocks.corrupted_ore, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.corrupted_ore.getRegistryName()),
					ProgressionItems.dust = new BlockItem(ProgressionBlocks.dust, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.dust.getRegistryName()),
					
					//Wood
						//Cherry
					ProgressionItems.cherry_log = new BlockItem(ProgressionBlocks.cherry_log, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_log.getRegistryName()),
					ProgressionItems.cherry_leaves = new BlockItem(ProgressionBlocks.cherry_leaves, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_leaves.getRegistryName()),
					ProgressionItems.cherry_planks = new BlockItem(ProgressionBlocks.cherry_planks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_planks.getRegistryName()),
					ProgressionItems.cherry_slab = new BlockItem(ProgressionBlocks.cherry_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_slab.getRegistryName()),
					ProgressionItems.cherry_stairs = new BlockItem(ProgressionBlocks.cherry_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_stairs.getRegistryName()),
					ProgressionItems.cherry_door = new TallBlockItem(ProgressionBlocks.cherry_door, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_door.getRegistryName()),
				    ProgressionItems.cherry_trapdoor = new BlockItem(ProgressionBlocks.cherry_trapdoor, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_trapdoor.getRegistryName()),
				    ProgressionItems.cherry_fence = new BlockItem(ProgressionBlocks.cherry_fence, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_fence.getRegistryName()),
				    ProgressionItems.cherry_fencegate = new BlockItem(ProgressionBlocks.cherry_fencegate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_fencegate.getRegistryName()),
				    ProgressionItems.cherry_pressure_plate = new BlockItem(ProgressionBlocks.cherry_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_pressure_plate.getRegistryName()),
				    ProgressionItems.cherry_button = new BlockItem(ProgressionBlocks.cherry_button, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_button.getRegistryName()),
				    
				    	//Silverwood
					ProgressionItems.silverwood_log = new BlockItem(ProgressionBlocks.silverwood_log, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_log.getRegistryName()),
					ProgressionItems.silverwood_leaves = new BlockItem(ProgressionBlocks.silverwood_leaves, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_leaves.getRegistryName()),
					ProgressionItems.silverwood_planks = new BlockItem(ProgressionBlocks.silverwood_planks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_planks.getRegistryName()),
					ProgressionItems.silverwood_slab = new BlockItem(ProgressionBlocks.silverwood_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_slab.getRegistryName()),
					ProgressionItems.silverwood_stairs = new BlockItem(ProgressionBlocks.silverwood_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_stairs.getRegistryName()),
					ProgressionItems.silverwood_door = new TallBlockItem(ProgressionBlocks.silverwood_door, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_door.getRegistryName()),
					ProgressionItems.silverwood_trapdoor = new BlockItem(ProgressionBlocks.silverwood_trapdoor, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_trapdoor.getRegistryName()),
					ProgressionItems.silverwood_fence = new BlockItem(ProgressionBlocks.silverwood_fence, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_fence.getRegistryName()),
					ProgressionItems.silverwood_fencegate = new BlockItem(ProgressionBlocks.silverwood_fencegate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_fencegate.getRegistryName()),
					ProgressionItems.silverwood_pressure_plate = new BlockItem(ProgressionBlocks.silverwood_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_pressure_plate.getRegistryName()),
					ProgressionItems.silverwood_button = new BlockItem(ProgressionBlocks.silverwood_button, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_button.getRegistryName()),
				    
						//Redwood
					ProgressionItems.redwood_log= new BlockItem(ProgressionBlocks.redwood_log, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_log.getRegistryName()),
					ProgressionItems.redwood_leaves = new BlockItem(ProgressionBlocks.redwood_leaves, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_leaves.getRegistryName()),
					ProgressionItems.redwood_planks = new BlockItem(ProgressionBlocks.redwood_planks, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_planks.getRegistryName()),
					ProgressionItems.redwood_slab = new BlockItem(ProgressionBlocks.redwood_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_slab.getRegistryName()),
					ProgressionItems.redwood_stairs = new BlockItem(ProgressionBlocks.redwood_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_stairs.getRegistryName()),
					ProgressionItems.redwood_door = new TallBlockItem(ProgressionBlocks.redwood_door, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_door.getRegistryName()),
					ProgressionItems.redwood_trapdoor = new BlockItem(ProgressionBlocks.redwood_trapdoor, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_trapdoor.getRegistryName()),
					ProgressionItems.redwood_fence = new BlockItem(ProgressionBlocks.redwood_fence, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_fence.getRegistryName()),
					ProgressionItems.redwood_fencegate = new BlockItem(ProgressionBlocks.redwood_fencegate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_fencegate.getRegistryName()),
					ProgressionItems.redwood_pressure_plate = new BlockItem(ProgressionBlocks.redwood_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_pressure_plate.getRegistryName()),
					ProgressionItems.redwood_button = new BlockItem(ProgressionBlocks.redwood_button, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_button.getRegistryName()),
					
				    //Rock
					ProgressionItems.marble_slab = new BlockItem(ProgressionBlocks.marble_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_slab.getRegistryName()),
					ProgressionItems.marble_stairs = new BlockItem(ProgressionBlocks.marble_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_stairs.getRegistryName()),
					ProgressionItems.limestone_slab = new BlockItem(ProgressionBlocks.limestone_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_slab.getRegistryName()),
					ProgressionItems.limestone_stairs = new BlockItem(ProgressionBlocks.limestone_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_stairs.getRegistryName()),
					ProgressionItems.basalt_slab = new BlockItem(ProgressionBlocks.basalt_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_slab.getRegistryName()),
					ProgressionItems.basalt_stairs = new BlockItem(ProgressionBlocks.basalt_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_stairs.getRegistryName()),
					ProgressionItems.marble_brick_slab = new BlockItem(ProgressionBlocks.marble_brick_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_slab.getRegistryName()),
					ProgressionItems.marble_brick_stairs = new BlockItem(ProgressionBlocks.marble_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_stairs.getRegistryName()),
					ProgressionItems.limestone_brick_slab = new BlockItem(ProgressionBlocks.limestone_brick_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_slab.getRegistryName()),
					ProgressionItems.limestone_brick_stairs = new BlockItem(ProgressionBlocks.limestone_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_stairs.getRegistryName()),
					ProgressionItems.basalt_brick_slab = new BlockItem(ProgressionBlocks.basalt_brick_slab, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_slab.getRegistryName()),
					ProgressionItems.basalt_brick_stairs = new BlockItem(ProgressionBlocks.basalt_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_stairs.getRegistryName()),
					ProgressionItems.marble_wall = new BlockItem(ProgressionBlocks.marble_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_wall.getRegistryName()),
					ProgressionItems.marble_brick_wall = new BlockItem(ProgressionBlocks.marble_brick_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_wall.getRegistryName()),
					ProgressionItems.limestone_wall = new BlockItem(ProgressionBlocks.limestone_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_wall.getRegistryName()),
					ProgressionItems.limestone_brick_wall = new BlockItem(ProgressionBlocks.limestone_brick_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_wall.getRegistryName()),
					ProgressionItems.basalt_wall = new BlockItem(ProgressionBlocks.basalt_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_wall.getRegistryName()),
					ProgressionItems.basalt_brick_wall = new BlockItem(ProgressionBlocks.basalt_brick_wall, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_wall.getRegistryName()),
					
				    //PlantItems
					ProgressionItems.cherry_sapling = new BlockItem(ProgressionBlocks.cherry_sapling, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.cherry_sapling.getRegistryName()),
					ProgressionItems.silverwood_sapling = new BlockItem(ProgressionBlocks.silverwood_sapling, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.silverwood_sapling.getRegistryName()),
					ProgressionItems.redwood_sapling = new BlockItem(ProgressionBlocks.redwood_sapling, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.redwood_sapling.getRegistryName()),
					ProgressionItems.corrupted_flower = new BlockItem(ProgressionBlocks.corrupted_flower, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.corrupted_flower.getRegistryName()),
					ProgressionItems.terracotta_grass = new BlockItem(ProgressionBlocks.terracotta_grass, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.terracotta_grass.getRegistryName()),
					ProgressionItems.field_grass = new BlockItem(ProgressionBlocks.field_grass, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.field_grass.getRegistryName()),
					ProgressionItems.corn_grass = new BlockItem(ProgressionBlocks.corn_grass, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.corn_grass.getRegistryName()),
					
					//Tile Entities
						//Machines
					ProgressionItems.crusher = new BlockItem(ProgressionBlocks.crusher, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.crusher.getRegistryName()),
					ProgressionItems.ender_infuser = new BlockItem(ProgressionBlocks.ender_infuser, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.ender_infuser.getRegistryName()),
						//Storage
					ProgressionItems.reinforced_barrel = new BlockItem(ProgressionBlocks.reinforced_barrel, new Item.Properties().group(MoreProgression.BLOCK)).setRegistryName(ProgressionBlocks.reinforced_barrel.getRegistryName())
					
			);
			
			MoreProgression.LOGGER.info("Items registered");
		}
	}	
}

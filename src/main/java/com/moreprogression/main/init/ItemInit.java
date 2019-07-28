package com.moreprogression.main.init;

import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.config.BlockConfig;
import com.moreprogression.main.config.ItemConfig;
import com.moreprogression.main.item.ProgressionArmorMaterials;
import com.moreprogression.main.item.ProgressionItems;
import com.moreprogression.main.item.ProgressionToolMaterials;
import com.moreprogression.main.item.custom.CustomJuiceItem;
import com.moreprogression.main.item.custom.CustomPaxelItem;
import com.moreprogression.main.item.custom.CustomStickAndStone;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TallBlockItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit {
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class registryEvents {
		
		@SubscribeEvent
		public static void registerItem(final RegistryEvent.Register<Item> event) {
			registerItems(event.getRegistry());
		}
		
		//Items
		public static void registerItems(IForgeRegistry<Item> registry) {
					//Items
					registry.register(ProgressionItems.stone_pebble = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("stone_pebble")));
					registry.register(ProgressionItems.ianite_gem = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("ianite_gem")));
					registry.register(ProgressionItems.tritanium_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("tritanium_ingot")));
					registry.register(ProgressionItems.ender_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("ender_ingot")));
					registry.register(ProgressionItems.bone_fragment = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("bone_fragment")));
					registry.register(ProgressionItems.dragon_scale = new Item(new Item.Properties().group(MoreProgression.ITEM).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("dragon_scale")));
					registry.register(ProgressionItems.enderanium_ingot = new Item(new Item.Properties().group(MoreProgression.ITEM).rarity(Rarity.UNCOMMON))
							.setRegistryName(MoreProgression.location("enderanium_ingot")));
					
					//Dust
					registry.register(ProgressionItems.coal_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("coal_dust")));
					registry.register(ProgressionItems.iron_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("iron_dust")));
					registry.register(ProgressionItems.gold_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("gold_dust")));
					registry.register(ProgressionItems.diamond_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("diamond_dust")));
					registry.register(ProgressionItems.emerald_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("emerald_dust")));
					registry.register(ProgressionItems.quartz_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("quartz_dust")));
					registry.register(ProgressionItems.ianite_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("ianite_dust")));
					registry.register(ProgressionItems.tritanium_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("tritanium_dust")));
					registry.register(ProgressionItems.ender_dust = new Item(new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("ender_dust")));
						
					//Foods
					registry.register(ProgressionItems.cherry = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build()))
							.setRegistryName(MoreProgression.location("cherry")));
					registry.register(ProgressionItems.cherry_pie = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(12).saturation(0.4F).build()))
							.setRegistryName(MoreProgression.location("cherry_pie")));
					registry.register(ProgressionItems.hamburger = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(10).saturation(0.8F).build()))
							.setRegistryName(MoreProgression.location("hamburger")));
					registry.register(ProgressionItems.corn = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.8F).build()))
							.setRegistryName(MoreProgression.location("corn")));
					registry.register(ProgressionItems.cooked_carrot = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build()))
							.setRegistryName(MoreProgression.location("cooked_carrot")));
					registry.register(ProgressionItems.peach = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(4).saturation(0.3F).build()))
							.setRegistryName(MoreProgression.location("peach")));
					registry.register(ProgressionItems.peach_pie = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(10).saturation(0.4F).build()))
							.setRegistryName(MoreProgression.location("peach_pie")));
					registry.register(ProgressionItems.raw_horse = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build()))
							.setRegistryName(MoreProgression.location("raw_horse")));
					registry.register(ProgressionItems.cooked_horse = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(8).saturation(0.8F).build()))
							.setRegistryName(MoreProgression.location("cooked_horse")));
					registry.register(ProgressionItems.raw_calamari = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build()))
							.setRegistryName(MoreProgression.location("raw_calamari")));
					registry.register(ProgressionItems.cooked_calamari = new Item(new Item.Properties().group(MoreProgression.ITEM).food(new Food.Builder().hunger(6).saturation(0.8F).build()))
							.setRegistryName(MoreProgression.location("cooked_calamari")));
					
					//Drinks
					registry.register(ProgressionItems.apple_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(5)))
							.setRegistryName(MoreProgression.location("apple_juice")));
					registry.register(ProgressionItems.cherry_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(6)))
							.setRegistryName(MoreProgression.location("cherry_juice")));
					registry.register(ProgressionItems.peach_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(5)))
							.setRegistryName(MoreProgression.location("peach_juice")));
					registry.register(ProgressionItems.carrot_juice = new CustomJuiceItem(new Item.Properties().group(MoreProgression.ITEM).food(CustomJuiceItem.buildJuice(6)))
							.setRegistryName(MoreProgression.location("carrot_juice")));
					
					//FoodSeeds
					registry.register(ProgressionItems.blue_berries = new BlockNamedItem(ProgressionBlocks.blueberry_bush, new Item.Properties().group(MoreProgression.ITEM)
							.food(new Food.Builder().hunger(3).saturation(0.2F).build())).setRegistryName(MoreProgression.location("blue_berries")));
					registry.register(ProgressionItems.cactus_berry = new BlockNamedItem(ProgressionBlocks.cactus_berry_bush, new Item.Properties().group(MoreProgression.ITEM)
							.food(new Food.Builder().hunger(2).saturation(0.2F).build())).setRegistryName(MoreProgression.location("cactus_berry")));
					
					//Seeds
					registry.register(ProgressionItems.corn_seeds = new BlockNamedItem(ProgressionBlocks.corn_crop, new Item.Properties().group(MoreProgression.ITEM))
							.setRegistryName(MoreProgression.location("corn_seeds")));
					
					//Tools
					registry.register(ProgressionItems.stick_and_stone = new CustomStickAndStone(new Item.Properties().group(MoreProgression.TOOL).maxDamage(1))
							.setRegistryName(MoreProgression.location("stick_and_stone")));
					
					if (ItemConfig.enableIaniteItems.get()) {
						//Ianite
					registry.register(ProgressionItems.ianite_sword = new SwordItem(ProgressionToolMaterials.Ianite, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_sword")));
					registry.register(ProgressionItems.ianite_pickaxe = new PickaxeItem(ProgressionToolMaterials.Ianite, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_pickaxe")));
					registry.register(ProgressionItems.ianite_axe = new AxeItem(ProgressionToolMaterials.Ianite, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_axe")));
					registry.register(ProgressionItems.ianite_shovel = new ShovelItem(ProgressionToolMaterials.Ianite, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_shovel")));
					registry.register(ProgressionItems.ianite_hoe = new HoeItem(ProgressionToolMaterials.Ianite, 1.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_hoe")));
					registry.register(ProgressionItems.ianite_paxel = new CustomPaxelItem(ProgressionToolMaterials.Ianite, -1, -2.6f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_paxel")));
					}
					
					if (ItemConfig.enableTritaniumItems.get()) {
						//Tritanium
					registry.register(ProgressionItems.tritanium_sword = new SwordItem(ProgressionToolMaterials.Tritanium, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_sword")));
					registry.register(ProgressionItems.tritanium_pickaxe = new PickaxeItem(ProgressionToolMaterials.Tritanium, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_pickaxe")));
					registry.register(ProgressionItems.tritanium_axe = new AxeItem(ProgressionToolMaterials.Tritanium, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_axe")));
					registry.register(ProgressionItems.tritanium_shovel = new ShovelItem(ProgressionToolMaterials.Tritanium, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_shovel")));
					registry.register(ProgressionItems.tritanium_hoe = new HoeItem(ProgressionToolMaterials.Tritanium, 1.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_hoe")));
					registry.register(ProgressionItems.tritanium_paxel = new CustomPaxelItem(ProgressionToolMaterials.Tritanium, -1, -2.6f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_paxel")));
					}
					
					if (ItemConfig.enableBoneItems.get()) {
						//Bone
					registry.register(ProgressionItems.bone_sword = new SwordItem(ProgressionToolMaterials.Bone, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_sword")));
					registry.register(ProgressionItems.bone_pickaxe = new PickaxeItem(ProgressionToolMaterials.Bone, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_pickaxe")));
					registry.register(ProgressionItems.bone_axe = new AxeItem(ProgressionToolMaterials.Bone, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_axe")));
					registry.register(ProgressionItems.bone_shovel = new ShovelItem(ProgressionToolMaterials.Bone, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_shovel")));
					registry.register(ProgressionItems.bone_hoe = new HoeItem(ProgressionToolMaterials.Bone, 1.0f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_hoe")));
					registry.register(ProgressionItems.bone_paxel = new CustomPaxelItem(ProgressionToolMaterials.Bone, -1, -2.6f, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_paxel")));
					}
					
					if (ItemConfig.enableStarItems.get()) {
						//Star
					registry.register(ProgressionItems.star_sword = new SwordItem(ProgressionToolMaterials.Star, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_sword")));
					registry.register(ProgressionItems.star_pickaxe = new PickaxeItem(ProgressionToolMaterials.Star, -20, -2.8f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_pickaxe")));
					registry.register(ProgressionItems.star_axe = new AxeItem(ProgressionToolMaterials.Star, 20, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_axe")));
					registry.register(ProgressionItems.star_shovel = new ShovelItem(ProgressionToolMaterials.Star, -10, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_shovel")));
					registry.register(ProgressionItems.star_hoe = new HoeItem(ProgressionToolMaterials.Star, 1.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_hoe")));
					registry.register(ProgressionItems.star_paxel = new CustomPaxelItem(ProgressionToolMaterials.Star, -10, -2.6f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("star_paxel")));
					}
					
					if (ItemConfig.enableEnderaniumItems.get()) {
						//Enderanium
					registry.register(ProgressionItems.enderanium_sword = new SwordItem(ProgressionToolMaterials.Enderanium, 0, -2.4f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_sword")));
					registry.register(ProgressionItems.enderanium_pickaxe = new PickaxeItem(ProgressionToolMaterials.Enderanium, -2, -2.8f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_pickaxe")));
					registry.register(ProgressionItems.enderanium_axe = new AxeItem(ProgressionToolMaterials.Enderanium, 2, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_axe")));
					registry.register(ProgressionItems.enderanium_shovel = new ShovelItem(ProgressionToolMaterials.Enderanium, -1, -3.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_shovel")));
					registry.register(ProgressionItems.enderanium_hoe = new HoeItem(ProgressionToolMaterials.Enderanium, 1.0f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_hoe")));
					registry.register(ProgressionItems.enderanium_paxel = new CustomPaxelItem(ProgressionToolMaterials.Enderanium, -1, -2.6f, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_paxel")));
					}
					
					if (ItemConfig.enablePaxels.get()) {
					//Paxels
					registry.register(ProgressionItems.wooden_paxel = new CustomPaxelItem(ItemTier.WOOD, 2, -2.6f, new Item.Properties().group(ItemGroup.TOOLS))
							.setRegistryName(MoreProgression.location("wooden_paxel")));
					registry.register(ProgressionItems.stone_paxel = new CustomPaxelItem(ItemTier.STONE, 2, -2.6f, new Item.Properties().group(ItemGroup.TOOLS))
							.setRegistryName(MoreProgression.location("stone_paxel")));
					registry.register(ProgressionItems.iron_paxel = new CustomPaxelItem(ItemTier.IRON, 2, -2.6f, new Item.Properties().group(ItemGroup.TOOLS))
							.setRegistryName(MoreProgression.location("iron_paxel")));
					registry.register(ProgressionItems.golden_paxel = new CustomPaxelItem(ItemTier.GOLD, 2, -2.6f, new Item.Properties().group(ItemGroup.TOOLS))
							.setRegistryName(MoreProgression.location("golden_paxel")));
					registry.register(ProgressionItems.diamond_paxel = new CustomPaxelItem(ItemTier.DIAMOND, 2, -2.6f, new Item.Properties().group(ItemGroup.TOOLS))
							.setRegistryName(MoreProgression.location("diamond_paxel")));
					}
					
					//Armor
					if (ItemConfig.enableIaniteItems.get()) {
						//Ianite
					registry.register(ProgressionItems.ianite_helmet = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_helmet")));
					registry.register(ProgressionItems.ianite_chestplate = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_chestplate")));
					registry.register(ProgressionItems.ianite_leggings = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_leggings")));
					registry.register(ProgressionItems.ianite_boots = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("ianite_boots")));
					}
					
					if (ItemConfig.enableTritaniumItems.get()) {
						//Tritanium
					registry.register(ProgressionItems.tritanium_helmet = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_helmet")));
					registry.register(ProgressionItems.tritanium_chestplate = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_chestplate")));
					registry.register(ProgressionItems.tritanium_leggings = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_leggings")));
					registry.register(ProgressionItems.tritanium_boots = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("tritanium_boots")));
					}
					
					if (ItemConfig.enableBoneItems.get()) {
						//Bone
					registry.register(ProgressionItems.bone_helmet = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_helmet")));
					registry.register(ProgressionItems.bone_chestplate = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_chestplate")));
					registry.register(ProgressionItems.bone_leggings = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_leggings")));
					registry.register(ProgressionItems.bone_boots = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL))
							.setRegistryName(MoreProgression.location("bone_boots")));
					}
					
					if (ItemConfig.enableDragonItems.get()) {
						//Dragon
					registry.register(ProgressionItems.dragon_helmet = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("dragon_helmet")));
					registry.register(ProgressionItems.dragon_chestplate = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("dragon_chestplate")));
					registry.register(ProgressionItems.dragon_leggings = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("dragon_leggings")));
					registry.register(ProgressionItems.dragon_boots = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.EPIC))
							.setRegistryName(MoreProgression.location("dragon_boots")));
					}
					
					if (ItemConfig.enableEnderaniumItems.get()) {
						//Enderanium
					registry.register(ProgressionItems.enderanium_helmet = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.HEAD, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_helmet")));
					registry.register(ProgressionItems.enderanium_chestplate = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.CHEST, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_chestplate")));
					registry.register(ProgressionItems.enderanium_leggings = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.LEGS, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_leggings")));
					registry.register(ProgressionItems.enderanium_boots = new ArmorItem(ProgressionArmorMaterials.Enderanium, EquipmentSlotType.FEET, new Item.Properties().group(MoreProgression.TOOL).rarity(Rarity.RARE))
							.setRegistryName(MoreProgression.location("enderanium_boots")));
					}
					
					
					//BlockItems
					registry.register(ProgressionItems.ianite_block = new BlockItem(ProgressionBlocks.ianite_block, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.ianite_block.getRegistryName()));
					registry.register(ProgressionItems.ianite_ore = new BlockItem(ProgressionBlocks.ianite_ore, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.ianite_ore.getRegistryName()));
					registry.register(ProgressionItems.tritanium_block = new BlockItem(ProgressionBlocks.tritanium_block, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.tritanium_block.getRegistryName()));
					registry.register(ProgressionItems.tritanium_ore = new BlockItem(ProgressionBlocks.tritanium_ore, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.tritanium_ore.getRegistryName()));
					registry.register(ProgressionItems.ender_block = new BlockItem(ProgressionBlocks.ender_block, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.ender_block.getRegistryName()));
					registry.register(ProgressionItems.ender_ore = new BlockItem(ProgressionBlocks.ender_ore, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.ender_ore.getRegistryName()));
					registry.register(ProgressionItems.enderanium_block = new BlockItem(ProgressionBlocks.enderanium_block, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.enderanium_block.getRegistryName()));
					registry.register(ProgressionItems.flint_block = new BlockItem(ProgressionBlocks.flint_block, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.flint_block.getRegistryName()));
					registry.register(ProgressionItems.marble = new BlockItem(ProgressionBlocks.marble, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble.getRegistryName()));
					registry.register(ProgressionItems.marble_bricks = new BlockItem(ProgressionBlocks.marble_bricks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_bricks.getRegistryName()));
					registry.register(ProgressionItems.limestone = new BlockItem(ProgressionBlocks.limestone, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone.getRegistryName()));
					registry.register(ProgressionItems.limestone_bricks = new BlockItem(ProgressionBlocks.limestone_bricks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_bricks.getRegistryName()));
					registry.register(ProgressionItems.basalt = new BlockItem(ProgressionBlocks.basalt, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt.getRegistryName()));
					registry.register(ProgressionItems.basalt_bricks = new BlockItem(ProgressionBlocks.basalt_bricks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_bricks.getRegistryName()));
					registry.register(ProgressionItems.fossil_ore = new BlockItem(ProgressionBlocks.fossil_ore, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.fossil_ore.getRegistryName()));
					registry.register(ProgressionItems.corrupted_ore = new BlockItem(ProgressionBlocks.corrupted_ore, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.corrupted_ore.getRegistryName()));
					registry.register(ProgressionItems.dust = new BlockItem(ProgressionBlocks.dust, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.dust.getRegistryName()));
					
					//Wood
					
					if (BlockConfig.enableCherryWoodType.get()) {
						//Cherry
					registry.register(ProgressionItems.cherry_log = new BlockItem(ProgressionBlocks.cherry_log, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_log.getRegistryName()));
					registry.register(ProgressionItems.cherry_leaves = new BlockItem(ProgressionBlocks.cherry_leaves, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_leaves.getRegistryName()));
					registry.register(ProgressionItems.cherry_planks = new BlockItem(ProgressionBlocks.cherry_planks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_planks.getRegistryName()));
					registry.register(ProgressionItems.cherry_slab = new BlockItem(ProgressionBlocks.cherry_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_slab.getRegistryName()));
					registry.register(ProgressionItems.cherry_stairs = new BlockItem(ProgressionBlocks.cherry_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_stairs.getRegistryName()));
					registry.register(ProgressionItems.cherry_door = new TallBlockItem(ProgressionBlocks.cherry_door, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_door.getRegistryName()));
					registry.register(ProgressionItems.cherry_trapdoor = new BlockItem(ProgressionBlocks.cherry_trapdoor, new Item.Properties().group(MoreProgression.BLOCK))
				    		.setRegistryName(ProgressionBlocks.cherry_trapdoor.getRegistryName()));
					registry.register(ProgressionItems.cherry_fence = new BlockItem(ProgressionBlocks.cherry_fence, new Item.Properties().group(MoreProgression.BLOCK))
				    		.setRegistryName(ProgressionBlocks.cherry_fence.getRegistryName()));
					registry.register(ProgressionItems.cherry_fencegate = new BlockItem(ProgressionBlocks.cherry_fencegate, new Item.Properties().group(MoreProgression.BLOCK))
				    		.setRegistryName(ProgressionBlocks.cherry_fencegate.getRegistryName()));
					registry.register(ProgressionItems.cherry_pressure_plate = new BlockItem(ProgressionBlocks.cherry_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK))
				    		.setRegistryName(ProgressionBlocks.cherry_pressure_plate.getRegistryName()));
					registry.register(ProgressionItems.cherry_button = new BlockItem(ProgressionBlocks.cherry_button, new Item.Properties().group(MoreProgression.BLOCK))
				    		.setRegistryName(ProgressionBlocks.cherry_button.getRegistryName()));
					}
					
					if (BlockConfig.enableSilverwoodWoodType.get()) {
				    	//Silverwood
					registry.register(ProgressionItems.silverwood_log = new BlockItem(ProgressionBlocks.silverwood_log, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_log.getRegistryName()));
					registry.register(ProgressionItems.silverwood_leaves = new BlockItem(ProgressionBlocks.silverwood_leaves, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_leaves.getRegistryName()));
					registry.register(ProgressionItems.silverwood_planks = new BlockItem(ProgressionBlocks.silverwood_planks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_planks.getRegistryName()));
					registry.register(ProgressionItems.silverwood_slab = new BlockItem(ProgressionBlocks.silverwood_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_slab.getRegistryName()));
					registry.register(ProgressionItems.silverwood_stairs = new BlockItem(ProgressionBlocks.silverwood_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_stairs.getRegistryName()));
					registry.register(ProgressionItems.silverwood_door = new TallBlockItem(ProgressionBlocks.silverwood_door, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_door.getRegistryName()));
					registry.register(ProgressionItems.silverwood_trapdoor = new BlockItem(ProgressionBlocks.silverwood_trapdoor, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_trapdoor.getRegistryName()));
					registry.register(ProgressionItems.silverwood_fence = new BlockItem(ProgressionBlocks.silverwood_fence, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_fence.getRegistryName()));
					registry.register(ProgressionItems.silverwood_fencegate = new BlockItem(ProgressionBlocks.silverwood_fencegate, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_fencegate.getRegistryName()));
					registry.register(ProgressionItems.silverwood_pressure_plate = new BlockItem(ProgressionBlocks.silverwood_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_pressure_plate.getRegistryName()));
					registry.register(ProgressionItems.silverwood_button = new BlockItem(ProgressionBlocks.silverwood_button, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_button.getRegistryName()));
					}
				    
					if (BlockConfig.enableRedwoodWoodType.get()) {
						//Redwood
					registry.register(ProgressionItems.redwood_log= new BlockItem(ProgressionBlocks.redwood_log, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_log.getRegistryName()));
					registry.register(ProgressionItems.redwood_leaves = new BlockItem(ProgressionBlocks.redwood_leaves, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_leaves.getRegistryName()));
					registry.register(ProgressionItems.redwood_planks = new BlockItem(ProgressionBlocks.redwood_planks, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_planks.getRegistryName()));
					registry.register(ProgressionItems.redwood_slab = new BlockItem(ProgressionBlocks.redwood_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_slab.getRegistryName()));
					registry.register(ProgressionItems.redwood_stairs = new BlockItem(ProgressionBlocks.redwood_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_stairs.getRegistryName()));
					registry.register(ProgressionItems.redwood_door = new TallBlockItem(ProgressionBlocks.redwood_door, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_door.getRegistryName()));
					registry.register(ProgressionItems.redwood_trapdoor = new BlockItem(ProgressionBlocks.redwood_trapdoor, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_trapdoor.getRegistryName()));
					registry.register(ProgressionItems.redwood_fence = new BlockItem(ProgressionBlocks.redwood_fence, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_fence.getRegistryName()));
					registry.register(ProgressionItems.redwood_fencegate = new BlockItem(ProgressionBlocks.redwood_fencegate, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_fencegate.getRegistryName()));
					registry.register(ProgressionItems.redwood_pressure_plate = new BlockItem(ProgressionBlocks.redwood_pressure_plate, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_pressure_plate.getRegistryName()));
					registry.register(ProgressionItems.redwood_button = new BlockItem(ProgressionBlocks.redwood_button, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_button.getRegistryName()));
					}
					
					if (BlockConfig.enableRockBlockVariants.get()) {
				    //Rock
					registry.register(ProgressionItems.marble_slab = new BlockItem(ProgressionBlocks.marble_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_slab.getRegistryName()));
					registry.register(ProgressionItems.marble_stairs = new BlockItem(ProgressionBlocks.marble_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_stairs.getRegistryName()));
					registry.register(ProgressionItems.limestone_slab = new BlockItem(ProgressionBlocks.limestone_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_slab.getRegistryName()));
					registry.register(ProgressionItems.limestone_stairs = new BlockItem(ProgressionBlocks.limestone_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_stairs.getRegistryName()));
					registry.register(ProgressionItems.basalt_slab = new BlockItem(ProgressionBlocks.basalt_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_slab.getRegistryName()));
					registry.register(ProgressionItems.basalt_stairs = new BlockItem(ProgressionBlocks.basalt_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_stairs.getRegistryName()));
					registry.register(ProgressionItems.marble_brick_slab = new BlockItem(ProgressionBlocks.marble_brick_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_brick_slab.getRegistryName()));
					registry.register(ProgressionItems.marble_brick_stairs = new BlockItem(ProgressionBlocks.marble_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_brick_stairs.getRegistryName()));
					registry.register(ProgressionItems.limestone_brick_slab = new BlockItem(ProgressionBlocks.limestone_brick_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_brick_slab.getRegistryName()));
					registry.register(ProgressionItems.limestone_brick_stairs = new BlockItem(ProgressionBlocks.limestone_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_brick_stairs.getRegistryName()));
					registry.register(ProgressionItems.basalt_brick_slab = new BlockItem(ProgressionBlocks.basalt_brick_slab, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_brick_slab.getRegistryName()));
					registry.register(ProgressionItems.basalt_brick_stairs = new BlockItem(ProgressionBlocks.basalt_brick_stairs, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_brick_stairs.getRegistryName()));
					registry.register(ProgressionItems.marble_wall = new BlockItem(ProgressionBlocks.marble_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_wall.getRegistryName()));
					registry.register(ProgressionItems.marble_brick_wall = new BlockItem(ProgressionBlocks.marble_brick_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.marble_brick_wall.getRegistryName()));
					registry.register(ProgressionItems.limestone_wall = new BlockItem(ProgressionBlocks.limestone_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_wall.getRegistryName()));
					registry.register(ProgressionItems.limestone_brick_wall = new BlockItem(ProgressionBlocks.limestone_brick_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.limestone_brick_wall.getRegistryName()));
					registry.register(ProgressionItems.basalt_wall = new BlockItem(ProgressionBlocks.basalt_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_wall.getRegistryName()));
					registry.register(ProgressionItems.basalt_brick_wall = new BlockItem(ProgressionBlocks.basalt_brick_wall, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.basalt_brick_wall.getRegistryName()));
					}
					
				    //PlantItems
					if (BlockConfig.enableCherryWoodType.get()) {
					registry.register(ProgressionItems.cherry_sapling = new BlockItem(ProgressionBlocks.cherry_sapling, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.cherry_sapling.getRegistryName()));
					}
					
					if (BlockConfig.enableSilverwoodWoodType.get()) {
					registry.register(ProgressionItems.silverwood_sapling = new BlockItem(ProgressionBlocks.silverwood_sapling, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.silverwood_sapling.getRegistryName()));
					}
					
					if (BlockConfig.enableRedwoodWoodType.get()) {
					registry.register(ProgressionItems.redwood_sapling = new BlockItem(ProgressionBlocks.redwood_sapling, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.redwood_sapling.getRegistryName()));
					}
					
					registry.register(ProgressionItems.corrupted_flower = new BlockItem(ProgressionBlocks.corrupted_flower, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.corrupted_flower.getRegistryName()));
					registry.register(ProgressionItems.terracotta_grass = new BlockItem(ProgressionBlocks.terracotta_grass, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.terracotta_grass.getRegistryName()));
					registry.register(ProgressionItems.field_grass = new BlockItem(ProgressionBlocks.field_grass, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.field_grass.getRegistryName()));
					registry.register(ProgressionItems.corn_grass = new BlockItem(ProgressionBlocks.corn_grass, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.corn_grass.getRegistryName()));
					
					//Tile Entities
						//Machines
					if (BlockConfig.enableCrusher.get()) {
					registry.register(ProgressionItems.crusher = new BlockItem(ProgressionBlocks.crusher, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.crusher.getRegistryName()));
					}
					
					if (BlockConfig.enableEnderInfuser.get()) {
					registry.register(ProgressionItems.ender_infuser = new BlockItem(ProgressionBlocks.ender_infuser, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.ender_infuser.getRegistryName()));
					}
						//Storage
					registry.register(ProgressionItems.reinforced_barrel = new BlockItem(ProgressionBlocks.reinforced_barrel, new Item.Properties().group(MoreProgression.BLOCK))
							.setRegistryName(ProgressionBlocks.reinforced_barrel.getRegistryName()));
			
			MoreProgression.LOGGER.info("Items registered");
		}
	}	
}

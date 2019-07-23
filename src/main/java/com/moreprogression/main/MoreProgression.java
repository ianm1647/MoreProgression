package com.moreprogression.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.block.custom.BlueberryBushBlock;
import com.moreprogression.main.block.custom.CherrySaplingBlock;
import com.moreprogression.main.block.custom.CornCropBlock;
import com.moreprogression.main.block.custom.CrusherBlock;
import com.moreprogression.main.block.custom.CustomButtonBlock;
import com.moreprogression.main.block.custom.CustomDoorBlock;
import com.moreprogression.main.block.custom.CustomOreBlock;
import com.moreprogression.main.block.custom.CustomPressurePlateBlock;
import com.moreprogression.main.block.custom.CustomStairsBlock;
import com.moreprogression.main.block.custom.CustomTrapDoorBlock;
import com.moreprogression.main.block.custom.TerracottaGrassBlock;
import com.moreprogression.main.config.ProgressionConfig;
import com.moreprogression.main.item.ProgressionArmorMaterials;
import com.moreprogression.main.item.ProgressionItems;
import com.moreprogression.main.item.ProgressionToolMaterials;
import com.moreprogression.main.item.custom.CustomJuiceItem;
import com.moreprogression.main.item.group.ProgressionCreativeBlock;
import com.moreprogression.main.item.group.ProgressionCreativeItem;
import com.moreprogression.main.item.group.ProgressionCreativeTool;
import com.moreprogression.main.tileentity.container.ProgressionContainerTypes;
import com.moreprogression.main.tileentity.gui.CrusherScreen;
import com.moreprogression.main.world.Generation;
import com.moreprogression.main.world.biome.CherryForestBiome;
import com.moreprogression.main.world.biome.CorruptedForestBiome;
import com.moreprogression.main.world.biome.DustWastelandBiome;
import com.moreprogression.main.world.biome.ProgressionBiomes;
import com.moreprogression.main.world.biome.TerracottaPlainsBiome;
import com.moreprogression.main.world.feature.tree.CherryTree;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TallBlockItem;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("moreprogression")
public class MoreProgression {
	public static MoreProgression INSTANCE;
	public static final String MODID = "moreprogression";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup BLOCK = new ProgressionCreativeBlock();
	public static final ItemGroup ITEM = new ProgressionCreativeItem();
	public static final ItemGroup TOOL = new ProgressionCreativeTool();		
	public MoreProgression() {
		INSTANCE = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		ProgressionConfig.loadConfig(ProgressionConfig.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("progression.toml"));
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		Generation.genLoad();
		LOGGER.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ProgressionContainerTypes.CRUSHER, CrusherScreen::new);
		LOGGER.info("Client registries method registered");
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(MODID, name);
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class registryEvents {
		
		//Items
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					//Items
					ProgressionItems.ianite_gem = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("ianite_gem")),
					ProgressionItems.tritanium_ingot = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("tritanium_ingot")),
					ProgressionItems.ender_ingot = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("ender_ingot")),
					ProgressionItems.bone_fragment = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("bone_fragment")),
					ProgressionItems.dragon_scale = new Item(new Item.Properties().group(ITEM).rarity(Rarity.RARE)).setRegistryName(location("dragon_scale")),
					
					//Dust
					ProgressionItems.coal_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("coal_dust")),
					ProgressionItems.iron_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("iron_dust")),
					ProgressionItems.gold_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("gold_dust")),
					ProgressionItems.diamond_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("diamond_dust")),
					ProgressionItems.emerald_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("emerald_dust")),
					ProgressionItems.quartz_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("quartz_dust")),
					ProgressionItems.ianite_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("ianite_dust")),
					ProgressionItems.tritanium_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("tritanium_dust")),
					ProgressionItems.ender_dust = new Item(new Item.Properties().group(ITEM)).setRegistryName(location("ender_dust")),
					
					//Foods
					ProgressionItems.cherry = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build())).setRegistryName(location("cherry")),
					ProgressionItems.cherry_pie = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(12).saturation(0.4F).build())).setRegistryName(location("cherry_pie")),
					ProgressionItems.hamburger = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(10).saturation(0.8F).build())).setRegistryName(location("hamburger")),
					ProgressionItems.corn = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(3).saturation(0.8F).build())).setRegistryName(location("corn")),
					ProgressionItems.cooked_carrot = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(5).saturation(0.4F).build())).setRegistryName(location("cooked_carrot")),
					ProgressionItems.peach = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(4).saturation(0.3F).build())).setRegistryName(location("peach")),
					ProgressionItems.peach_pie = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(10).saturation(0.4F).build())).setRegistryName(location("peach_pie")),
					ProgressionItems.raw_horse = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build())).setRegistryName(location("raw_horse")),
					ProgressionItems.cooked_horse = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(8).saturation(0.8F).build())).setRegistryName(location("cooked_horse")),
					ProgressionItems.raw_calamari = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build())).setRegistryName(location("raw_calamari")),
					ProgressionItems.cooked_calamari = new Item(new Item.Properties().group(ITEM).food(new Food.Builder().hunger(6).saturation(0.8F).build())).setRegistryName(location("cooked_calamari")),
					
					//Drinks
					ProgressionItems.apple_juice = new CustomJuiceItem(new Item.Properties().group(ITEM)).setRegistryName(location("apple_juice")),
					ProgressionItems.cherry_juice = new CustomJuiceItem(new Item.Properties().group(ITEM)).setRegistryName(location("cherry_juice")),
					ProgressionItems.peach_juice = new CustomJuiceItem(new Item.Properties().group(ITEM)).setRegistryName(location("peach_juice")),
					ProgressionItems.carrot_juice = new CustomJuiceItem(new Item.Properties().group(ITEM)).setRegistryName(location("carrot_juice")),
					
					//FoodSeeds
					ProgressionItems.blue_berries = new BlockNamedItem(ProgressionBlocks.blueberry_bush, new Item.Properties().group(ITEM).food(new Food.Builder().hunger(3).saturation(0.2F).build()))
						.setRegistryName(location("blue_berries")),
					
					//Seeds
					ProgressionItems.corn_seeds = new BlockNamedItem(ProgressionBlocks.corn_crop, new Item.Properties().group(ITEM)).setRegistryName(location("corn_seeds")),
					
					//Tools
					ProgressionItems.ianite_sword = new SwordItem(ProgressionToolMaterials.Ianite, 0, -2.4f, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_sword")),
					ProgressionItems.ianite_pickaxe = new PickaxeItem(ProgressionToolMaterials.Ianite, -2, -2.8f, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_pickaxe")),
					ProgressionItems.ianite_axe = new AxeItem(ProgressionToolMaterials.Ianite, 2, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_axe")),
					ProgressionItems.ianite_shovel = new ShovelItem(ProgressionToolMaterials.Ianite, -1, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_shovel")),
					ProgressionItems.ianite_hoe = new HoeItem(ProgressionToolMaterials.Ianite, 1.0f, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_hoe")),
					ProgressionItems.tritanium_sword = new SwordItem(ProgressionToolMaterials.Tritanium, 0, -2.4f, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_sword")),
					ProgressionItems.tritanium_pickaxe = new PickaxeItem(ProgressionToolMaterials.Tritanium, -2, -2.8f, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_pickaxe")),
					ProgressionItems.tritanium_axe = new AxeItem(ProgressionToolMaterials.Tritanium, 2, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_axe")),
					ProgressionItems.tritanium_shovel = new ShovelItem(ProgressionToolMaterials.Tritanium, -1, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_shovel")),
					ProgressionItems.tritanium_hoe = new HoeItem(ProgressionToolMaterials.Tritanium, 1.0f, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_hoe")),
					ProgressionItems.bone_sword = new SwordItem(ProgressionToolMaterials.Bone, 0, -2.4f, new Item.Properties().group(TOOL)).setRegistryName(location("bone_sword")),
					ProgressionItems.bone_pickaxe = new PickaxeItem(ProgressionToolMaterials.Bone, -2, -2.8f, new Item.Properties().group(TOOL)).setRegistryName(location("bone_pickaxe")),
					ProgressionItems.bone_axe = new AxeItem(ProgressionToolMaterials.Bone, 2, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("bone_axe")),
					ProgressionItems.bone_shovel = new ShovelItem(ProgressionToolMaterials.Bone, -1, -3.0f, new Item.Properties().group(TOOL)).setRegistryName(location("bone_shovel")),
					ProgressionItems.bone_hoe = new HoeItem(ProgressionToolMaterials.Bone, 1.0f, new Item.Properties().group(TOOL)).setRegistryName(location("bone_hoe")),
					ProgressionItems.star_sword = new SwordItem(ProgressionToolMaterials.Star, 0, -2.4f, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("star_sword")),
					ProgressionItems.star_pickaxe = new PickaxeItem(ProgressionToolMaterials.Star, -20, -2.8f, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("star_pickaxe")),
					ProgressionItems.star_axe = new AxeItem(ProgressionToolMaterials.Star, 20, -3.0f, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("star_axe")),
					ProgressionItems.star_shovel = new ShovelItem(ProgressionToolMaterials.Star, -10, -3.0f, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("star_shovel")),
					ProgressionItems.star_hoe = new HoeItem(ProgressionToolMaterials.Star, 1.0f, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("star_hoe")),
					
					//Armor
					ProgressionItems.ianite_helmet = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.HEAD, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_helmet")),
					ProgressionItems.ianite_chestplate = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.CHEST, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_chestplate")),
					ProgressionItems.ianite_leggings = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.LEGS, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_leggings")),
					ProgressionItems.ianite_boots = new ArmorItem(ProgressionArmorMaterials.Ianite, EquipmentSlotType.FEET, new Item.Properties().group(TOOL)).setRegistryName(location("ianite_boots")),
					ProgressionItems.tritanium_helmet = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.HEAD, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_helmet")),
					ProgressionItems.tritanium_chestplate = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.CHEST, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_chestplate")),
					ProgressionItems.tritanium_leggings = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.LEGS, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_leggings")),
					ProgressionItems.tritanium_boots = new ArmorItem(ProgressionArmorMaterials.Tritanium, EquipmentSlotType.FEET, new Item.Properties().group(TOOL)).setRegistryName(location("tritanium_boots")),
					ProgressionItems.bone_helmet = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.HEAD, new Item.Properties().group(TOOL)).setRegistryName(location("bone_helmet")),
					ProgressionItems.bone_chestplate = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.CHEST, new Item.Properties().group(TOOL)).setRegistryName(location("bone_chestplate")),
					ProgressionItems.bone_leggings = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.LEGS, new Item.Properties().group(TOOL)).setRegistryName(location("bone_leggings")),
					ProgressionItems.bone_boots = new ArmorItem(ProgressionArmorMaterials.Bone, EquipmentSlotType.FEET, new Item.Properties().group(TOOL)).setRegistryName(location("bone_boots")),
					ProgressionItems.dragon_helmet = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.HEAD, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("dragon_helmet")),
					ProgressionItems.dragon_chestplate = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.CHEST, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("dragon_chestplate")),
					ProgressionItems.dragon_leggings = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.LEGS, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("dragon_leggings")),
					ProgressionItems.dragon_boots = new ArmorItem(ProgressionArmorMaterials.Dragon, EquipmentSlotType.FEET, new Item.Properties().group(TOOL).rarity(Rarity.EPIC)).setRegistryName(location("dragon_boots")),
							
					
					//BlockItems
					ProgressionItems.ianite_block = new BlockItem(ProgressionBlocks.ianite_block, new Item.Properties().group(BLOCK)	).setRegistryName(ProgressionBlocks.ianite_block.getRegistryName()),
					ProgressionItems.ianite_ore = new BlockItem(ProgressionBlocks.ianite_ore, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.ianite_ore.getRegistryName()),
					ProgressionItems.tritanium_block = new BlockItem(ProgressionBlocks.tritanium_block, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.tritanium_block.getRegistryName()),
					ProgressionItems.tritanium_ore = new BlockItem(ProgressionBlocks.tritanium_ore, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.tritanium_ore.getRegistryName()),
					ProgressionItems.ender_block = new BlockItem(ProgressionBlocks.ender_block, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.ender_block.getRegistryName()),
					ProgressionItems.ender_ore = new BlockItem(ProgressionBlocks.ender_ore, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.ender_ore.getRegistryName()),
					ProgressionItems.flint_block = new BlockItem(ProgressionBlocks.flint_block, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.flint_block.getRegistryName()),
					ProgressionItems.marble = new BlockItem(ProgressionBlocks.marble, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble.getRegistryName()),
					ProgressionItems.marble_bricks = new BlockItem(ProgressionBlocks.marble_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_bricks.getRegistryName()),
					ProgressionItems.limestone = new BlockItem(ProgressionBlocks.limestone, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone.getRegistryName()),
					ProgressionItems.limestone_bricks = new BlockItem(ProgressionBlocks.limestone_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_bricks.getRegistryName()),
					ProgressionItems.basalt = new BlockItem(ProgressionBlocks.basalt, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt.getRegistryName()),
					ProgressionItems.basalt_bricks = new BlockItem(ProgressionBlocks.basalt_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_bricks.getRegistryName()),
					ProgressionItems.cherry_leaves = new BlockItem(ProgressionBlocks.cherry_leaves, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_leaves.getRegistryName()),
					ProgressionItems.fossil_ore = new BlockItem(ProgressionBlocks.fossil_ore, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.fossil_ore.getRegistryName()),
					ProgressionItems.corrupted_ore = new BlockItem(ProgressionBlocks.corrupted_ore, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.corrupted_ore.getRegistryName()),
					ProgressionItems.dust = new BlockItem(ProgressionBlocks.dust, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.dust.getRegistryName()),
					
					//Wood
					ProgressionItems.cherry_log = new BlockItem(ProgressionBlocks.cherry_log, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_log.getRegistryName()),
					ProgressionItems.cherry_planks = new BlockItem(ProgressionBlocks.cherry_planks, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_planks.getRegistryName()),
					ProgressionItems.cherry_slab = new BlockItem(ProgressionBlocks.cherry_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_slab.getRegistryName()),
					ProgressionItems.cherry_stairs = new BlockItem(ProgressionBlocks.cherry_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_stairs.getRegistryName()),
					ProgressionItems.cherry_door = new TallBlockItem(ProgressionBlocks.cherry_door, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_door.getRegistryName()),
				    ProgressionItems.cherry_trapdoor = new BlockItem(ProgressionBlocks.cherry_trapdoor, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_trapdoor.getRegistryName()),
				    ProgressionItems.cherry_fence = new BlockItem(ProgressionBlocks.cherry_fence, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_fence.getRegistryName()),
				    ProgressionItems.cherry_fencegate = new BlockItem(ProgressionBlocks.cherry_fencegate, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_fencegate.getRegistryName()),
				    ProgressionItems.cherry_pressure_plate = new BlockItem(ProgressionBlocks.cherry_pressure_plate, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_pressure_plate.getRegistryName()),
				    ProgressionItems.cherry_button = new BlockItem(ProgressionBlocks.cherry_button, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_button.getRegistryName()),
				    
				    //Rock
					ProgressionItems.marble_slab = new BlockItem(ProgressionBlocks.marble_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_slab.getRegistryName()),
					ProgressionItems.marble_stairs = new BlockItem(ProgressionBlocks.marble_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_stairs.getRegistryName()),
					ProgressionItems.limestone_slab = new BlockItem(ProgressionBlocks.limestone_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_slab.getRegistryName()),
					ProgressionItems.limestone_stairs = new BlockItem(ProgressionBlocks.limestone_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_stairs.getRegistryName()),
					ProgressionItems.basalt_slab = new BlockItem(ProgressionBlocks.basalt_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_slab.getRegistryName()),
					ProgressionItems.basalt_stairs = new BlockItem(ProgressionBlocks.basalt_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_stairs.getRegistryName()),
					ProgressionItems.marble_brick_slab = new BlockItem(ProgressionBlocks.marble_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_slab.getRegistryName()),
					ProgressionItems.marble_brick_stairs = new BlockItem(ProgressionBlocks.marble_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_stairs.getRegistryName()),
					ProgressionItems.limestone_brick_slab = new BlockItem(ProgressionBlocks.limestone_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_slab.getRegistryName()),
					ProgressionItems.limestone_brick_stairs = new BlockItem(ProgressionBlocks.limestone_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_stairs.getRegistryName()),
					ProgressionItems.basalt_brick_slab = new BlockItem(ProgressionBlocks.basalt_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_slab.getRegistryName()),
					ProgressionItems.basalt_brick_stairs = new BlockItem(ProgressionBlocks.basalt_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_stairs.getRegistryName()),
					ProgressionItems.marble_wall = new BlockItem(ProgressionBlocks.marble_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_wall.getRegistryName()),
					ProgressionItems.marble_brick_wall = new BlockItem(ProgressionBlocks.marble_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.marble_brick_wall.getRegistryName()),
					ProgressionItems.limestone_wall = new BlockItem(ProgressionBlocks.limestone_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_wall.getRegistryName()),
					ProgressionItems.limestone_brick_wall = new BlockItem(ProgressionBlocks.limestone_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.limestone_brick_wall.getRegistryName()),
					ProgressionItems.basalt_wall = new BlockItem(ProgressionBlocks.basalt_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_wall.getRegistryName()),
					ProgressionItems.basalt_brick_wall = new BlockItem(ProgressionBlocks.basalt_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.basalt_brick_wall.getRegistryName()),
					
				    //PlantItems
					ProgressionItems.cherry_sapling = new BlockItem(ProgressionBlocks.cherry_sapling, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.cherry_sapling.getRegistryName()),
					ProgressionItems.corrupted_flower = new BlockItem(ProgressionBlocks.corrupted_flower, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.corrupted_flower.getRegistryName()),
					ProgressionItems.terracotta_grass = new BlockItem(ProgressionBlocks.terracotta_grass, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.terracotta_grass.getRegistryName()),
					
					//Tile Entities
						//Machines
					ProgressionItems.crusher = new BlockItem(ProgressionBlocks.crusher, new Item.Properties().group(BLOCK)).setRegistryName(ProgressionBlocks.crusher.getRegistryName())
					
			);
			
			LOGGER.info("Items registered");
		}
		
		//Blocks
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			event.getRegistry().registerAll(
					//Blocks
					ProgressionBlocks.ianite_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(location("ianite_block")),         
					ProgressionBlocks.ianite_ore = new CustomOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 3.0f).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("ianite_ore")),
					ProgressionBlocks.tritanium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(location("tritanium_block")),         
					ProgressionBlocks.tritanium_ore = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 4.0f).harvestLevel(4).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("tritanium_ore")),
					ProgressionBlocks.ender_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(location("ender_block")),         
					ProgressionBlocks.ender_ore = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 4.0f).harvestLevel(5).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("ender_ore")),
					ProgressionBlocks.flint_block = new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0f).harvestLevel(0).sound(SoundType.BAMBOO)).setRegistryName(location("flint_block")),
					ProgressionBlocks.marble = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("marble")),
					ProgressionBlocks.marble_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("marble_bricks")),
					ProgressionBlocks.limestone = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("limestone")),
					ProgressionBlocks.limestone_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("limestone_bricks")),
					ProgressionBlocks.basalt = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("basalt")),
					ProgressionBlocks.basalt_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("basalt_bricks")),
					ProgressionBlocks.fossil_ore = new CustomOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("fossil_ore")),
					ProgressionBlocks.corrupted_ore = new RedstoneOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("corrupted_ore")),
					ProgressionBlocks.dust = new SandBlock(14406560, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)).setRegistryName(location("dust")),
					
					//Wood
					ProgressionBlocks.cherry_log = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)).setRegistryName(location("cherry_log")),
					ProgressionBlocks.cherry_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)).setRegistryName(location("cherry_planks")),
					ProgressionBlocks.cherry_slab = new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_slab")),
					ProgressionBlocks.cherry_stairs = new CustomStairsBlock(ProgressionBlocks.cherry_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F)).setRegistryName(location("cherry_stairs")),
					ProgressionBlocks.cherry_door = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_door")),
					ProgressionBlocks.cherry_trapdoor = new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_trapdoor")),
					ProgressionBlocks.cherry_fence = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_fence")),
					ProgressionBlocks.cherry_fencegate = new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_fencegate")),
					ProgressionBlocks.cherry_pressure_plate = new CustomPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(location("cherry_pressure_plate")),
					ProgressionBlocks.cherry_button = new CustomButtonBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(location("cherry_button")),
					ProgressionBlocks.cherry_leaves = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).sound(SoundType.PLANT)).setRegistryName(location("cherry_leaves")),
					
					//Rock
					ProgressionBlocks.marble_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_slab")),
					ProgressionBlocks.marble_stairs = new CustomStairsBlock(ProgressionBlocks.marble.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_stairs")),
					ProgressionBlocks.limestone_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_slab")),
					ProgressionBlocks.limestone_stairs = new CustomStairsBlock(ProgressionBlocks.limestone.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_stairs")),
					ProgressionBlocks.basalt_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_slab")),
					ProgressionBlocks.basalt_stairs = new CustomStairsBlock(ProgressionBlocks.basalt.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_stairs")),
					ProgressionBlocks.marble_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_brick_slab")),
					ProgressionBlocks.marble_brick_stairs = new CustomStairsBlock(ProgressionBlocks.marble_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_brick_stairs")),
					ProgressionBlocks.limestone_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_brick_slab")),
					ProgressionBlocks.limestone_brick_stairs = new CustomStairsBlock(ProgressionBlocks.limestone_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_brick_stairs")),
					ProgressionBlocks.basalt_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_brick_slab")),
					ProgressionBlocks.basalt_brick_stairs = new CustomStairsBlock(ProgressionBlocks.basalt_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_brick_stairs")),
					ProgressionBlocks.marble_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_wall")),
					ProgressionBlocks.limestone_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_wall")),
					ProgressionBlocks.basalt_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_wall")),
					ProgressionBlocks.marble_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("marble_brick_wall")),
					ProgressionBlocks.limestone_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("limestone_brick_wall")),
					ProgressionBlocks.basalt_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("basalt_brick_wall")),
					
					//Plants
					ProgressionBlocks.blueberry_bush = new BlueberryBushBlock().setRegistryName(location("blueberry_bush")),
					ProgressionBlocks.corn_crop = new CornCropBlock().setRegistryName(location("corn_crop")),
					ProgressionBlocks.cherry_sapling = new CherrySaplingBlock(new CherryTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)).setRegistryName(location("cherry_sapling")),
					ProgressionBlocks.corrupted_flower = new FlowerBlock(Effects.INSTANT_DAMAGE, 3, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(location("corrupted_flower")),
					ProgressionBlocks.terracotta_grass = new TerracottaGrassBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0F).sound(SoundType.PLANT)).setRegistryName(location("terracotta_grass")),
					
					//Tile Entities
						//Machines
					ProgressionBlocks.crusher = new CrusherBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("crusher"))
					
			);
			
			LOGGER.info("Blocks registered");
			
		}
		
		@SubscribeEvent
		public static void registerBiomes(RegistryEvent.Register<Biome> event)
		{
			if(ProgressionBiomes.biomeRegistry == null)
				ProgressionBiomes.biomeRegistry = event.getRegistry();

			ProgressionBiomes.registerBiome(new CherryForestBiome(), "Cherry Forest", 10, true, BiomeManager.BiomeType.WARM, Type.FOREST);
			ProgressionBiomes.registerBiome(new CorruptedForestBiome(), "Corrupted Forest", 10, true, BiomeManager.BiomeType.COOL, Type.FOREST);
			ProgressionBiomes.registerBiome(new TerracottaPlainsBiome(), "Terracotta Plains", 10, true, BiomeManager.BiomeType.WARM, Type.PLAINS);
			ProgressionBiomes.registerBiome(new DustWastelandBiome(), "Dust Wasteland", 10, true, BiomeManager.BiomeType.DESERT, Type.DRY);
			
			LOGGER.debug("Biomes registered");

		}
	}
}


package com.moreprogression.main.init;

import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.block.ProgressionBlocks;
import com.moreprogression.main.block.custom.BlueberryBushBlock;
import com.moreprogression.main.block.custom.CornCropBlock;
import com.moreprogression.main.block.custom.CrusherBlock;
import com.moreprogression.main.block.custom.CustomButtonBlock;
import com.moreprogression.main.block.custom.CustomDoorBlock;
import com.moreprogression.main.block.custom.CustomOreBlock;
import com.moreprogression.main.block.custom.CustomPressurePlateBlock;
import com.moreprogression.main.block.custom.CustomSaplingBlock;
import com.moreprogression.main.block.custom.CustomStairsBlock;
import com.moreprogression.main.block.custom.CustomTallGrassBlock;
import com.moreprogression.main.block.custom.CustomTrapDoorBlock;
import com.moreprogression.main.block.custom.EnderInfuserBlock;
import com.moreprogression.main.block.custom.TerracottaGrassBlock;
import com.moreprogression.main.world.feature.tree.CherryTree;
import com.moreprogression.main.world.feature.tree.RedwoodTree;
import com.moreprogression.main.world.feature.tree.SilverwoodTree;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BlockInit {
	
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class registryEvents {
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			event.getRegistry().registerAll(
				//Blocks
				ProgressionBlocks.ianite_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(MoreProgression.location("ianite_block")),         
				ProgressionBlocks.ianite_ore = new CustomOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 3.0f).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("ianite_ore")),
				ProgressionBlocks.tritanium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(MoreProgression.location("tritanium_block")),         
				ProgressionBlocks.tritanium_ore = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 4.0f).harvestLevel(4).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("tritanium_ore")),
				ProgressionBlocks.ender_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(MoreProgression.location("ender_block")),         
				ProgressionBlocks.ender_ore = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 4.0f).harvestLevel(5).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("ender_ore")),
				ProgressionBlocks.enderanium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName(MoreProgression.location("enderanium_block")),
				ProgressionBlocks.flint_block = new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0f).harvestLevel(0).sound(SoundType.BAMBOO)).setRegistryName(MoreProgression.location("flint_block")),
				ProgressionBlocks.marble = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("marble")),
				ProgressionBlocks.marble_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("marble_bricks")),
				ProgressionBlocks.limestone = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("limestone")),
				ProgressionBlocks.limestone_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("limestone_bricks")),
				ProgressionBlocks.basalt = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("basalt")),
				ProgressionBlocks.basalt_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("basalt_bricks")),
				ProgressionBlocks.fossil_ore = new CustomOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("fossil_ore")),
				ProgressionBlocks.corrupted_ore = new RedstoneOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(MoreProgression.location("corrupted_ore")),
				ProgressionBlocks.dust = new SandBlock(14406560, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)).setRegistryName(MoreProgression.location("dust")),
				
				//Wood
					//Cherry
				ProgressionBlocks.cherry_log = new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_log")),
				ProgressionBlocks.cherry_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_planks")),
				ProgressionBlocks.cherry_slab = new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_slab")),
				ProgressionBlocks.cherry_stairs = new CustomStairsBlock(ProgressionBlocks.cherry_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_stairs")),
				ProgressionBlocks.cherry_door = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_door")),
				ProgressionBlocks.cherry_trapdoor = new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_trapdoor")),
				ProgressionBlocks.cherry_fence = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_fence")),
				ProgressionBlocks.cherry_fencegate = new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_fencegate")),
				ProgressionBlocks.cherry_pressure_plate = new CustomPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_pressure_plate")),
				ProgressionBlocks.cherry_button = new CustomButtonBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("cherry_button")),
				ProgressionBlocks.cherry_leaves = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("cherry_leaves")),
				
					//Silverwood
				ProgressionBlocks.silverwood_log = new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_log")),
				ProgressionBlocks.silverwood_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_planks")),
				ProgressionBlocks.silverwood_slab = new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_slab")),
				ProgressionBlocks.silverwood_stairs = new CustomStairsBlock(ProgressionBlocks.cherry_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_stairs")),
				ProgressionBlocks.silverwood_door = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_door")),
				ProgressionBlocks.silverwood_trapdoor = new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_trapdoor")),
				ProgressionBlocks.silverwood_fence = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_fence")),
				ProgressionBlocks.silverwood_fencegate = new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_fencegate")),
				ProgressionBlocks.silverwood_pressure_plate = new CustomPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_pressure_plate")),
				ProgressionBlocks.silverwood_button = new CustomButtonBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("silverwood_button")),
				ProgressionBlocks.silverwood_leaves = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("silverwood_leaves")),
				
					//Redwood
				ProgressionBlocks.redwood_log = new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_log")),
				ProgressionBlocks.redwood_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_planks")),
				ProgressionBlocks.redwood_slab = new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_slab")),
				ProgressionBlocks.redwood_stairs = new CustomStairsBlock(ProgressionBlocks.cherry_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_stairs")),
				ProgressionBlocks.redwood_door = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_door")),
				ProgressionBlocks.redwood_trapdoor = new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_trapdoor")),
				ProgressionBlocks.redwood_fence = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_fence")),
				ProgressionBlocks.redwood_fencegate = new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_fencegate")),
				ProgressionBlocks.redwood_pressure_plate = new CustomPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_pressure_plate")),
				ProgressionBlocks.redwood_button = new CustomButtonBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MoreProgression.location("redwood_button")),
				ProgressionBlocks.redwood_leaves = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("redwood_leaves")),
				
				//Rock
				ProgressionBlocks.marble_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_slab")),
				ProgressionBlocks.marble_stairs = new CustomStairsBlock(ProgressionBlocks.marble.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_stairs")),
				ProgressionBlocks.limestone_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_slab")),
				ProgressionBlocks.limestone_stairs = new CustomStairsBlock(ProgressionBlocks.limestone.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_stairs")),
				ProgressionBlocks.basalt_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_slab")),
				ProgressionBlocks.basalt_stairs = new CustomStairsBlock(ProgressionBlocks.basalt.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_stairs")),
				ProgressionBlocks.marble_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_brick_slab")),
				ProgressionBlocks.marble_brick_stairs = new CustomStairsBlock(ProgressionBlocks.marble_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_brick_stairs")),
				ProgressionBlocks.limestone_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_brick_slab")),
				ProgressionBlocks.limestone_brick_stairs = new CustomStairsBlock(ProgressionBlocks.limestone_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_brick_stairs")),
				ProgressionBlocks.basalt_brick_slab = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_brick_slab")),
				ProgressionBlocks.basalt_brick_stairs = new CustomStairsBlock(ProgressionBlocks.basalt_bricks.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_brick_stairs")),
				ProgressionBlocks.marble_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_wall")),
				ProgressionBlocks.limestone_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_wall")),
				ProgressionBlocks.basalt_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_wall")),
				ProgressionBlocks.marble_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("marble_brick_wall")),
				ProgressionBlocks.limestone_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("limestone_brick_wall")),
				ProgressionBlocks.basalt_brick_wall = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("basalt_brick_wall")),
				
				//Plants
				ProgressionBlocks.blueberry_bush = new BlueberryBushBlock().setRegistryName(MoreProgression.location("blueberry_bush")),
				ProgressionBlocks.corn_crop = new CornCropBlock().setRegistryName(MoreProgression.location("corn_crop")),
				ProgressionBlocks.cherry_sapling = new CustomSaplingBlock(new CherryTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("cherry_sapling")),
				ProgressionBlocks.silverwood_sapling = new CustomSaplingBlock(new SilverwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("silverwood_sapling")),
				ProgressionBlocks.redwood_sapling = new CustomSaplingBlock(new RedwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("redwood_sapling")),
				ProgressionBlocks.corrupted_flower = new FlowerBlock(Effects.INSTANT_DAMAGE, 3, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("corrupted_flower")),
				ProgressionBlocks.terracotta_grass = new TerracottaGrassBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0F).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("terracotta_grass")),
				ProgressionBlocks.field_grass = new CustomTallGrassBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0F).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("field_grass")),
				ProgressionBlocks.corn_grass = new CustomTallGrassBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0F).sound(SoundType.PLANT)).setRegistryName(MoreProgression.location("corn_grass")),
				
				
				//Tile Entities
					//Machines
				ProgressionBlocks.crusher = new CrusherBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("crusher")),
				ProgressionBlocks.ender_infuser = new EnderInfuserBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE)).setRegistryName(MoreProgression.location("ender_infuser")),
					//Storage
				ProgressionBlocks.reinforced_barrel = new BarrelBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 1200.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(MoreProgression.location("reinforced_barrel"))
				
					);
		
			MoreProgression.LOGGER.info("Blocks registered");
		
		}
	}
}

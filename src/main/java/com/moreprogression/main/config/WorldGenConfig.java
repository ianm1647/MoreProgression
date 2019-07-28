package com.moreprogression.main.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;

public class WorldGenConfig {
	private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

	public static final ForgeConfigSpec SERVER_CONFIG;

	static {
		init(SERVER_BUILDER);

		SERVER_CONFIG = SERVER_BUILDER.build();
	}

	public static void loadConfig(ForgeConfigSpec spec, Path path) {
		final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();

		configData.load();

		spec.setConfig(configData);
	}
	
	public static ForgeConfigSpec.BooleanValue enableIaniteOre;
	public static ForgeConfigSpec.BooleanValue enableTritaniumOre;
	public static ForgeConfigSpec.BooleanValue enableEnderOre;
	public static ForgeConfigSpec.BooleanValue enableFossils;
	public static ForgeConfigSpec.BooleanValue enableMarble;
	public static ForgeConfigSpec.BooleanValue enableLimestone;
	public static ForgeConfigSpec.BooleanValue enableBasalt;
	public static ForgeConfigSpec.BooleanValue enableBlueberryBush;
	public static ForgeConfigSpec.BooleanValue enableSilverwoodTreeGen;
	
	public static void init(ForgeConfigSpec.Builder SERVER_BUILDER) {
		SERVER_BUILDER.comment("IANITE ORE GENERATION");
			enableIaniteOre = SERVER_BUILDER.comment("Generate Ianite Ore in the world [true / false ]").define("ianiteOreGeneration", true);
	
		SERVER_BUILDER.comment("TRITANIUM ORE GENERATION");
			enableTritaniumOre = SERVER_BUILDER.comment("Generate Tritanium Ore in the world [true / false ]").define("tritaniumOreGeneration", true);
	
		SERVER_BUILDER.comment("ENDER ORE GENERATION");
			enableEnderOre = SERVER_BUILDER.comment("Generate Ender Ore in the world [true / false ]").define("enderOreGeneration", true);
	
		SERVER_BUILDER.comment("FOSSIL GENERATION");
			enableFossils = SERVER_BUILDER.comment("Generate Fossils in the world [true / false ]").define("fossilGeneration", true);
	
		SERVER_BUILDER.comment("MARBLE GENERATION");
			enableMarble = SERVER_BUILDER.comment("Generate Marble in the world [true / false ]").define("marbleGeneration", true);
	
		SERVER_BUILDER.comment("LIMESTONE GENERATION");
			enableLimestone = SERVER_BUILDER.comment("Generate Limestone in the world [true / false ]").define("limestoneGeneration", true);
	
		SERVER_BUILDER.comment("BASALT GENERATION");
			enableBasalt = SERVER_BUILDER.comment("Generate Basalt in the world [true / false ]").define("basaltGeneration", true);
	
		SERVER_BUILDER.comment("BLUEBERRY BUSH GENERATION");
			enableBlueberryBush = SERVER_BUILDER.comment("Generate Blueberry Bushes in the world [true / false ]").define("blueberryBushGeneration", true);
		
		SERVER_BUILDER.comment("SILVERWOOD TREE GENERATION");
			enableSilverwoodTreeGen = SERVER_BUILDER.comment("Generate Silverwood Trees in the world [true / false ]").define("silverwoodTreeGeneration", true);
	}
}

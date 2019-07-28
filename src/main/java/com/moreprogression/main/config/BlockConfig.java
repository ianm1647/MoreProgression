package com.moreprogression.main.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;

public class BlockConfig {
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
	
	public static ForgeConfigSpec.BooleanValue enableCherryWoodType;
	public static ForgeConfigSpec.BooleanValue enableSilverwoodWoodType;
	public static ForgeConfigSpec.BooleanValue enableRedwoodWoodType;
	
	public static ForgeConfigSpec.BooleanValue enableRockBlockVariants;
	public static ForgeConfigSpec.BooleanValue enableCrusher;
	public static ForgeConfigSpec.BooleanValue enableEnderInfuser;
	
	public static void init(ForgeConfigSpec.Builder SERVER_BUILDER) {
		
		SERVER_BUILDER.comment("CHERRY WOOD");
			enableCherryWoodType = SERVER_BUILDER.comment("Enable the cherry wood type in the game [true / false]").define("cherryWoodEnabled", true);
		
		SERVER_BUILDER.comment("SILVERWOOD WOOD");
			enableSilverwoodWoodType = SERVER_BUILDER.comment("Enable silverwood wood type in the game [true / false]").define("silverwoodWoodEnabled", true);
		
		SERVER_BUILDER.comment("REDWOOD WOOD");
			enableRedwoodWoodType = SERVER_BUILDER.comment("Enable redwood wood type in the game [true / false]").define("redwoodWoodEnabled", true);
			
		SERVER_BUILDER.comment("ROCK BLOCK VARIANTS");
			enableRockBlockVariants = SERVER_BUILDER.comment("Enable MoreProgression rock block variants in the game (Marble, Limestone, and Basalt) [true / false]").define("rockBlocksEnabled", true);
		
		SERVER_BUILDER.comment("CRUSHER");
			enableCrusher = SERVER_BUILDER.comment("Enable the crusher block in the game [true / false]").define("crusherEnabled", true);
		
		SERVER_BUILDER.comment("ENDER INFUSER");
			enableEnderInfuser = SERVER_BUILDER.comment("Enable the ender infuser block in the game [true / false]").define("enderInfuser", true);
	}
}

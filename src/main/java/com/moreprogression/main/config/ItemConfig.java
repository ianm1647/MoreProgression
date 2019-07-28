package com.moreprogression.main.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;

public class ItemConfig {
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
	
	public static ForgeConfigSpec.BooleanValue enableBoneItems;
	public static ForgeConfigSpec.BooleanValue enableIaniteItems;
	public static ForgeConfigSpec.BooleanValue enableTritaniumItems;
	public static ForgeConfigSpec.BooleanValue enableEnderaniumItems;
	public static ForgeConfigSpec.BooleanValue enableStarItems;
	public static ForgeConfigSpec.BooleanValue enableDragonItems;
	public static ForgeConfigSpec.BooleanValue enablePaxels;
	
	public static void init(ForgeConfigSpec.Builder SERVER_BUILDER) {	
		SERVER_BUILDER.comment("BONE ITEMS");
			enableBoneItems = SERVER_BUILDER.comment("Enable bone items in the game [true / false]").define("boneItemsEnabled", true);
		
		SERVER_BUILDER.comment("IANITE ITEMS");
			enableIaniteItems = SERVER_BUILDER.comment("Enable ianite items in the game [true / false]").define("ianiteItemsEnabled", true);
		
		SERVER_BUILDER.comment("TRITANIUM ITEMS");
			enableTritaniumItems = SERVER_BUILDER.comment("Enable tritanium items in the game [true / false]").define("tritaniumItemsEnabled", true);
		
		SERVER_BUILDER.comment("ENDERANIUM ITEMS");
			enableEnderaniumItems = SERVER_BUILDER.comment("Enable enderanium items in the game [true / false]").define("enderaniumItemsEnabled", true);
		
		SERVER_BUILDER.comment("STAR ITEMS");
			enableStarItems = SERVER_BUILDER.comment("Enable star items in the game [true / false]").define("starItemsEnabled", false);
		
		SERVER_BUILDER.comment("DRAGON ITEMS");
			enableDragonItems = SERVER_BUILDER.comment("Enable dragon items in the game [true / false]").define("dragonItemsEnabled", true);
		
		SERVER_BUILDER.comment("VANILLA PAXELS");
			enablePaxels = SERVER_BUILDER.comment("Enable paxels in the game [true / false]").define("paxelsEnabled", true);
	}
}

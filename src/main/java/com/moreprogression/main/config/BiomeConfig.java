package com.moreprogression.main.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;

public class BiomeConfig {
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
	
	public static ForgeConfigSpec.BooleanValue enableCorruptedForest;
	public static ForgeConfigSpec.BooleanValue enableDustWasteland;
	public static ForgeConfigSpec.BooleanValue enableTerracottaPlains;
	public static ForgeConfigSpec.BooleanValue enableField;

	public static void init(ForgeConfigSpec.Builder SERVER_BUILDER) {
		SERVER_BUILDER.comment("CORRUPTED FOREST GENERATION");
			enableCorruptedForest = SERVER_BUILDER.comment("Generate Corrupted Forests in the world [true / false ]").define("corruptedForestGeneration", true);
			
		SERVER_BUILDER.comment("DUST WASTELAND GENERATION");
			enableDustWasteland = SERVER_BUILDER.comment("Generate Dust Wastelands in the world [true / false ]").define("dustWastelandGeneration", true);
			
		SERVER_BUILDER.comment("TERRACOTTA PLAINS GENERATION");
			enableTerracottaPlains = SERVER_BUILDER.comment("Generate Terracotta Plains in the world [true / false ]").define("terracottaPlainsGeneration", true);
			
		SERVER_BUILDER.comment("FIELD GENERATION");
			enableField = SERVER_BUILDER.comment("Generate Fields in the world [true / false]").define("fieldGeneration", true);
	}
}

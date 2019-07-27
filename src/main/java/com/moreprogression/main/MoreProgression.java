package com.moreprogression.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.moreprogression.main.config.ProgressionConfig;
import com.moreprogression.main.item.group.ProgressionCreativeBlock;
import com.moreprogression.main.item.group.ProgressionCreativeItem;
import com.moreprogression.main.item.group.ProgressionCreativeTool;
import com.moreprogression.main.tileentity.container.ProgressionContainerTypes;
import com.moreprogression.main.tileentity.gui.CrusherScreen;
import com.moreprogression.main.tileentity.gui.EnderInfuserScreen;
import com.moreprogression.main.world.Generation;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
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
		ScreenManager.registerFactory(ProgressionContainerTypes.ENDER_INFUSER, EnderInfuserScreen::new);
		LOGGER.info("Client registries method registered");
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(MODID, name);
	}
}


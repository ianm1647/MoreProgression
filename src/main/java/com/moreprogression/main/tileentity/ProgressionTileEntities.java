package com.moreprogression.main.tileentity;

import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.block.ProgressionBlocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MoreProgression.MODID)
public class ProgressionTileEntities {

	@ObjectHolder("crusher")
	public static final TileEntityType<CrusherTileEntity> CRUSHER = null;
	@ObjectHolder("ender_infuser")
	public static final TileEntityType<EnderInfuserTileEntity> ENDER_INFUSER = null;

	@Mod.EventBusSubscriber(modid = MoreProgression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Registration {
		@SubscribeEvent
		public static void onTileEntityRegister(final RegistryEvent.Register<TileEntityType<?>> event) {
			IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();
			
			registry.register(TileEntityType.Builder.create(CrusherTileEntity::new, ProgressionBlocks.crusher).build(null).setRegistryName("crusher"));
			registry.register(TileEntityType.Builder.create(EnderInfuserTileEntity::new, ProgressionBlocks.ender_infuser).build(null).setRegistryName("ender_infuser"));
			
			MoreProgression.LOGGER.info("Registered TileEntities");
		}
	}
	
}

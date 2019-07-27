package com.moreprogression.main.tileentity.container;

import com.moreprogression.main.MoreProgression;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MoreProgression.MODID)
public class ProgressionContainerTypes {
	
	@ObjectHolder("crusher_gui")
	public static final ContainerType<CrusherContainer> CRUSHER = null;
	@ObjectHolder("infuser_gui")
	public static final ContainerType<EnderInfuserContainer> ENDER_INFUSER = null;
	
	@Mod.EventBusSubscriber(modid = MoreProgression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Registration {
		@SubscribeEvent
		public static void onContainerTypeRegister(final RegistryEvent.Register<ContainerType<?>> event) {
			IForgeRegistry<ContainerType<?>> registry = event.getRegistry();
			
			registry.register(new ContainerType<CrusherContainer>(CrusherContainer::new).setRegistryName(MoreProgression.location("crusher_gui")));
			registry.register(new ContainerType<EnderInfuserContainer>(EnderInfuserContainer::new).setRegistryName(MoreProgression.location("infuser_gui")));
			
			MoreProgression.LOGGER.info("Registred container types");
		}
	}
	
}

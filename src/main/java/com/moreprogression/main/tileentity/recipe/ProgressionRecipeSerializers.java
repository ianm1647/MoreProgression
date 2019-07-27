package com.moreprogression.main.tileentity.recipe;

import com.moreprogression.main.MoreProgression;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MoreProgression.MODID)
public class ProgressionRecipeSerializers {

	@ObjectHolder("crushing")
	public static final IRecipeSerializer<CrushingRecipe> CRUSHING = null;
	@ObjectHolder("infusing")
	public static final IRecipeSerializer<InfusingRecipe> INFUSING = null;
	
	@Mod.EventBusSubscriber(modid = MoreProgression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Registration {
		@SubscribeEvent
		public static void onRegister(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
			IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
			
			registry.register(new CrushingRecipe.Serializer().setRegistryName(MoreProgression.location("crushing")));
			registry.register(new InfusingRecipe.Serializer().setRegistryName(MoreProgression.location("infusing")));

			MoreProgression.LOGGER.info("Registred Recipe Serializer");
		}
	}
	
}

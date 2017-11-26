package com.chaosthedude.realistictorches;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.chaosthedude.realistictorches.blocks.RealisticTorchesBlocks;
import com.chaosthedude.realistictorches.config.ConfigHandler;
import com.chaosthedude.realistictorches.events.RealisticTorchesEvents;
//import com.chaosthedude.realistictorches.handler.LightSourceHandler;
import com.chaosthedude.realistictorches.handler.RecipeHandler;
import com.chaosthedude.realistictorches.items.RealisticTorchesItems;
import com.chaosthedude.realistictorches.proxy.CommonProxy;
//import com.chaosthedude.realistictorches.worldgen.TorchGenerator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod(modid = RealisticTorches.MODID, name = RealisticTorches.NAME, version = RealisticTorches.VERSION, acceptedMinecraftVersions = "[1.12.2]")

public class RealisticTorches {

	public static final String MODID = "realistictorches";
	public static final String NAME = "Realistic Torches";
	public static final String VERSION = "2.1.0";

	public static final Logger logger = LogManager.getLogger(MODID);

	@SidedProxy(clientSide = "com.chaosthedude.realistictorches.proxy.ClientProxy", serverSide = "com.chaosthedude.realistictorches.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		//proxy.registerModels();

		ConfigHandler.loadConfig(event.getSuggestedConfigurationFile());
		ConfigHandler.printConfigInfo();

		//GameRegistry.registerWorldGenerator(new TorchGenerator(), 0);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//RecipeHandler.removeRecipe(new ItemStack(Blocks.TORCH));
		//RecipeHandler.registerRecipes();

		MinecraftForge.EVENT_BUS.register(new RealisticTorchesEvents());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//RecipeHandler.removeRecipes();
		//RecipeHandler.registerVanillaRecipes();

		//LightSourceHandler.registerLightSources();
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			RealisticTorchesItems.register(event.getRegistry());
			RealisticTorchesBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			RealisticTorchesBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			RealisticTorchesItems.registerModels();
			RealisticTorchesBlocks.registerModels();
		}
		
	    @SubscribeEvent
	    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	    {
	    	ResourceLocation torch = new ResourceLocation("minecraft:torch");
	        IForgeRegistryModifiable<IRecipe> modRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
	        modRegistry.remove(torch);
	    }
	}
}

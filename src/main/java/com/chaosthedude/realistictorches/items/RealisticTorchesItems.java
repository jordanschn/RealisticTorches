package com.chaosthedude.realistictorches.items;

import java.util.ArrayList;
import java.util.List;

import com.chaosthedude.realistictorches.RealisticTorches;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RealisticTorchesItems {

	public static ItemMatchbox matchbox = new ItemMatchbox();
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				matchbox
		);		
		//glowstoneCrystal = registerItem(new Item().setUnlocalizedName(RealisticTorches.MODID + ".glowstone_crystal").setCreativeTab(CreativeTabs.MATERIALS), "glowstone_crystal");
		//glowstonePaste = registerItem(new Item().setUnlocalizedName(RealisticTorches.MODID + ".glowstone_paste").setCreativeTab(CreativeTabs.MATERIALS), "glowstone_paste");
	}

	public static void registerModels() {
		matchbox.registerItemModel();
	}

}

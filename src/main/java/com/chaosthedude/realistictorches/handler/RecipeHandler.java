package com.chaosthedude.realistictorches.handler;

import java.util.List;

import com.chaosthedude.realistictorches.RealisticTorches;
import com.chaosthedude.realistictorches.blocks.RealisticTorchesBlocks;
import com.chaosthedude.realistictorches.config.ConfigHandler;
import com.chaosthedude.realistictorches.items.RealisticTorchesItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeHandler {

	public static void registerRecipes() {
		ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit1"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', Items.COAL, 'S', "stickWood"}));
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), "C", "S", 'C', new ItemStack(Items.COAL, 1, 1), 'S', "stickWood"));
		
		ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("glowstoneCrystal"), new ItemStack(RealisticTorchesItems.glowstoneCrystal, 1), new Object[]{" G ", "GCG", " G ", 'G', Items.GLOWSTONE_DUST, 'C', "itemCharcoalSugar"}));
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), "C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"));
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RealisticTorchesItems.glowstoneCrystal, 1), " G ", "GCG", " G ", 'G', Items.GLOWSTONE_DUST, 'C', "itemCharcoalSugar"));

		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//GameRegistry.addShapelessRecipe(new ItemStack(RealisticTorchesBlocks.torchLit, 1), new ItemStack(RealisticTorchesBlocks.torchUnlit, 1), new ItemStack(RealisticTorchesItems.matchbox, 1, OreDictionary.WILDCARD_VALUE));
		//GameRegistry.addShapelessRecipe(new ItemStack(RealisticTorchesItems.matchbox, 1), new ItemStack(RealisticTorchesItems.matchbox), new ItemStack(RealisticTorchesItems.matchbox));

		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//GameRegistry.addShapedRecipe(new ItemStack(RealisticTorchesItems.glowstoneCrystal, 1), " G ", "GCG", " G ", 'G', Items.GLOWSTONE_DUST, 'C', Items.COAL);
		//GameRegistry.addShapedRecipe(new ItemStack(RealisticTorchesItems.glowstoneCrystal, 1), " G ", "GCG", " G ", 'G', Items.GLOWSTONE_DUST, 'C', new ItemStack(Items.COAL, 1, 1));

		//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("torchUnlit2"), new ItemStack(RealisticTorchesBlocks.torchUnlit, 4), new Object[]{"C", "S", 'C', "itemCharcoalSugar", 'S', "stickWood"}));
		//GameRegistry.addShapelessRecipe(new ItemStack(RealisticTorchesItems.glowstonePaste), Items.GLOWSTONE_DUST, Items.CLAY_BALL, Items.WATER_BUCKET);

		ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation("matchbox"), new ItemStack(RealisticTorchesItems.matchbox, 1), new Object[]{"PPP", "SSS", 'P', Items.PAPER, 'S', "slabWood"}));
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RealisticTorchesItems.matchbox, 1), "PPP", "SSS", 'P', Items.PAPER, 'S', "slabWood"));*/
	}

	public static void registerVanillaRecipes() {
		/*GameRegistry.addRecipe(new ItemStack(Blocks.TORCH, 4), "G", "S", 'G', RealisticTorchesItems.glowstoneCrystal, 'S', Items.STICK);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TORCH, 1), RealisticTorchesBlocks.torchLit, RealisticTorchesItems.glowstonePaste);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TORCH, 1), RealisticTorchesBlocks.torchSmoldering, RealisticTorchesItems.glowstonePaste);*/
	}

	/*
	public static void registerOres() {
		if (ConfigHandler.oreDictionaryEnabled) {
			OreDictionary.registerOre("blockTorch", RealisticTorchesBlocks.torchLit);
			OreDictionary.registerOre("blockTorch", Blocks.TORCH);
		}
	}*/

	public static void removeRecipes() {/*
		for (String name : ConfigHandler.removeRecipes) {
			final Block block = Block.getBlockFromName(name);
			if (block != null) {
				removeRecipe(new ItemStack(block));
			} else {
				final Item item = Item.REGISTRY.getObject(new ResourceLocation(name));
				if (item != null) {
					removeRecipe(new ItemStack(item));
				}
			}
		}*/
	}

	public static void removeRecipe(ItemStack s) {
		/*final List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
		int recipeCount = 0;
		for (int i = 0; i < recipeList.size(); i++) {
			final IRecipe currentRecipe = recipeList.get(i);
			final ItemStack output = currentRecipe.getRecipeOutput();
			if (output != null && output.getItem() == s.getItem()) {
				recipeList.remove(i);
				recipeCount++;
			}
		}

		RealisticTorches.logger.info("Removed " + recipeCount + " torch recipe" + (recipeCount > 1 ? "s." : "."));*/
	}

}

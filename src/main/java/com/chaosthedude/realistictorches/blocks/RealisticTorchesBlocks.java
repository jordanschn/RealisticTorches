package com.chaosthedude.realistictorches.blocks;

import java.util.ArrayList;
import java.util.List;

import com.chaosthedude.realistictorches.RealisticTorches;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;


public class RealisticTorchesBlocks {

	//public static final List<Block> REGISTRY = new ArrayList<Block>();

	public static BlockTorchUnlit torchUnlit = new BlockTorchUnlit();
	public static BlockTorchLit torchLit = new BlockTorchLit();
	public static BlockTorchSmoldering torchSmoldering = new BlockTorchSmoldering();
	//public static BlockMovingLightSource movingLightSource = new BlockMovingLightSource();

	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				torchUnlit,
				torchLit,
				torchSmoldering
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				torchUnlit.createItemBlock(),
				torchLit.createItemBlock(),
				torchSmoldering.createItemBlock()
		);
	}

	public static void registerModels() {
		RealisticTorches.proxy.registerItemRenderer(Item.getItemFromBlock(torchUnlit), 0, BlockTorchUnlit.NAME);
		RealisticTorches.proxy.registerItemRenderer(Item.getItemFromBlock(torchLit), 0, BlockTorchLit.NAME);
		RealisticTorches.proxy.registerItemRenderer(Item.getItemFromBlock(torchSmoldering), 0, BlockTorchSmoldering.NAME);
	}
}

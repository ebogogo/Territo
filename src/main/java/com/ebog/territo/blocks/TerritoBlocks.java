package com.ebog.territo.blocks;

import com.ebog.territo.items.Diamond_Fractured;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class TerritoBlocks extends Blocks{

	public static Block Bloodstone_Ore = new Bloodstone_Ore();
	public static Block Lantern = new Lantern();
	//blood diamond block

	
	public static void init() {

		RegisterBlock();
		
	}

	private static void RegisterBlock() {

		GameRegistry.registerBlock(Bloodstone_Ore, "Bloodstone_Ore");
		GameRegistry.registerBlock(Lantern, "Lantern");
		
	}
}
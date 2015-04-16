package com.ebog.territo.blocks;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloodstone_Ore extends Block	{
	
	public Bloodstone_Ore()	{
		super(Material.rock);
		
		setBlockName(References.MOD_ID + "_" + "bloodstone_ore");
		setBlockTextureName(References.MOD_ID + ":" + "bloodstone_ore");
		
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		
	}
}
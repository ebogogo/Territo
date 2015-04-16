package com.ebog.territo.blocks;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lantern extends Block	{
	
	public Lantern()	{
		super(Material.glass);
		
		setBlockName(References.MOD_ID + "_" + "lantern");
		setBlockTextureName(References.MOD_ID + ":" + "lantern");
		
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setStepSound(soundTypeGlass);
		setHardness(0.0F);
		setResistance(1.0F);
		setLightLevel(1.0F);
		
	}
}
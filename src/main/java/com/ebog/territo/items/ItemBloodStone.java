package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBloodStone extends Item	{
	
	public ItemBloodStone(String type)	{
	
		setUnlocalizedName(References.MOD_ID + "_" + "BloodStone_" + type);
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" +  "BloodStone_" + type);
		GameRegistry.registerItem(this, "BloodStone_" + type);

		}
	}
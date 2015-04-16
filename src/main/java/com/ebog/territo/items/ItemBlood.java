package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlood extends Item	{
	
	public ItemBlood(String type)	{
	
		setUnlocalizedName(References.MOD_ID + "_" + "Blood_" + type);
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" +  "Blood_" + type);
		GameRegistry.registerItem(this, "Blood_" + type);

		}
	}
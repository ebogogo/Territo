package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diamond_Fractured extends Item	{
	
	public Diamond_Fractured()	{
	
		setUnlocalizedName(References.MOD_ID + "_" + "fractured_diamond");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + "fractured_diamond");

		}
	}
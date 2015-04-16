package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diamond_unforged_Blood extends Item
{
public Diamond_unforged_Blood()	{
	
setUnlocalizedName(References.MOD_ID + "_" + "Unforged_Blood_Diamond");
setCreativeTab(MainTerritoTabs.tabTerriroMain);
setTextureName(References.MOD_ID + ":" + "Unforged_Blood_Diamond");

}
}
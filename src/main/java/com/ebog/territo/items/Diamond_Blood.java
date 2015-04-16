package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diamond_Blood extends Item
{
public Diamond_Blood()	{
	
setUnlocalizedName(References.MOD_ID + "_" + "Diamond_Blood");
setCreativeTab(MainTerritoTabs.tabTerriroMain);
setTextureName(References.MOD_ID + ":" + "Diamond_Blood");

}
}
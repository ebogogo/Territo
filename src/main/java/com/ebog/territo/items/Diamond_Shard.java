package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diamond_Shard extends Item
{
public Diamond_Shard()	{
	
setUnlocalizedName(References.MOD_ID + "_" + "Diamond_Shard");
setCreativeTab(MainTerritoTabs.tabTerriroMain);
setTextureName(References.MOD_ID + ":" + "Diamond_Shard");

}
}
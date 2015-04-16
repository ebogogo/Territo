package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hammer_Singleuse extends Item
{
public Hammer_Singleuse()	{
	
setUnlocalizedName(References.MOD_ID + "_" + "Hammer_Singleuse");
setCreativeTab(MainTerritoTabs.tabTerriroMain);
setTextureName(References.MOD_ID + ":" + "Hammer_Singleuse");

}
}
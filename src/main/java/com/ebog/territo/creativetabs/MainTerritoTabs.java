package com.ebog.territo.creativetabs;

import com.ebog.territo.items.TerritoItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MainTerritoTabs {
	
	public static CreativeTabs tabTerriroMain;
	
	public static void init(){
		
	tabTerriroMain = new TabTerritoMain("TerritoMainTab");
	
	}

}

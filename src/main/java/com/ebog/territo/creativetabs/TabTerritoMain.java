package com.ebog.territo.creativetabs;

import com.ebog.territo.items.TerritoItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTerritoMain extends CreativeTabs {

	public TabTerritoMain(String lable) {
		super(lable);

	}

	@Override
	public Item getTabIconItem() {

		return TerritoItems.Bloodstone_Ingot;
	}

}

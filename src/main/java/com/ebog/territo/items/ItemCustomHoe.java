package com.ebog.territo.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCustomHoe extends ItemHoe {

	protected ItemCustomHoe(ToolMaterial material, String hoetype) {
		super(material);
		
		setUnlocalizedName(References.MOD_ID + "_" + hoetype + "_Hoe");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + hoetype + "_Hoe");
		GameRegistry.registerItem(this, hoetype + "_Hoe");
	}

}

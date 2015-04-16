package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemCustomShovel extends ItemSpade {

	protected ItemCustomShovel(ToolMaterial material, String shoveltype) {
		super(material);
		
		setUnlocalizedName(References.MOD_ID + "_" + shoveltype + "_Shovel");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + shoveltype + "_Shovel");
		GameRegistry.registerItem(this, shoveltype + "_Shovel");
	}

}

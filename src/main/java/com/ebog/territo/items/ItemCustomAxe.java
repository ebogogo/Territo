package com.ebog.territo.items;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemCustomAxe extends ItemAxe {

	protected ItemCustomAxe(ToolMaterial material, String axetype) {
		super(material);
		
		setUnlocalizedName(References.MOD_ID + "_" + axetype + "_Axe");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + axetype + "_Axe");
		GameRegistry.registerItem(this, axetype + "_Axe");
	}

}

package com.ebog.territo.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCustomPickaxe extends ItemPickaxe {

	protected ItemCustomPickaxe(ToolMaterial material, String pickaxetype) {
		super(material);
		
		setUnlocalizedName(References.MOD_ID + "_" + pickaxetype + "_Pickaxe");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + pickaxetype + "_Pickaxe");
		GameRegistry.registerItem(this, pickaxetype + "_Pickaxe");
	}

}

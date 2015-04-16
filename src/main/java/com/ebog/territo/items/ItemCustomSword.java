package com.ebog.territo.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

import com.ebog.territo.References;
import com.ebog.territo.creativetabs.MainTerritoTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCustomSword extends ItemSword {

	protected ItemCustomSword(ToolMaterial material, String swordtype) {
		super(material);
		
		setUnlocalizedName(References.MOD_ID + "_" + swordtype + "_Sword");
		setCreativeTab(MainTerritoTabs.tabTerriroMain);
		setTextureName(References.MOD_ID + ":" + swordtype + "_Sword");
		GameRegistry.registerItem(this, swordtype + "_Sword");
	}

}

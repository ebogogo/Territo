package com.ebog.territo.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TerritoItems extends Items {

	public static Item Blood_Dried = new ItemBlood("Dried");
	public static Item Blood_Clump = new ItemBlood("Clump");
	public static Item Blood_Gloop = new ItemBlood("Gloop");
	public static Item Blood_Thin = new ItemBlood("Thin");
	public static Item Blood_Normal = new ItemBlood("Normal");
	public static Item Blood_Thick = new ItemBlood("Thick");
	public static Item Blood_Concentrated_Droplet = new ItemBlood("Concentrated_Droplet");
	public static Item Blood_Concentrated = new ItemBlood("Concentrated");
	public static Item Blood_Filter = new ItemBlood("Filter");
	

	public static Item BloodStone_Dust = new ItemBloodStone("Dust");
	public static Item BloodStone_Gem = new ItemBloodStone("Gem");
	public static Item Bloodstone_Ingot = new ItemBloodStone("Ingot");
	public static Item Bloodstone_Enchanced_Ingot = new ItemBloodStone("Enhanced_Ingot");
	
	public static Item Diamond_Fractured = new Diamond_Fractured();
	public static Item Diamond_unforged_Blood = new Diamond_unforged_Blood();
	public static Item Diamond_Blood = new Diamond_Blood();
	public static Item Diamond_Shard = new Diamond_Shard();
	public static Item Hammer_Singleuse = new Hammer_Singleuse();
	
	public static ToolMaterial MaterialSharpenedDiamond = EnumHelper.addToolMaterial("SharpenedDiamond", 3, 2500, 10.0F, 4F, 12);
	public static Item Sharpened_Diamond_Axe = new ItemCustomAxe(MaterialSharpenedDiamond, "Sharpened_Diamond");
	public static Item Sharpened_Diamond_Shovel = new ItemCustomShovel(MaterialSharpenedDiamond, "Sharpened_Diamond");
	public static Item Sharpened_Diamond_Pickaxe = new ItemCustomPickaxe(MaterialSharpenedDiamond, "Sharpened_Diamond");
	public static Item Sharpened_Diamond_Hoe = new ItemCustomHoe(MaterialSharpenedDiamond, "Sharpened_Diamond");
	public static Item Sharpened_Diamond_Sword = new ItemCustomSword(MaterialSharpenedDiamond, "Sharpened_Diamond");
	
	public static Item BloodStone_Axe = new ItemCustomAxe(ToolMaterial.IRON, "BloodStone");
	public static Item BloodStone_Shovel = new ItemCustomShovel(ToolMaterial.IRON, "BloodStone");
	public static Item BloodStone_Pickaxe = new ItemCustomPickaxe(ToolMaterial.IRON, "BloodStone");
	public static Item BloodStone_Hoe = new ItemCustomHoe(ToolMaterial.IRON, "BloodStone");
	public static Item BloodStone_Sword = new ItemCustomSword(ToolMaterial.IRON, "BloodStone");
	
	public static ToolMaterial MaterialEnhancedBloodStone = EnumHelper.addToolMaterial("EnhancedBloodStone", 3, 4000, 15.0F, 10F, 18);
	public static Item BloodStone_Enhanced_Axe = new ItemCustomAxe(MaterialEnhancedBloodStone, "BloodStone_Enhanced");
	public static Item BloodStone_Enhanced_Shovel = new ItemCustomShovel(MaterialEnhancedBloodStone, "BloodStone_Enhanced");
	public static Item BloodStone_Enhanced_Pickaxe = new ItemCustomPickaxe(MaterialEnhancedBloodStone, "BloodStone_Enhanced");
	public static Item BloodStone_Enhanced_Hoe = new ItemCustomHoe(MaterialEnhancedBloodStone, "BloodStone_Enhanced");
	public static Item BloodStone_Enhanced_Sword = new ItemCustomSword(MaterialEnhancedBloodStone, "BloodStone_Enhanced");	

	
	public static void init() {

		RegisterItem();
		
	}

	private static void RegisterItem() {

		
		GameRegistry.registerItem(Diamond_Fractured, "Diamond_Fractured");
		GameRegistry.registerItem(Diamond_unforged_Blood, "Diamond_unforged_Blood");
		GameRegistry.registerItem(Diamond_Blood, "Diamond_Blood");
		GameRegistry.registerItem(Diamond_Shard, "Diamond_Shard");
		GameRegistry.registerItem(Hammer_Singleuse, "Hammer_Singleuse");
		
		
	}

}

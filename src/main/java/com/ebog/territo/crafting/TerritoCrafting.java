package com.ebog.territo.crafting;

import com.ebog.territo.items.TerritoItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TerritoCrafting {

	public static void init() {
		
		craftingtable();
		furnace();
		
	}

	private static void craftingtable() {
		
		
		GameRegistry.addRecipe(new ItemStack(TerritoItems.Blood_Clump), new Object[]{
	    	"BBB",
	    	"BBB",
	    	"BBB",
	    	'B', TerritoItems.Blood_Dried,
	    	});
		GameRegistry.addShapelessRecipe(new ItemStack(TerritoItems.Blood_Gloop), new Object[] { 
			TerritoItems.Blood_Clump, 
			Items.water_bucket
			});
		GameRegistry.addRecipe(new ItemStack(TerritoItems.Blood_Thin), new Object[]{
	    	"BBB",
	    	"BFB",
	    	"BBB",
	    	'B', TerritoItems.Blood_Gloop,
	    	'F', TerritoItems.Blood_Filter
	    	});
		GameRegistry.addRecipe(new ItemStack(TerritoItems.Blood_Normal, 2), new Object[]{
	    	"BSB",
	    	"SBS",
	    	"BSB",
	    	'B', TerritoItems.Blood_Gloop,
	    	'S', Items.slime_ball
	    	});
		GameRegistry.addShapelessRecipe(new ItemStack(TerritoItems.Blood_Thick), new Object[] { 
			TerritoItems.Blood_Normal, 
			TerritoItems.Blood_Normal, 
			TerritoItems.Blood_Normal
			});
		GameRegistry.addRecipe(new ItemStack(TerritoItems.Blood_Concentrated), new Object[]{
	    	"BBB",
	    	"BBB",
	    	"BBB",
	    	'B', TerritoItems.Blood_Concentrated_Droplet,
	    	});		
		
		
		
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Diamond_Fractured), new Object[]{
    		" H ",
    		"FDF",
    		"FFF",
    		'D', Items.diamond,
    		'H', TerritoItems.Hammer_Singleuse,
    		'F', Items.flint
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Hammer_Singleuse), new Object[]{
    		"CIC",
    		"CSC",
    		" S ",
    		'C', Blocks.cobblestone,
    		'I', Items.iron_ingot,
    		'S', Items.iron_ingot
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Diamond_unforged_Blood), new Object[]{
    		"BBB",
    		"BDB",
    		"BBB",
    		'D', TerritoItems.Diamond_Fractured,
    		'B', TerritoItems.Blood_Gloop,
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Diamond_Shard), new Object[]{
    		"FHF",
    		"FDF",
    		"FFF",
    		'D', TerritoItems.Diamond_Fractured,
    		'H', TerritoItems.Hammer_Singleuse,
    		'F', Items.flint
    		});
    		
    	//sharpened diamond tools
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Sharpened_Diamond_Sword), new Object[]{
    		" S ",
    		"STS",
    		'S', TerritoItems.Diamond_Shard,
    		'T', Items.diamond_sword,
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Sharpened_Diamond_Pickaxe), new Object[]{
    		" S ",
    		"STS",
    		'S', TerritoItems.Diamond_Shard,
    		'T', Items.diamond_pickaxe,
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Sharpened_Diamond_Axe), new Object[]{
    		" S ",
    		"ST",
    		'S', TerritoItems.Diamond_Shard,
    		'T', Items.diamond_axe,
    		});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Sharpened_Diamond_Shovel), new Object[]{
    		"S",
    		"T",
    		'S', TerritoItems.Diamond_Shard,
    		'T', Items.diamond_shovel,
        	});
    	GameRegistry.addRecipe(new ItemStack(TerritoItems.Sharpened_Diamond_Hoe), new Object[]{
    		"S",
    		"T",
    		'S', TerritoItems.Diamond_Shard,
    		'T', Items.diamond_hoe,
        	});
    	
		
	}
	private static void furnace() {

		GameRegistry.addSmelting(new ItemStack(TerritoItems.Blood_Thick, 2), new ItemStack(TerritoItems.Blood_Concentrated_Droplet), 1.0F);
		
	}


}

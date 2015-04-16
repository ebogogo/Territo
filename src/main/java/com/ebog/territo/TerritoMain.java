package com.ebog.territo;

import com.ebog.territo.blocks.TerritoBlocks;
import com.ebog.territo.crafting.TerritoCrafting;
import com.ebog.territo.creativetabs.MainTerritoTabs;
import com.ebog.territo.items.TerritoItems;
import com.ebog.territo.proxy.ServerProxy;
import com.ebog.territo.worldgeneration.TerrirtoMainGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

public class TerritoMain {
	
	@SidedProxy(clientSide = References.CLIENTSIDE, serverSide = References.SERVERSIDE )
	public static ServerProxy proxy;
	
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {
    	MainTerritoTabs.init();
    	TerritoItems.init();
    	TerritoBlocks.init();
    	TerritoCrafting.init();
    	TerrirtoMainGeneration.init();
		
    }@EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }@EventHandler
    public void postinit(FMLInitializationEvent event)
    {
		
    }
}

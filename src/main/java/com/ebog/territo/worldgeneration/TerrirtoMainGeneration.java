package com.ebog.territo.worldgeneration;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class TerrirtoMainGeneration {

	public static void init()	{

		IWorldGenerator eventWorldGen = new TerritoOreGeneration();
		GameRegistry.registerWorldGenerator(new TerritoOreGeneration(), 0);
		
		
	}
}

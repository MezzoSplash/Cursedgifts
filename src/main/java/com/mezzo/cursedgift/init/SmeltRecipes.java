package com.mezzo.cursedgift.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltRecipes 
{
	public static void init() 
	{
		// smelting in furnace als: GameRegistry.addSmelting(ModItems.input, new ItemStack(ModItems.output,amount[int]),xp amount[float]);
		
		GameRegistry.addSmelting(ModItems.MAGIXDUST, new ItemStack(ModItems.MAXIGINGOT,1),1.5f);
		
	}

}

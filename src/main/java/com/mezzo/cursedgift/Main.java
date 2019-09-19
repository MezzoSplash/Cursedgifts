package com.mezzo.cursedgift;

import com.mezzo.cursedgift.init.ModItems;
import com.mezzo.cursedgift.init.SmeltRecipes;
import com.mezzo.cursedgift.proxy.CommonProxy;
import com.mezzo.cursedgift.tabs.CursedGiftsTab;
import com.mezzo.cursedgift.util.Reference;
import com.mezzo.cursedgift.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {
	
	public static final CreativeTabs tabCURSEDGIFTS = new CursedGiftsTab("cursed_gifts_tab");

	@Instance
	public static Main instance;
	
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		SmeltRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}

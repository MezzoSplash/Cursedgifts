package com.mezzo.cursedgift.items;

import com.mezzo.cursedgift.Main;
import com.mezzo.cursedgift.init.ModItems;
import com.mezzo.cursedgift.tabs.CursedGiftsTab;
import com.mezzo.cursedgift.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//init model into game
public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabCURSEDGIFTS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{ //render it in inventory
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}

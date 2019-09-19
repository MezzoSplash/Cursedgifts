package com.mezzo.cursedgift.items.tools;

import com.mezzo.cursedgift.Main;
import com.mezzo.cursedgift.init.ModItems;
import com.mezzo.cursedgift.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
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

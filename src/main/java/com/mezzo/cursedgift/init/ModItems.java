package com.mezzo.cursedgift.init;

import java.util.ArrayList;
import java.util.List;

import com.mezzo.cursedgift.items.ItemBase;
import com.mezzo.cursedgift.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS =new ArrayList<Item>();
	
	//ToolMaterials tab, adding new materials for tools
	public static final ToolMaterial MATERIAL_MAGIX = EnumHelper.addToolMaterial("material_magix",3,2500, 10.0F, 3.5F, 10);
	//material, harvestlevel, durability, speed, damage, enchantability(how much you get good enchants)
	
	
	
	
	//add modded items in game
	//DON"T FORGET TO: Add <name>.json and make entry into EN_US.lang
	public static final Item ORB = new ItemBase("orb");
	public static final Item TEST = new ItemBase("test");
	public static final Item MAGIXDUST = new ItemBase("magix_dust");
	public static final Item CONCENTRATEDAVERAGEMATTER = new ItemBase("concentrated_unstable_average_matter");
	public static final Item AVERAGEMATTER = new ItemBase("unstable_average_matter");
	public static final Item MAXIGINGOT = new ItemBase("pure_magic_ingot");
	
	
	//Tools
	public static final ItemSword MAGIX_SWORD = new ToolSword("magix_sword",MATERIAL_MAGIX);
	
}

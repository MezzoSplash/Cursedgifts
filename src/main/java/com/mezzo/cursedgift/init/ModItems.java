package com.mezzo.cursedgift.init;

import java.util.ArrayList;
import java.util.List;

import com.mezzo.cursedgift.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems 
{

	public static final List<Item> ITEMS =new ArrayList<Item>();
	
	
	//add modded items in game
	//DON"T FORGET TO: Add <name>.json and make entry into EN_US.lang
	public static final Item ORB = new ItemBase("orb");
	public static final Item TEST = new ItemBase("test");
	public static final Item MAGIXDUST = new ItemBase("magix_dust");
	public static final Item CONCENTRATEDAVERAGEMATTER = new ItemBase("concentrated_unstable_average_matter");
	public static final Item AVERAGEMATTER = new ItemBase("unstable_average_matter");
	public static final Item MAXIGINGOT = new ItemBase("pure_magic_ingot");
	
	
}

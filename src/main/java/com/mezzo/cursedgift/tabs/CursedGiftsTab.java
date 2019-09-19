package com.mezzo.cursedgift.tabs;

import com.mezzo.cursedgift.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CursedGiftsTab extends CreativeTabs
{

	public CursedGiftsTab(String label) {super("cursedgiftstab");}
	public ItemStack getTabIconItem() {return new ItemStack(ModItems.MAGIXDUST);}

}
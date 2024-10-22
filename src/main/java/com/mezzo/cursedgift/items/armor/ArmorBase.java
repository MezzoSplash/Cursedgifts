package com.mezzo.cursedgift.items.armor;

import com.mezzo.cursedgift.Main;
import com.mezzo.cursedgift.init.ModItems;
import com.mezzo.cursedgift.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{
	
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
	super(materialIn, renderIndexIn, equipmentSlotIn);
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

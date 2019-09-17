package com.mezzo.cursedgift.items.food;

import com.mezzo.cursedgift.Main;
import com.mezzo.cursedgift.init.ModItems;
import com.mezzo.cursedgift.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	
	//Create new method for implementing food
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount,saturation,isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

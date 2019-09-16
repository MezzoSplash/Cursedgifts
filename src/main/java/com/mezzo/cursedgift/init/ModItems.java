package com.mezzo.cursedgift.init;

import java.util.ArrayList;
import java.util.List;

import com.mezzo.cursedgift.items.ItemBase;
import com.mezzo.cursedgift.items.armor.ArmorBase;
import com.mezzo.cursedgift.items.tools.ToolSpade;
import com.mezzo.cursedgift.items.tools.ToolSword;
import com.mezzo.cursedgift.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS =new ArrayList<Item>();
	
	//ToolMaterials tab, adding new materials for tools
	public static final ToolMaterial MATERIAL_MAGIX = EnumHelper.addToolMaterial("material_magix",3,2500, 10.0F, 3.5F, 10);
	//material, harvestlevel, durability, speed, damage, enchantability(how much you get good enchants)
	
	//ArmorMaterials
	public static final ArmorMaterial ARMOR_MATERIAL_MAGIX = EnumHelper.addArmorMaterial("armor_material_magix", Reference.MOD_ID + ":magix", 16, new int[] {4,9,7,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	
	//add modded items in game
	//DON"T FORGET TO: Add <name>.json and make entry into EN_US.lang
	public static final Item ORB = new ItemBase("orb");
	public static final Item TEST = new ItemBase("test");
	public static final Item MAGIXDUST = new ItemBase("magix_dust");
	public static final Item CONCENTRATEDAVERAGEMATTER = new ItemBase("concentrated_unstable_average_matter");
	public static final Item AVERAGEMATTER = new ItemBase("unstable_average_matter");
	public static final Item MAXIGINGOT = new ItemBase("magix_ingot");
	
	public static final Item MOONSTONE = new ItemBase("moonstone");
	public static final Item MOONSTONEDUST = new ItemBase("moonstone_dust");
	
	public static final Item SUNSTONE = new ItemBase("sunstone");
	public static final Item SUNSTONEDUST = new ItemBase("sunstone_dust");	
	
	
	
	//Tools
	
	//magix
	public static final ItemSword MAGIX_SWORD = new ToolSword("magix_sword",MATERIAL_MAGIX);
	public static final ItemSpade MAGIX_SPADE = new ToolSpade("magix_shovel",MATERIAL_MAGIX);
	public static final ItemSpade MAGIX_PICKAXE = new ToolSpade("magix_pickaxe",MATERIAL_MAGIX);
	public static final ItemSpade MAGIX_AXE = new ToolSpade("magix_axe",MATERIAL_MAGIX);
	
	
	

	//Armor
	
	//magix
	public static final Item MAGIX_HELMET = new ArmorBase("magix_helmet",ARMOR_MATERIAL_MAGIX,1,EntityEquipmentSlot.HEAD); 
	public static final Item MAGIX_CHESTPLATE = new ArmorBase("magix_chestplate",ARMOR_MATERIAL_MAGIX,1,EntityEquipmentSlot.CHEST);
	public static final Item MAGIX_LEGGINGS = new ArmorBase("magix_leggings",ARMOR_MATERIAL_MAGIX,2,EntityEquipmentSlot.LEGS);
	public static final Item MAGIX_BOOTS = new ArmorBase("magix_boots",ARMOR_MATERIAL_MAGIX,1,EntityEquipmentSlot.FEET);
	
}

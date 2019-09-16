package com.mezzo.cursedgift.blocks;

import java.util.Random;

import com.mezzo.cursedgift.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

//Advanced info moet in een aparte class, hele ding copy dus

public class Moonstone_Ore_Block extends BlockBase
{
	
	public Moonstone_Ore_Block(String name, Material material)
	{
		super(name,material);
		
		setSoundType(SoundType.STONE); 	//soundtype, self explanatory
		setHardness(2.0F); 				//tijd die het kost een block te breken, hoger getal duurt langer
		setResistance(15.0F);			//tnt resistance, hoger getal is meer resistance
		setHarvestLevel("pickaxe",2);   //Dit geeft aan met wat het block gebroken kan, levels staan aangegeven in exclipse
		//setLightLevel(3.0F);			//Het block geeft licht, het nummer geeft aan hoe ver het komt (glowstone is 15 e.g.)
		//setLightOpacity(1);			//Laat licht door
		//setBlockUnbreakable;			//maakt block unbreakable(Bedrock)
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.MOONSTONEDUST; 
       }
  
  public int quantityDropped(IBlockState state, int fortune, Random random) {
        return 2;               
       }
	
}

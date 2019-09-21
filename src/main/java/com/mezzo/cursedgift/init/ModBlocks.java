package com.mezzo.cursedgift.init;

import java.util.ArrayList;
import java.util.List;

import com.mezzo.cursedgift.blocks.BlockBase;
import com.mezzo.cursedgift.blocks.Moonstone_Ore_Block;
import com.mezzo.cursedgift.blocks.Orb_Block;
import com.mezzo.cursedgift.blocks.Research_Table_Block;
import com.mezzo.cursedgift.blocks.Sunstone_Ore_Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	//List of blocks
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ADD BLOCK
	//Material provides sound and hardness level
	
	
	//copy and paste this if you want to add a new block, dont forget JSON
	
	public static final Block ORB_BLOCK = new Orb_Block("orb_block", Material.IRON);
	
	public static final Block MOONSTONE_ORE_BLOCK = new Moonstone_Ore_Block("moonstone_ore_block", Material.IRON);
	
	public static final Block SUNSTONE_ORE_BLOCK = new Sunstone_Ore_Block("sunstone_ore_block", Material.IRON);
	
	//zoals dit -->  public static final Block EENBLOK = new BlockClassNaam("eenblock", Material.?);
	
	
	public static final Block RESEARCH_TABLE = new Research_Table_Block("research_table_block", Material.WOOD);
}

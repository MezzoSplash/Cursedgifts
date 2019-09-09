package com.mezzo.cursedgift.init;

import java.util.ArrayList;
import java.util.List;

import com.mezzo.cursedgift.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	//List of blocks
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ADD BLOCK
	//Material provides sound and hardness level
	
	//copy and paste this if you want to add a new block, dont forget JSON
	public static final Block ORB_BLOCK = new BlockBase("orb_block", Material.IRON);
	//zoals dit -->  public static final Block EENBLOK = new BlockBase("eenblock", Material.?);
}

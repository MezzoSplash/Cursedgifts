package com.mezzo.cursedgift.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Research_Table_Block extends BlockBase
{
	public static final AxisAlignedBB RESEARCH_TABLE_AABB = new AxisAlignedBB(0, 0, 0.125D, 1.0D, 1.0D, 0.9375);
	
	public Research_Table_Block(String name, Material material) 
	{
		super(name, material);
	}

	
	@Override
	public boolean isOpaqueCube(IBlockState state) {return false;} //sets opaque block
	
	@Override
	public boolean isFullCube(IBlockState state) {return false;} //enables custom modeling in json's
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return RESEARCH_TABLE_AABB;
	}
}

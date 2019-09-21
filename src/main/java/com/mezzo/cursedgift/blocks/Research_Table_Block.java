package com.mezzo.cursedgift.blocks;

import com.mezzo.cursedgift.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Research_Table_Block extends BlockBase
{
	// adjusting hitbox, doesn't work well with directional stuff public static final AxisAlignedBB RESEARCH_TABLE_AABB = new AxisAlignedBB(0, 0, 0.125D, 1.0D, 1.0D, 0.9375);
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL); //if goes wrong remove
	
	public Research_Table_Block(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.WOOD); 
		setHardness(0.5F);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(FACING, EnumFacing.NORTH)); //if cant figure out remove
	}

	
		
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {return false;} //sets opaque block
	
	@Override
	public boolean isFullCube(IBlockState state) {return false;} //enables custom modeling in json's
	
		
//@Override
//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
//{
//	return RESEARCH_TABLE_AABB;
//}
	
	
	//Ik kan dit stuk wel proberen uit te leggen maar ik snap het maar voor 50%
	
	
	@Override
	protected BlockStateContainer createBlockState() {
	    return new BlockStateContainer(this, new IProperty[] { FACING });  //Dit is een ding dat gedaan moet worden
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)); //Dit zorgt dat ie horizontale direction meeneemt
	}

	@Override
	public int getMetaFromState(IBlockState state) {
	    EnumFacing facing = (EnumFacing) state.getValue(FACING); //Dit geeft de json door welke blockstate ie nodig heeft
	    return facing.getHorizontalIndex();
	}

	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
	    float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
	return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand).withProperty(FACING, placer.getHorizontalFacing()); //dit stuk zorgt dat de game weet welke directie de player het block plaatst
	}

	@Override
	public void registerModels() {
	    Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory"); //dit registered het block correct
	}
}
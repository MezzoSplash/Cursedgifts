package com.mezzo.cursedgift.world;

import java.util.Random;

import com.mezzo.cursedgift.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	
	//override normal generation
	@Override
	public void generate(Random random,int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider) 
	{
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkgenerator, chunkprovider);
		}		
	}
	
	private void generateOverworld(Random random,int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider) 
	{
		//set generation and 
		generateOre(ModBlocks.MOONSTONE_ORE_BLOCK.getDefaultState(), world, random, chunkX*16, chunkZ*16, 36, 38, random.nextInt(3)+1, 6);
		generateOre(ModBlocks.SUNSTONE_ORE_BLOCK.getDefaultState(), world, random, chunkX*16, chunkZ*16, 36, 38, random.nextInt(3)+1, 6);
	}
	
	
	//going over the chunk in certain Y between maxY and minY
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++){
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
		
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	

}

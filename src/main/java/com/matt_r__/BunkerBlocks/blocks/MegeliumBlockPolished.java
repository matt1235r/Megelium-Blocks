package com.matt_r__.BunkerBlocks.blocks;

import java.util.Random;

import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.creativetabs.Legacy;
import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MegeliumBlockPolished extends BlockBase implements IHasModel{

	public MegeliumBlockPolished(String name, Material material) {

		super(name, material);
		setCreativeTab(BuildingBlocksCreativeTab.tabBlocks);
		setSoundType(SoundType.METAL);
		setHardness(100.0F);
		setResistance(12000F);
		setHarvestLevel("pickaxe", 6);
		
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(ModBlocks.MEGELIUM_BLOCK);
		//Cut for new ALPHA. NEEDS TO BE FIXED WHEN MODBLOCKS ADDED BACK.
		//return Item.getItemFromBlock(ModBlocks.MEGELIUM_SLAB_HALF);
	}

}

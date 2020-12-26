package com.matt_r__.BunkerBlocks.blocks;

import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.creativetabs.Legacy;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MegeliumBlock extends BlockBase implements IHasModel{

	public MegeliumBlock(String name, Material material) {

		super(name, material);
		setCreativeTab(BuildingBlocksCreativeTab.tabBlocks);
		setSoundType(SoundType.METAL);
		setHardness(100.0F);
		setResistance(12000F);
		setHarvestLevel("pickaxe", 6);
		
	}

}

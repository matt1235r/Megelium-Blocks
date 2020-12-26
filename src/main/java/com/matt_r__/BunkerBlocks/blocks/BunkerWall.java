package com.matt_r__.BunkerBlocks.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BunkerWall extends BlockBase{

	public BunkerWall(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(100.0F);
		setResistance(12000F);
		setHarvestLevel("pickaxe", 6);
		
	}

}

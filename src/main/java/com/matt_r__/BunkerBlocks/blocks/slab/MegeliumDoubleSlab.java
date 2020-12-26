package com.matt_r__.BunkerBlocks.blocks.slab;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MegeliumDoubleSlab extends MegeliumSlab{

	public MegeliumDoubleSlab(String name, Material material) {
		super(name, material);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean isDouble() {
		return true;
		
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	
}

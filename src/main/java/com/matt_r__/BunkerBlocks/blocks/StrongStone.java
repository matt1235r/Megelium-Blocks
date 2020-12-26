package com.matt_r__.BunkerBlocks.blocks;

import java.util.Random;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.creativetabs.Legacy;
import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class StrongStone extends Block implements IHasModel{

	public StrongStone(String name, Material material) {
		super(material);
		
		setSoundType(SoundType.METAL);
		setHardness(70.0F);
		setResistance(6F);
		setHarvestLevel("pickaxe", 3);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BuildingBlocksCreativeTab.tabBlocks);
		ModBlocks.blocks.add(this);
		ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	

}

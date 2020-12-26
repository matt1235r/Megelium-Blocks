package com.matt_r__.BunkerBlocks.blocks;

import java.awt.Color;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MegeliumFence extends BlockFence implements IHasModel{

	public MegeliumFence(String name, Material material) {
		super(material, material.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BuildingBlocksCreativeTab.tabBlocks);
		setSoundType(SoundType.METAL);
		setHardness(100.0F);
		setResistance(12000F);
		setHarvestLevel("pickaxe", 6);
		ModBlocks.blocks.add(this);
		ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	
}

package com.matt_r__.BunkerBlocks.creativetabs;

import com.matt_r__.BunkerBlocks.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildingBlocksCreativeTab {

	public static CreativeTabs tabBlocks = new CreativeTabs("bunkerbuildingblocks"){

		  public ItemStack getTabIconItem() {
				
			  return new ItemStack(Item.getItemFromBlock(ModBlocks.MEGELIUM_BLOCK));

		  }
	};




}

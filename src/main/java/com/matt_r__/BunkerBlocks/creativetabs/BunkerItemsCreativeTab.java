package com.matt_r__.BunkerBlocks.creativetabs;

import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BunkerItemsCreativeTab {

	public static CreativeTabs tabItems = new CreativeTabs("bunkersupplies"){

		  public ItemStack getTabIconItem() {
				
			  return new ItemStack(ModItems.FALLOUT_SIGN);

		  }
	};
	
}

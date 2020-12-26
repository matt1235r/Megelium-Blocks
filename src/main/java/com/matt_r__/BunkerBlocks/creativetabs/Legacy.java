package com.matt_r__.BunkerBlocks.creativetabs;

import com.matt_r__.BunkerBlocks.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Legacy {

	public static CreativeTabs tabLegacy = new CreativeTabs("bunkerlegacy"){

		  public ItemStack getTabIconItem() {
				
			  return new ItemStack(ModItems.FALLOUT_SIGN);

		  }
	};
}

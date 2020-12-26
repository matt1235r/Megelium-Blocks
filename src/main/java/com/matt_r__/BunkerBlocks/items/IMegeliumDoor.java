package com.matt_r__.BunkerBlocks.items;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BunkerItemsCreativeTab;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IMegeliumDoor extends Item implements IHasModel{

	public IMegeliumDoor(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BunkerItemsCreativeTab.tabItems);
		
		
		ModItems.items.add(this);
	}
	
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

package com.matt_r__.BunkerBlocks.food;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BunkerItemsCreativeTab;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.item.ItemFood;

public class Nugget extends ItemFood implements IHasModel{

	public Nugget(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		
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

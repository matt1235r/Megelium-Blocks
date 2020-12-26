package com.matt_r__.BunkerBlocks.blocks;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.creativetabs.Legacy;
import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MegeliumGlassPane extends BlockPane implements IHasModel{

public MegeliumGlassPane(String name, Material material) {
	super(material, false);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(BuildingBlocksCreativeTab.tabBlocks);
	
	setSoundType(SoundType.METAL);
	setHardness(60.0F);
	setResistance(7000F);
	setHarvestLevel("pickaxe", 6);
	ModBlocks.blocks.add(this);
	ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}

public void registerModels() {
	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	
}

}

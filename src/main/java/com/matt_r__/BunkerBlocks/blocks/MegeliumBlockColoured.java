package com.matt_r__.BunkerBlocks.blocks;

import com.matt_r__.BunkerBlocks.Main;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.creativetabs.Legacy;
import com.matt_r__.BunkerBlocks.init.ModBlocks;
import com.matt_r__.BunkerBlocks.init.ModItems;
import com.matt_r__.BunkerBlocks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MegeliumBlockColoured extends BlockColored implements IHasModel{

	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	
	
	public MegeliumBlockColoured(String name, Material material) {		
		super(material);
		setUnlocalizedName(name);
		setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
        setCreativeTab(CreativeTabs.FOOD);
        ModBlocks.blocks.add(this);
		ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		//ModBlocks.blocks.add(this);
		//ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));    
	    
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	public int getMetaFromState(IBlockState state)
    {
        return ((EnumDyeColor)state.getValue(COLOR)).getMetadata();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR});
    }

	

}

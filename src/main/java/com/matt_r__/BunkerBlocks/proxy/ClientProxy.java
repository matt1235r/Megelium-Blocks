package com.matt_r__.BunkerBlocks.proxy;

import com.matt_r__.BunkerBlocks.blocks.MegeliumBrick;
import com.matt_r__.BunkerBlocks.util.EnumColor;
import com.matt_r__.BunkerBlocks.util.Refrence;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	    //ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Refrence.MOD_ID + ":" + id, "inventory"));
	}
		
	
	
	public void PreInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain(Refrence.MOD_ID);
		
	}
//	
//	@Override
//	
    public void registerBlockRender(Block block) {
        if (block instanceof MegeliumBrick) {
            for (EnumColor color : EnumColor.values()) {
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), color.getMetadata(), new ModelResourceLocation(block.getRegistryName(), "color="+color.getName()));
            }
        } else {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}

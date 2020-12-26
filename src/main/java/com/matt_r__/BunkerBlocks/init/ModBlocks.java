package com.matt_r__.BunkerBlocks.init;

import java.util.ArrayList;
import java.util.List;

import com.matt_r__.BunkerBlocks.blocks.MegeliumBlock;
import com.matt_r__.BunkerBlocks.blocks.MegeliumBlockColoured;
import com.matt_r__.BunkerBlocks.blocks.MegeliumBlockPolished;
import com.matt_r__.BunkerBlocks.blocks.MegeliumBrick;
import com.matt_r__.BunkerBlocks.blocks.MegeliumBrick3;
import com.matt_r__.BunkerBlocks.blocks.MegeliumDoor;
import com.matt_r__.BunkerBlocks.blocks.MegeliumFence;
import com.matt_r__.BunkerBlocks.blocks.MegeliumGlass;
import com.matt_r__.BunkerBlocks.blocks.MegeliumGlassPane;
import com.matt_r__.BunkerBlocks.blocks.MegeliumStairs;
import com.matt_r__.BunkerBlocks.blocks.StrongStone;
import com.matt_r__.BunkerBlocks.blocks.slab.MegeliumDoubleSlab;
import com.matt_r__.BunkerBlocks.blocks.slab.MegeliumHalfSlab;
import com.matt_r__.BunkerBlocks.blocks.slab.MegeliumSlab;
import com.matt_r__.BunkerBlocks.creativetabs.BuildingBlocksCreativeTab;
import com.matt_r__.BunkerBlocks.blocks.BunkerGlass;
import com.matt_r__.BunkerBlocks.blocks.BunkerWall;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespacedDefaultedByKey;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks 
{

	
	public static final List<Block> blocks = new ArrayList<Block>();
	public static final Block BLUE_BUNKER_WALL = new BunkerWall("blue_bunker_wall", Material.ROCK);
	public static final Block BUNKER_WALL = new BunkerWall("bunker_wall", Material.ROCK);
	public static final Block GREEN_BUNKER_WALL = new BunkerWall("green_bunker_wall", Material.ROCK);
	public static final Block REINFORCED_BUNKER_GLASS = new BunkerGlass("reinforced_bunker_glass", Material.ROCK);
	public static final Block LIGHT_BLUE_BUNKER_WALL = new BunkerWall("light_blue_bunker_wall", Material.ROCK);
	public static final Block LIGHT_GREY_BUNKER_WALL = new BunkerWall("light_grey_bunker_wall", Material.ROCK);
	public static final Block LIME_BUNKER_WALL = new BunkerWall("lime_bunker_wall", Material.ROCK);
	public static final Block RED_BUNKER_WALL = new BunkerWall("red_bunker_wall", Material.ROCK);
	public static final Block DARK_GREY_BUNKER_WALL = new BunkerWall("dark_grey_bunker_wall", Material.ROCK);
	public static final Block WHITE_BUNKER_WALL = new BunkerWall("white_bunker_wall", Material.ROCK);
	
	//public static final Block MEGELIUM_BLOC_COL = new MegeliumBlockColoured("bloc_col", Material.CLOTH);
	//registerBlock(1000, "block_col", (new MegeliumBlockColoured("bloc_col", Material.CLOTH)).setHardness(0.8F).setUnlocalizedName("bloc_col"));
	public static final Block MEGELIUM_BLOCK = new MegeliumBlock("megelium_block", Material.ROCK);
	public static final Block POLISHED_MEGELIUM = new MegeliumBlockPolished("megelium_polished", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_WHITE = new MegeliumBlock("megelium_polished_white", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_ORANGE = new MegeliumBlock("megelium_polished_orange", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_MAGENTA = new MegeliumBlock("megelium_polished_magenta", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_LIGHT_BLUE = new MegeliumBlock("megelium_polished_light_blue", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_YELLOW = new MegeliumBlock("megelium_polished_yellow", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_LIME = new MegeliumBlock("megelium_polished_lime", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_PINK = new MegeliumBlock("megelium_polished_pink", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_GREY = new MegeliumBlock("megelium_polished_grey", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_LIGHT_GREY = new MegeliumBlock("megelium_polished_light_grey", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_CYAN = new MegeliumBlock("megelium_polished_cyan", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_PURPLE = new MegeliumBlock("megelium_polished_purple", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_BLUE = new MegeliumBlock("megelium_polished_blue", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_BROWN = new MegeliumBlock("megelium_polished_brown", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_GREEN = new MegeliumBlock("megelium_polished_green", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_RED = new MegeliumBlock("megelium_polished_red", Material.ROCK);
	//public static final Block POLISHED_MEGELIUM_BLACK = new MegeliumBlock("megelium_polished_black", Material.ROCK);
	public static final Block MEGELIUM_FENCE = new MegeliumFence("megelium_fence", Material.ROCK);
	public static final Block MEGELIUM_GLASS = new MegeliumGlass("megelium_glass", Material.GLASS);
	public static final Block MEGELIUM_STONE = new StrongStone("megelium_stone", Material.ROCK);
	public static final Block MEGELIUM_STAIRS = new MegeliumStairs("megelium_stairs", MEGELIUM_BLOCK.getDefaultState());
	
	
	public static final Block MEGELIUM_GLASS_PANE = new MegeliumGlassPane("megelium_glass_pane", Material.GLASS);
	
	public static final Block MEGELIUM_BRICK = new MegeliumBrick3("megelium_brick", Material.GLASS);
	
	
	//public static final MegeliumHalfSlab MEGELIUM_SLAB_HALF = new MegeliumHalfSlab("megelium_slab_half", Material.ROCK);
	//public static final MegeliumDoubleSlab MEGELIUM_SLAB_DOUBLE = new MegeliumDoubleSlab("megelium_slab_double", Material.ROCK);
	
	//public static final MegeliumDoor MEGELIUM_DOOR = new MegeliumDoor("megelium_door", Material.ROCK);
	
    
}

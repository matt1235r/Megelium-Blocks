package com.matt_r__.BunkerBlocks.init;

import java.util.ArrayList;
import java.util.List;

import com.matt_r__.BunkerBlocks.food.Nugget;
import com.matt_r__.BunkerBlocks.items.IMegeliumDoor;
import com.matt_r__.BunkerBlocks.items.ItemBase;
import com.matt_r__.BunkerBlocks.tools.MegeliumPickaxe;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	
	
	//Material
	public static final ToolMaterial MATERIAL_MEGELIUM = EnumHelper.addToolMaterial("MEGELIUM", 6, 150, 10.0F, 1F, 0);
	public static final List<Item> items = new ArrayList<Item>();
	
	public static final Item FRIED_NUGGET = new Nugget("fried_nugget", 1, true);
	//public static final Item RUBY = new ItemBase("ruby");
	public static final Item FALLOUT_SIGN = new ItemBase("fallout_sign");
	//public static final Item MEGELIUM_INGOT = new ItemBase("megelium_ingot");
	public static final Item MEGELIUM_ROD = new ItemBase("megelium_rod");
	
	//Tools
	public static final ItemPickaxe MEGELIUM_PICKAXE = new MegeliumPickaxe("megelium_pickaxe", MATERIAL_MEGELIUM);
	
	public static final Item MEGELIUM_DOOR = new IMegeliumDoor("megelium_door");
}

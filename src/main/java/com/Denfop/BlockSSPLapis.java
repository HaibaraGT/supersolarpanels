package com.Denfop;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
public class BlockSSPLapis extends Block{

	public BlockSSPLapis(Material material) {
		super(material);
		this.setCreativeTab(SuperSolarPanels.tabssp);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(0.3F);
		this.setLightLevel(0.3F);
		this.setStepSound(Block.soundTypeGlass);
	}
	public int quantityDropped(Random random) {
	    return 1 ;
	  }
	  
	
	  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		  return Item.getItemFromBlock(Blocks.lapis_ore);
		    		
		  }
}

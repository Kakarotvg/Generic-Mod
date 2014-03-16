package com.cjk.genericmod.handlers.blocks;

import com.cjk.genericmod.blocks.Genericblock;
import com.cjk.genericmod.handlers.creativetab.CreativeTabHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {

    public static Block timestone;
    public static Block timeore;

    public static void configureBlock() {
        timestone = new Genericblock(Material.iron).setBlockName("timestone").setCreativeTab(CreativeTabHandler.timetab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        timeore = new Genericblock(Material.rock).setBlockName("timeore").setCreativeTab(CreativeTabHandler.timetab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(timestone, "timestone");
        registry.registerBlock(timeore, "timeore");

    }

    public static void setHarvestLevel() {
        timestone.setHarvestLevel("pickaxe", 4);
        timeore.setHarvestLevel("pickaxe", 3);
    }

}

package com.cjk.genericmod.handlers.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cjk.genericmod.handlers.armor.ArmorHandler;
import com.cjk.genericmod.handlers.blocks.BlockHandler;
import com.cjk.genericmod.handlers.items.ItemHandler;
import com.cjk.genericmod.handlers.tools.ToolHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

    public static void addCrafting(GameRegistry registry) {
        registry.addRecipe(new ItemStack(BlockHandler.timestone, 1), "ttt", "ttt", "ttt", 't', ItemHandler.timeshard);
        registry.addShapelessRecipe(new ItemStack(ItemHandler.timeshard, 4), new Object[] { BlockHandler.timestone });
        registry.addRecipe(new ItemStack(ToolHandler.timeaxe, 1), "TT ", "Ts ", " s ", 'T', ItemHandler.timeingot, 's', Items.stick);
        registry.addRecipe(new ItemStack(ToolHandler.timehoe, 1), "TT ", " s ", " s ", 'T', ItemHandler.timeingot, 's', Items.stick);
        registry.addRecipe(new ItemStack(ToolHandler.timeshovel, 1), " T ", " s ", " s ", 'T', ItemHandler.timeingot, 's', Items.stick);
        registry.addRecipe(new ItemStack(ToolHandler.timesword, 1), "gTg", "gTg", " s ", 'T', ItemHandler.timeingot, 's', Items.stick, 'g', Items.gold_ingot);
        registry.addRecipe(new ItemStack(ToolHandler.timepickaxe, 1), "TTT", " s ", " s ", 'T', ItemHandler.timeingot, 's', Items.stick);
        registry.addRecipe(new ItemStack(ArmorHandler.timehelm, 1), "TTT", "T T", "   ", 'T', ItemHandler.timeingot);
        registry.addRecipe(new ItemStack(ArmorHandler.timeplate, 1), "T T", "TTT", "TTT", 'T', ItemHandler.timeingot);
        registry.addRecipe(new ItemStack(ArmorHandler.timelegs, 1), "TTT", "T T", "T T", 'T', ItemHandler.timeingot);
        registry.addRecipe(new ItemStack(ArmorHandler.timeboots, 1), "   ", "T T", "T T", 'T', ItemHandler.timeingot);
    }

    public static void addSmelting(GameRegistry registry) {
        registry.addSmelting(BlockHandler.timeore, new ItemStack(ItemHandler.timeshard), 5.0F);
        registry.addSmelting(BlockHandler.timestone, new ItemStack(ItemHandler.timeingot), 5.0F);

    }

}

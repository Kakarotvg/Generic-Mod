package com.cjk.genericmod.handlers.items;

import com.cjk.genericmod.handlers.creativetab.CreativeTabHandler;
import com.cjk.genericmod.items.GenericItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    public static Item timeshard;
    public static Item timeingot;

    public static void configureItems() {
        timeshard = new GenericItem().setUnlocalizedName("timeshard").setCreativeTab(CreativeTabHandler.timetab);
        timeingot = new GenericItem().setUnlocalizedName("timeingot").setCreativeTab(CreativeTabHandler.timetab);
    }

    public static void registerItems(GameRegistry registry) {
        registry.registerItem(timeshard, "timeshard");
        registry.registerItem(timeingot, "timeingot");
    }
}

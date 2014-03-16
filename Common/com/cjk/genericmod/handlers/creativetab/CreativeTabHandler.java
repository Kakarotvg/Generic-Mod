package com.cjk.genericmod.handlers.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.cjk.genericmod.handlers.blocks.BlockHandler;

public class CreativeTabHandler {

    public static CreativeTabs timetab = new CreativeTabs("timetab") {
        public Item getTabIconItem() {
            return Item.getItemFromBlock(BlockHandler.timestone);
        }
    };

}

package com.cjk.genericmod.handlers.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.cjk.genericmod.handlers.creativetab.CreativeTabHandler;
import com.cjk.genericmod.tools.Genericaxe;
import com.cjk.genericmod.tools.Generichoe;
import com.cjk.genericmod.tools.Genericpickaxe;
import com.cjk.genericmod.tools.Genericshovel;
import com.cjk.genericmod.tools.Genericsword;

import cpw.mods.fml.common.registry.GameRegistry;

public class ToolHandler {

    public static Item timeaxe;
    public static Item timehoe;
    public static Item timeshovel;
    public static Item timesword;
    public static Item timepickaxe;

    public static ToolMaterial TIMETOOLS = EnumHelper.addToolMaterial("TIMETOOLS", 6, 3000, 12, 15, 10);
    public static ToolMaterial TIMESWORD = EnumHelper.addToolMaterial("TIMESWORD", 6, 3100, 12, 20, 10);

    public static void configureTools() {
        timeaxe = new Genericaxe(TIMETOOLS).setUnlocalizedName("timeaxe").setCreativeTab(CreativeTabHandler.timetab);
        timehoe = new Generichoe(TIMETOOLS).setUnlocalizedName("timehoe").setCreativeTab(CreativeTabHandler.timetab);
        timeshovel = new Genericshovel(TIMETOOLS).setUnlocalizedName("timeshovel").setCreativeTab(CreativeTabHandler.timetab);
        timesword = new Genericsword(TIMESWORD).setUnlocalizedName("timesword").setCreativeTab(CreativeTabHandler.timetab);
        timepickaxe = new Genericpickaxe(TIMETOOLS).setUnlocalizedName("timepickaxe").setCreativeTab(CreativeTabHandler.timetab);
    }

    public static void registerTools(GameRegistry register) {
        register.registerItem(timeaxe, "timeaxe");
        register.registerItem(timehoe, "timehoe");
        register.registerItem(timeshovel, "timeshovel");
        register.registerItem(timesword, "timesword");
        register.registerItem(timepickaxe, "timepickaxe");
    }

}

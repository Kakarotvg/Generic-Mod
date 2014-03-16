package com.cjk.genericmod.handlers.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.cjk.genericmod.Generic;
import com.cjk.genericmod.armor.GenericArmor;
import com.cjk.genericmod.handlers.creativetab.CreativeTabHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorHandler {

    public static Item timehelm;
    public static Item timeplate;
    public static Item timelegs;
    public static Item timeboots;

    public static ArmorMaterial TIMEARMOR = EnumHelper.addArmorMaterial("TIMEARMOR", 2200, new int[] { 8, 13, 11, 8 }, 10);

    public static void configureArmor() {
        timehelm = new GenericArmor(TIMEARMOR, Generic.proxy.addArmor("TIMEARMOR"), 0, "TIMEARMOR_1").setUnlocalizedName("timehelm").setCreativeTab(CreativeTabHandler.timetab);
        timeplate = new GenericArmor(TIMEARMOR, Generic.proxy.addArmor("TIMEARMOR"), 1, "TIMEARMOR_1").setUnlocalizedName("timeplate").setCreativeTab(CreativeTabHandler.timetab);
        timelegs = new GenericArmor(TIMEARMOR, Generic.proxy.addArmor("TIMEARMOR"), 2, "TIMEARMOR_2").setUnlocalizedName("timelegs").setCreativeTab(CreativeTabHandler.timetab);
        timeboots = new GenericArmor(TIMEARMOR, Generic.proxy.addArmor("TIMEARMOR"), 3, "TIMEARMOR_1").setUnlocalizedName("timeboots").setCreativeTab(CreativeTabHandler.timetab);

    }

    public static void registerArmor(GameRegistry registry) {
        registry.registerItem(timehelm, "timehelm");
        registry.registerItem(timeplate, "timeplate");
        registry.registerItem(timelegs, "timelegs");
        registry.registerItem(timeboots, "timeboots");
    }

}

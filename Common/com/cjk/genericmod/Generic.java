package com.cjk.genericmod;

import com.cjk.genericmod.generation.WorldGen;
import com.cjk.genericmod.handlers.armor.ArmorHandler;
import com.cjk.genericmod.handlers.blocks.BlockHandler;
import com.cjk.genericmod.handlers.crafting.CraftingHandler;
import com.cjk.genericmod.handlers.creativetab.CreativeTabHandler;
import com.cjk.genericmod.handlers.items.ItemHandler;
import com.cjk.genericmod.handlers.tools.ToolHandler;
import com.cjk.genericmod.proxys.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_V, name = Reference.MOD_N)
public class Generic {

    @Instance
    public static Generic instance;

    @SidedProxy(clientSide = "com.cjk.genericmod.proxys.ClientProxy", serverSide = "com.cjk.genericmod.proxys.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        BlockHandler.configureBlock();
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.setHarvestLevel();

        ItemHandler.configureItems();
        ItemHandler.registerItems(new GameRegistry());

        ToolHandler.configureTools();
        ToolHandler.registerTools(new GameRegistry());

        ArmorHandler.configureArmor();
        ArmorHandler.registerArmor(new GameRegistry());

        CraftingHandler.addCrafting(new GameRegistry());
        CraftingHandler.addSmelting(new GameRegistry());

        GameRegistry.registerWorldGenerator(new WorldGen(), 0);

        proxy.Init();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

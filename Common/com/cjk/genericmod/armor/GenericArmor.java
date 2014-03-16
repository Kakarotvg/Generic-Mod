package com.cjk.genericmod.armor;

import com.cjk.genericmod.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GenericArmor extends ItemArmor {
    String armorfile;

    public GenericArmor(ArmorMaterial armormaterial, int par3, int par4, String armorfile) {
        super(armormaterial, par3, par4);

        this.armorfile = armorfile;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (armorfile == null)
            return null;

        return (Reference.MOD_ID + ":" + "textures/armor/" + armorfile + ".png");

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register) {
        this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}

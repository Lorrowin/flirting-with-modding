package com.lorrowin.niabowpia.block;

import com.lorrowin.niabowpia.NBPCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block
{
    public BlockBase(String regName, Material material, float hardness, float resistance)
    {
        super(material);
        this.setRegistryName(regName);
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setCreativeTab(NBPCreativeTabs.tabNiaBowPia);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
}

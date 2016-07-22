package com.lorrowin.niabowpia.block;

import java.util.Random;

import com.lorrowin.niabowpia.item.ItemRegister;


import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOpalBoulder extends BlockBase

{
    public BlockOpalBoulder()
    {
        super("BlockOpalBoulder", Material.ROCK, 2.0f, 10.0f);
        this.setLightLevel(0.4f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState blockstate, Random random, int fortune)
    {
        return ItemRegister.itemUnpolishedOpal;
    }
    @Override
    public int quantityDropped(IBlockState blockState,int fortune, Random random)
    {
        return 1 + fortune;
    }
}

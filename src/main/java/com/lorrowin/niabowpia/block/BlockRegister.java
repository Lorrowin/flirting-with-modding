package com.lorrowin.niabowpia.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class BlockRegister
{
    public static Block blockOpalBoulder;
    public static ItemBlock itemBlockOpalBoulder;

    /**
     *
     */
    public static void createBlock ()

    {
        blockOpalBoulder = new BlockOpalBoulder();
        itemBlockOpalBoulder = new ItemBlock(blockOpalBoulder);
        itemBlockOpalBoulder.setRegistryName("blockOpalBoulder");
        GameRegistry.register(blockOpalBoulder);
        GameRegistry.register(itemBlockOpalBoulder);



    }
}

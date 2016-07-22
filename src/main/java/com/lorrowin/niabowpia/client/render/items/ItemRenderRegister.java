package com.lorrowin.niabowpia.client.render.items;

import com.lorrowin.niabowpia.item.ItemRegister;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRenderRegister
{
    public static void registerItemRenderer()
    {
      reg(ItemRegister.itemUnpolishedOpal);
    }

    public static void reg(Item item)
    {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, itemModelResourceLocation);
    }
}
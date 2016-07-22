package com.lorrowin.niabowpia;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.lorrowin.niabowpia.item.ItemRegister;
import com.lorrowin.niabowpia.utils.VersionInfo;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NBPCreativeTabs
{
    public static final CreativeTabs tabNiaBowPia = new CreativeTabs(VersionInfo.ModId)
    {
        @Override
        public Item getTabIconItem()
        {
            return ItemRegister.itemUnpolishedOpal;
        }
    };
}
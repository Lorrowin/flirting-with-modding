package com.lorrowin.niabowpia.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
//import net.minecraft.item.Item.ToolMaterial;
//import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class ItemRegister
{
    public static Item itemUnpolishedOpal;


    //public static Item itemPolishedOpal;
    //public static Item itemGuideBook;
    //public static Item itemOpalStaff;//

    //Eventually;
    //public static ToolMaterial OPAL = EnumHelper.addToolMaterial("POLISHEDOPAL", 2, 500, 10.0F, 2.0F, 18);

    public static List<Item> registeredItems;

    public static final void createItems()
    {
        registeredItems = new ArrayList<Item>();

        GameRegistry.register(itemUnpolishedOpal = new ItemUnpolishedOpal());
    }

    private static Item registerItem(Item item, String oreDict)
    {
        OreDictionary.registerOre(oreDict, registerItem(item));

        return item;
    }
    private static Item registerItem(Item item)
    {
        GameRegistry.register(item);
        registeredItems.add(item);

        return item;
    }
}
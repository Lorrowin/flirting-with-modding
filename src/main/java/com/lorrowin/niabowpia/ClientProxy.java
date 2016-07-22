package com.lorrowin.niabowpia;

import com.lorrowin.niabowpia.client.render.blocks.BlockRenderRegister;
import com.lorrowin.niabowpia.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);

        //ItemRenderRegister.registerItemRenderer();
        //BlockRenderRegister.registerBlockRenderer();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);

        //ItemRenderRegister.registerItemRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
package com.lorrowin.niabowpia;

import com.lorrowin.niabowpia.world.OpalWorldGenerator;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    private Config modConfig;

    public void preInit(FMLPreInitializationEvent e)
    {

    }

    public void init(FMLInitializationEvent e)
    {
        GameRegistry.registerWorldGenerator(new OpalWorldGenerator(), 0);
    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
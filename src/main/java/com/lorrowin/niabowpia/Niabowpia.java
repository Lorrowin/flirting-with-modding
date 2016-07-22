package com.lorrowin.niabowpia;

import com.lorrowin.niabowpia.utils.VersionInfo;
import com.lorrowin.niabowpia.ClientProxy;
import com.lorrowin.niabowpia.CommonProxy;


import com.sun.jna.platform.win32.Version;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = VersionInfo.ModId,
        name = VersionInfo.ModName,
        version = VersionInfo.Version
)
public class Niabowpia

{
    @SidedProxy(clientSide="com.lorrowin.niabowpia.ClientProxy", serverSide="com.lorrowin.niabowpia.ServerProxy")
    public static CommonProxy proxy;

    @Instance
    public static Niabowpia instance;

    @EventHandler

    public void preInit(FMLPreInitializationEvent event)

    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)

    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)


    {
        proxy.postInit(event);
    }
}
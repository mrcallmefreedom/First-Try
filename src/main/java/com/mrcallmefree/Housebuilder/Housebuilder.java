package com.mrcallmefree.Housebuilder;

import com.mrcallmefree.Housebuilder.proxy.IProxy;
import com.mrcallmefree.Housebuilder.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION )
public class Housebuilder
{
    @Mod.Instance(Reference.MOD_ID)
    public static Housebuilder instance;

    @SidedProxy(clientSide ="com.mrcallmefree.Housebuilder.proxy.ClientProxy",serverSide = "com.mrcallmefree.Housebuilder.proxy.SeverProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent event)
    {

    }
}



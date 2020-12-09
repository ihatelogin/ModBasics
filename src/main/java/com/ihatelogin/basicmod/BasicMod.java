package com.ihatelogin.basicmod;

import com.ihatelogin.basicmod.proxy.IProxy;
import com.ihatelogin.basicmod.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BasicMod {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Mod.Instance(Reference.MOD_ID)
    public static BasicMod instance;

    //Proxy object is used to deal with interactions that only happen on either the server or the client
    @SidedProxy(clientSide = "com.ihatelogin.basicmod.proxy.ClientProxy", serverSide = "com.ihatelogin.basicmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

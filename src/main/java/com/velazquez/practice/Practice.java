package com.velazquez.practice;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid =  Practice.MODID, version = Practice.VERSION)
public class Practice {
    public static final String MODID = "practice";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new BlockBreakEvent());
        MinecraftForge.EVENT_BUS.register(new ExplodingMinecart());
        MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
        MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
    }

}

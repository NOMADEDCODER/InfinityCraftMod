package com.EarlyIslandGames.InfinityCraft;
import net.minecraft.block.Block;
import net.minecraft.launchwrapper.LogWrapper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod(modid = InfinityCraft.MODID, version = InfinityCraft.VERSION)
public class InfinityCraft {
	
	    public static final String MODID = "InfinityCraft";
	    public static final String VERSION = "1.0";
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
			System.out.println("InfinityCraft Loading...");
	    }

}

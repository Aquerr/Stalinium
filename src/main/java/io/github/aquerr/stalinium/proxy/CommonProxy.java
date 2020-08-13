package io.github.aquerr.stalinium.proxy;

import io.github.aquerr.stalinium.block.ModBlocks;
import io.github.aquerr.stalinium.fluid.ModFluids;
import io.github.aquerr.stalinium.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
        ModFluids.init();

        ModItems.register();
        ModFluids.register();

        // Check if TConstruct is loaded, if so, load integration.

        // Check if Construct Armory is loaded, if so, load integration.
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

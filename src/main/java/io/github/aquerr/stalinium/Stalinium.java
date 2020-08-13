package io.github.aquerr.stalinium;

import io.github.aquerr.stalinium.block.ModBlocks;
import io.github.aquerr.stalinium.item.ModItems;
import io.github.aquerr.stalinium.item.StaliniumIngot;
import io.github.aquerr.stalinium.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Stalinium.MODID, name = Stalinium.NAME, version = Stalinium.VERSION)
public class Stalinium
{
    public static final String MODID = "stalinium";
    public static final String NAME = "Stalinium";
    public static final String VERSION = "1.0";

    private static Logger LOGGER;

    @SidedProxy(clientSide = Constants.STALINIUM_CLIENT_PROXY, serverSide = Constants.STALINIUM_COMMON_PROXY)
    public static CommonProxy commonProxy;


    public static final CreativeTabs STALINIUM_TAB = new CreativeTabs("stalinium")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.STALINIUM_INGOT);
        }
    };



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LOGGER = event.getModLog();
        LOGGER.info("Pre initialization...");
        commonProxy.preInit(event);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("Initialization...");
        commonProxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LOGGER.info("Post initialization...");
        commonProxy.postInit(event);
    }

    @SubscribeEvent
    public void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public void onItemRegister(RegistryEvent.Register<Item> event)
    {
        ModBlocks.registerBlockItems(event.getRegistry());
    }
}

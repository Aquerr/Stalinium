package io.github.aquerr.stalinium.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
    public static StaliniumOre STALINIUM_ORE;

    public static void init()
    {
        STALINIUM_ORE = new StaliniumOre();
    }

    public static void register(final IForgeRegistry<Block> registry)
    {
        registry.register(STALINIUM_ORE);
    }

    public static void registerBlockItems(final IForgeRegistry<Item> registry)
    {
        registry.register(new ItemBlock(STALINIUM_ORE).setRegistryName(STALINIUM_ORE.getRegistryName()));
    }

    public static void registerRenders()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STALINIUM_ORE), 0, new ModelResourceLocation(STALINIUM_ORE.getRegistryName(), "inventory"));
    }
}

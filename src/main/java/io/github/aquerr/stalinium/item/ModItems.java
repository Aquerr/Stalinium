package io.github.aquerr.stalinium.item;

import net.minecraft.item.Item;

public class ModItems
{
    public static Item STALINIUM_INGOT;

    public static void init()
    {
        STALINIUM_INGOT = new StaliniumIngot();
    }

    public static void register()
    {

    }

    public static void registerRenders()
    {
    }
}

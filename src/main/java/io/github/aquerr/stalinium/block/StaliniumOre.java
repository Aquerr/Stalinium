package io.github.aquerr.stalinium.block;

import io.github.aquerr.stalinium.Stalinium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class StaliniumOre extends Block
{
    public StaliniumOre()
    {
        super(Material.ROCK);
        setHardness(2);
        setResistance(15F);
        setRegistryName(Stalinium.MODID, "stalinium_ore");
        setCreativeTab(Stalinium.STALINIUM_TAB);
    }

//    @Override
//    protected BlockStateContainer createBlockState()
//    {
//        return new BlockStateContainer(this, new IProperty[] {});
//    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random)
    {
        return 2 + random.nextInt(2 + (fortune * 2));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }
}

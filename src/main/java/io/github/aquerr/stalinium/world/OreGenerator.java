package io.github.aquerr.stalinium.world;

import io.github.aquerr.stalinium.block.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGenerator extends WorldGenMinable implements IWorldGenerator
{
    public OreGenerator()
    {
        super(ModBlocks.STALINIUM_ORE.getDefaultState(), 3);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        for (int i = 0; i < 3; i ++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = 1 + random.nextInt(10);
            int z = chunkZ * 16 + random.nextInt(16);
            this.generate(world, random, new BlockPos(x, y, z));
        }
    }
}

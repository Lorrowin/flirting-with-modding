package com.lorrowin.niabowpia.world;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import com.lorrowin.niabowpia.block.BlockOpalBoulder;
import com.lorrowin.niabowpia.block.BlockRegister;
//to add at a later date \o/
//import com.lorrowin.niabowpia.Config;

public class OpalWorldGenerator implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider)
    {
        generateOre(world, random, chunkX * 16, chunkZ * 16);
    }

    private void generateOre(World world, Random random, int chunkX, int chunkZ)
    {
        for (int i = 0; i < 2; i++)
        {
            int x = chunkX + random.nextInt(16);
            int y = random.nextInt(48);
            int z = chunkZ + random.nextInt(16);

            BlockPos pos = new BlockPos(x, y, z);

            new WorldGenMinable(BlockRegister.blockOpalBoulder.getDefaultState(), 8).generate(world, random, pos);
        }
    }
}
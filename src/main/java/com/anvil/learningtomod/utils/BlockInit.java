package com.anvil.learningtomod.utils;

import com.anvil.learningtomod.ModMain;
import com.anvil.learningtomod.blocks.RubyBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMain.MODID);

    public static RegistryObject<Block> RUBY_BLOCK = BLOCKS.register(RubyBlock.getId(), RubyBlock::new);
}

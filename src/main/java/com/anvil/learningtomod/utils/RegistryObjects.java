package com.anvil.learningtomod.utils;

import com.anvil.learningtomod.blockItems.RubyBlockItem;
import com.anvil.learningtomod.blocks.RubyBlock;
import com.anvil.learningtomod.items.Ruby;
import com.anvil.learningtomod.tabs.Tabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class RegistryObjects {
    private static final Map<String, RegistryObject<Item>> ITEMS = new HashMap<>();
    private static final Map<String, RegistryObject<Block>> BLOCKS = new HashMap<>();
    private static final Map<String, RegistryObject<BlockItem>> BLOCK_ITEMS = new HashMap<>();

    public static void populateRegistryItems(DeferredRegister<Item> items) {
        ITEMS.put(Ruby.getKey(), items.register(Ruby.getItemName(), () -> new Ruby(Tabs.LEARNING_TAB)));
    }

    public static void populateRegistryBlocks(DeferredRegister<Block> blocks) {
        BLOCKS.put(RubyBlock.getKey(), blocks.register(RubyBlock.getBlockName(), RubyBlock::new));
    }

    public static void populateRegistryBlockItems(DeferredRegister<Item> blockItems) {
       BLOCK_ITEMS.put(RubyBlockItem.getKey(), blockItems.register(RubyBlockItem.getBlockItemName(),
                () -> new BlockItem(BLOCKS.get(RubyBlock.getKey()).get(), Ruby.getProperties())
        ));
    }

    public static RegistryObject<Item> getItem(String key) {
        return ITEMS.get(key);
    }

    public static RegistryObject<Block> getBlock(String key) {
        return BLOCKS.get(key);
    }
}

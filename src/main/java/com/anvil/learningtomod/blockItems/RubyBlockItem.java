package com.anvil.learningtomod.blockItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RubyBlockItem extends BlockItem {

    private static final String NAME = "rubyblockitem";
    private static CreativeModeTab TAB;

    public RubyBlockItem(Block p_40565_, CreativeModeTab tab) {
        super(p_40565_, new Item.Properties().tab(tab));
        TAB = tab;
    }

    public static String getBlockItemName() {
        return NAME;
    }
    public static String getKey() {
        return NAME.toUpperCase();
    }

    public static CreativeModeTab getCreativeModeTab() {
        return TAB;
    }
}

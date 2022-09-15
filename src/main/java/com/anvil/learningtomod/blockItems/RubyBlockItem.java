package com.anvil.learningtomod.blockItems;

import com.anvil.learningtomod.tabs.Tabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RubyBlockItem extends BlockItem {

    private static final String ID = "rubyblockitem";
    private static final CreativeModeTab TAB = Tabs.LEARNING_TAB;
    private static final Item.Properties properties = new Item.Properties().tab(TAB);

    public RubyBlockItem(Block p_40565_) {
        super(p_40565_, properties);
    }

    public static String getId() {
        return ID;
    }
    public static CreativeModeTab getTab() {
        return TAB;
    }

    public static Item.Properties getProperties() {
        return properties;
    }
}

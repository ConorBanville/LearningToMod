package com.anvil.learningtomod.items;

import com.anvil.learningtomod.tabs.Tabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Ruby extends Item {
    private static final String ID = "ruby";
    private static final CreativeModeTab TAB = Tabs.LEARNING_TAB;
    private static final Item.Properties properties = new Item.Properties().tab(TAB);

    public Ruby() {
        super(properties);
    }

    public static String getId() {
        return ID;
    }
}

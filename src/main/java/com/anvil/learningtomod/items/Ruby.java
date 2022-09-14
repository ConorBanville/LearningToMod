package com.anvil.learningtomod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Ruby extends Item {
    private static final String NAME = "ruby";
    private static CreativeModeTab TAB;
    private static Item.Properties properties;
    public Ruby(CreativeModeTab tab) {
        super(new Item.Properties().tab(tab));
        TAB = tab;
        properties = new Item.Properties().tab(tab);
    }

    public static String getItemName() {
        return NAME;
    }

    public static String getKey() {
        return NAME.toUpperCase();
    }

    public static CreativeModeTab getCreativeModeTab() {
        return TAB;
    }

    public static Properties getProperties() {
        return properties;
    }
}

package com.anvil.learningtomod.utils;

import com.anvil.learningtomod.ModMain;
import com.anvil.learningtomod.blockItems.RubyBlockItem;
import com.anvil.learningtomod.items.Ruby;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModMain.MODID);

    public static RegistryObject<Item> RUBY = ITEMS.register(Ruby.getId(), Ruby::new);
    public static RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register(
            RubyBlockItem.getId(), () -> new RubyBlockItem(BlockInit.RUBY_BLOCK.get())
    );
}

package com.anvil.learningtomod.tabs;

import com.anvil.learningtomod.items.Ruby;
import com.anvil.learningtomod.utils.RegistryObjects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class LearningTab extends CreativeModeTab {
    private static final String NAME = "learning";
    private static LearningTab _instance = null;

    private LearningTab() {
        super(NAME);
    }

    public static LearningTab getInstance() {
        if(_instance == null) {
            _instance = new LearningTab();
        }

        return _instance;
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(RegistryObjects.getItem(Ruby.getKey()).get());
    }
}

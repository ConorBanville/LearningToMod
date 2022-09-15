package com.anvil.learningtomod.tabs;

import com.anvil.learningtomod.utils.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class LearningTab extends CreativeModeTab {
    private static final String ID = "learning";
    private static LearningTab _instance = null;

    // @Singleton
    private LearningTab() {
        super(ID);
    }
    public static LearningTab getInstance() {
        if(_instance == null) {
            _instance = new LearningTab();
        }

        return _instance;
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ItemInit.RUBY.get());
    }
}

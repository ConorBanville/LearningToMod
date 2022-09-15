package com.anvil.learningtomod;

import com.anvil.learningtomod.utils.BlockInit;
import com.anvil.learningtomod.utils.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModMain.MODID)
public class ModMain
{
    public static final String MODID = "learningtomod";

    public static final Logger LOGGER = LogUtils.getLogger();

    public ModMain()
    {
        IEventBus modSpecificEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modSpecificEventBus);
        BlockInit.BLOCKS.register(modSpecificEventBus);
    }
}

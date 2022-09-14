package com.anvil.learningtomod;

import com.anvil.learningtomod.utils.RegistryHandler;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModMain.MODID)
public class ModMain
{
    public static final String MODID = "learningtomod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public ModMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}

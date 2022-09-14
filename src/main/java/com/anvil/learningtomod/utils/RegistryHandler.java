package com.anvil.learningtomod.utils;

import com.anvil.learningtomod.ModMain;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class RegistryHandler {
    private static final Map<String, DeferredRegister<?>> REGISTERS = new HashMap<>();
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModMain.MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMain.MODID);


    public static void init() {
        RegistryObjects.populateRegistryItems(ITEMS);
        RegistryObjects.populateRegistryBlocks(BLOCKS);
        RegistryObjects.populateRegistryBlockItems(ITEMS);

        populateRegistry().forEach((k,v) -> v.register(FMLJavaModLoadingContext.get().getModEventBus()));
    }

    private static Map<String, DeferredRegister<?>> populateRegistry() {
        REGISTERS.put("ITEMS", ITEMS);
        REGISTERS.put("BLOCKS", BLOCKS);

        return REGISTERS;
    }
}

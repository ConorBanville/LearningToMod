package com.anvil.learningtomod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RubyBlock extends Block {

    private static final String NAME = "rubyblock";
    private static final Material MATERIAL = Material.METAL;
    private static final float STRENGTH = 5.0F;
    private static final float RESISTANCE = 6.0F;

    public RubyBlock() {
        super(
                BlockBehaviour.Properties
                        .of(MATERIAL)
                        .strength(STRENGTH)
                        .explosionResistance(RESISTANCE)
                        .sound(SoundType.METAL)
                        .requiresCorrectToolForDrops()
        );
    }

    public BlockBehaviour.Properties getProperties() {
        return properties;
    }

    public static String getBlockName() {
        return NAME;
    }

    public static String getKey() {
        return NAME.toUpperCase();
    }
}

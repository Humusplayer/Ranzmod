package net.forgetest.RanzMod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STEEL = new ForgeTier(3,1400,2f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.STEEL.get()));
}

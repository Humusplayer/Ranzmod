package net.forgetest.RanzMod.utils;

import net.forgetest.RanzMod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RANZ_TAB = new CreativeModeTab("ranztab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL.get());
        }
    };
}

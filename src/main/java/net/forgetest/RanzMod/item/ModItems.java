package net.forgetest.RanzMod.item;

import net.forgetest.RanzMod.RanzMod;
import net.forgetest.RanzMod.utils.ModCreativeModeTab;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RanzMod.MODID);

    //Items
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));
    public static final RegistryObject<Item> STEEL_TOOL_ROD = ITEMS.register("steel_tool_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));

    //Tools
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            ()-> new SwordItem(ModTiers.STEEL, 3,3f,
                    new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            ()-> new ShovelItem(ModTiers.STEEL, 1,3f,
                    new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            ()-> new HoeItem(ModTiers.STEEL, 1,3f,
                    new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            ()-> new AxeItem(ModTiers.STEEL, 6,0f,
                    new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            ()-> new PickaxeItem(ModTiers.STEEL, 1,3f,
                    new Item.Properties().tab(ModCreativeModeTab.RANZ_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

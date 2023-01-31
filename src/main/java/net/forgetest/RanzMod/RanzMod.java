package net.forgetest.RanzMod;

import com.mojang.logging.LogUtils;
import net.forgetest.RanzMod.block.ModBlocks;
import net.forgetest.RanzMod.block.entity.ModBlocksEntities;
import net.forgetest.RanzMod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RanzMod.MODID)
public class RanzMod {
    public static final String MODID = "ranzmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RanzMod(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);Log("Mod Items Registriert");
        ModBlocks.register(modEventBus);Log("Mod Blocks Registriert");
        ModBlocksEntities.register(modEventBus);Log("Mod Block Entities Registriert");

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void Log(String ausgabe){
        LOGGER.debug(ausgabe);
    }

    private void commonSetup(final FMLCommonSetupEvent event){

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }
}

package net.forgetest.RanzMod.block.entity;

import net.forgetest.RanzMod.RanzMod;
import net.forgetest.RanzMod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RanzMod.MODID);

    public static final RegistryObject<BlockEntityType<InfuseingStationEntity>> INFUSING_STATION =
            BLOCK_ENTITIES.register("infusing_station", ()->
                    BlockEntityType.Builder.of(InfuseingStationEntity::new,
                            ModBlocks.INFUSING_STATION.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}

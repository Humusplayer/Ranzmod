package net.forgetest.RanzMod.screen;

import net.forgetest.RanzMod.block.ModBlocks;
import net.forgetest.RanzMod.block.entity.InfuseingStationEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

public class InfusingStationMenu extends AbstractContainerMenu {
    public final InfuseingStationEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public InfusingStationMenu(int id, Inventory inventory, FriendlyByteBuf extraData){
        this(id,inventory,inventory.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public InfusingStationMenu(int id, Inventory inventory, BlockEntity entity, ContainerData data){
        super(, id);
        checkContainerSize(inventory,3);
        blockEntity = (InfuseingStationEntity) entity;
        this.level = inventory.player.level;
        this.data = data;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);
    }

    @Override
    public ItemStack quickMoveStack(Player p_38941_, int p_38942_) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level,blockEntity.getBlockPos()),
                player, ModBlocks.INFUSING_STATION.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i){
            for (int l = 0;l < 9; ++l){
                this.addSlot(new Slot(playerInventory,l+i*9+9,8+l*18,86+i*18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory,i,8+i*18,144));
        }
    }

    //Unnötiger Kommentar
}

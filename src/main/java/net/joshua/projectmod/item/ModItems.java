package net.joshua.projectmod.item;

import net.joshua.projectmod.ProjectMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectMod.MOD_ID);

    public static final RegistryObject<Item> KYANITE = ITEMS.register("kyanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KYANITE = ITEMS.register("raw_kyanite",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

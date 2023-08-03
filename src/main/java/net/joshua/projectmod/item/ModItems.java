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

    public static final RegistryObject<Item> KYANITE_PICKAXE = ITEMS.register("kyanite_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_AXE = ITEMS.register("kyanite_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_BOOTS = ITEMS.register("kyanite_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_CHESTPLATE = ITEMS.register("kyanite_chestplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_HELMET = ITEMS.register("kyanite_helmet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_HOE = ITEMS.register("kyanite_hoe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_HORSE_ARMOR = ITEMS.register("kyanite_horse_armor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_LEGGINGS = ITEMS.register("kyanite_leggings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_SHOVEL = ITEMS.register("kyanite_shovel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword",
            () -> new Item(new Item.Properties()));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

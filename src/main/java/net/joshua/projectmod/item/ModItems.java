package net.joshua.projectmod.item;

import net.joshua.projectmod.ProjectMod;
import net.joshua.projectmod.item.custom.MetalDetectorItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.wrapper.EntityEquipmentInvWrapper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.EquipmentSlot;
import net.joshua.projectmod.item.ModCreativeModeTabs;
import net.joshua.projectmod.item.ModTiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectMod.MOD_ID);
/* Kyanite */
    public static final RegistryObject<Item> KYANITE = ITEMS.register("kyanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KYANITE = ITEMS.register("raw_kyanite",
            () -> new Item(new Item.Properties()));

    /* Tools */
    public static final RegistryObject<Item> KYANITE_PICKAXE = ITEMS.register("kyanite_pickaxe",
            () -> new PickaxeItem(ModTiers.KYANITE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_AXE = ITEMS.register("kyanite_axe",
            () -> new AxeItem(ModTiers.KYANITE, 7F, -3F, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_HOE = ITEMS.register("kyanite_hoe",
            () -> new HoeItem(ModTiers.KYANITE, -3, 0F, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_SHOVEL = ITEMS.register("kyanite_shovel",
            () -> new ShovelItem(ModTiers.KYANITE, 1.6F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword",
            () -> new SwordItem(ModTiers.KYANITE, 5, -2.4F, new Item.Properties()));
/* Armor */
    public static final RegistryObject<Item> KYANITE_BOOTS = ITEMS.register("kyanite_boots",
            () -> new ArmorItem(ModArmorMaterials.KYANITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_CHESTPLATE = ITEMS.register("kyanite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KYANITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_HELMET = ITEMS.register("kyanite_helmet",
            () -> new ArmorItem(ModArmorMaterials.KYANITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_HORSE_ARMOR = ITEMS.register("kyanite_horse_armor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_LEGGINGS = ITEMS.register("kyanite_leggings",
            () -> new ArmorItem(ModArmorMaterials.KYANITE,ArmorItem.Type.LEGGINGS, new Item.Properties()));
/* Special Items */
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
        () -> new MetalDetectorItem(new Item.Properties().durability(100)));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

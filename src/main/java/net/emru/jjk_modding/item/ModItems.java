package net.emru.jjk_modding.item;

import net.emru.jjk_modding.JJKMod;
//import net.emru.jjk_modding.item.custom.ModArmorItem;
import net.emru.jjk_modding.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, JJKMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_STICK = ITEMS.register("steel_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SKY_INGOT = ITEMS.register("sky_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SKY = ITEMS.register("raw_sky",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKY_STICK = ITEMS.register("sky_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new PickaxeItem(ModToolTiers.STEEL, 3, 2, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 4, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SKY_SWORD = ITEMS.register("sky_sword",
            () -> new PickaxeItem(ModToolTiers.SKY, 4, 3, new Item.Properties()));
    public static final RegistryObject<Item> SKY_PICKAXE = ITEMS.register("sky_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SKY, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> SKY_AXE = ITEMS.register("sky_axe",
            () -> new AxeItem(ModToolTiers.SKY, 5, 2, new Item.Properties()));
    public static final RegistryObject<Item> SKY_HOE = ITEMS.register("sky_hoe",
            () -> new HoeItem(ModToolTiers.SKY, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SKY_SHOVEL = ITEMS.register("sky_shovel",
            () -> new ShovelItem(ModToolTiers.SKY, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ModArmorItem(ModArmorMaterials.STEEL_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SKY_HELMET = ITEMS.register("sky_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SKY_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SKY_CHESTPLATE = ITEMS.register("sky_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SKY_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SKY_LEGGINGS = ITEMS.register("sky_leggings",
            () -> new ArmorItem(ModArmorMaterials.SKY_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SKY_BOOTS = ITEMS.register("sky_boots",
            () -> new ArmorItem(ModArmorMaterials.SKY_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}

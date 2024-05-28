package net.Zolotcom.mptmod.item;

import net.Zolotcom.mptmod.MptMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw", () -> new Item(new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}

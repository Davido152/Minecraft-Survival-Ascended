package net.davido152.minecraftsurvivalascended.item;

import net.davido152.minecraftsurvivalascended.MinecraftSurvivalAscended;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftSurvivalAscended.MOD_ID);

    public static final RegistryObject<Item> SAP = ITEMS.register("sap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_SAP = ITEMS.register("cactus_sap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CEMENTING_PASTE = ITEMS.register("cementing_paste",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIBER = ITEMS.register("fiber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KERATIN = ITEMS.register("keratin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELT = ITEMS.register("pelt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRESERVING_SALT = ITEMS.register("preserving_salt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SALT = ITEMS.register("raw_salt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHELL_FRAGMENT = ITEMS.register("shell_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICA_PEARLS = ITEMS.register("silica_pearls",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPARKPOWDER = ITEMS.register("sparkpowder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THATCH = ITEMS.register("thatch",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

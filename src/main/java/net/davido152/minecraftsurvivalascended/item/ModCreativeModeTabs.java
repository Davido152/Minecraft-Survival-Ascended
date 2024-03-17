package net.davido152.minecraftsurvivalascended.item;

import net.davido152.minecraftsurvivalascended.MinecraftSurvivalAscended;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftSurvivalAscended.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SURVIVAL_ASCENDED_TAB = CREATIVE_MODE_TABS.register("survival_ascended_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAP.get()))
                    .title(Component.translatable("itemGroup.survival_ascended_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

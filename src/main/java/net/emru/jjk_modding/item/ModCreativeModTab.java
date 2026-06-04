package net.emru.jjk_modding.item;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JJKMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JUJUTSU_TAB = CREATIVE_MODE_TABS.register("jujutsu_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.jujutsu_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.STEEL_INGOT.get());

                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus);}
}

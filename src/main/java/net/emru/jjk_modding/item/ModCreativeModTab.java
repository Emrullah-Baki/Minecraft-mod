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

    public static final RegistryObject<CreativeModeTab> STEEL_TAB = CREATIVE_MODE_TABS.register("steel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.steel_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.STEEL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_STEEL_ORE.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());

                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.RAW_STEEL.get());

                        pOutput.accept(ModItems.ELDER_STICK.get());

                        pOutput.accept(ModItems.STEEL_HELMET.get());
                        pOutput.accept(ModItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.STEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.STEEL_BOOTS.get());

                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> SKY = CREATIVE_MODE_TABS.register("sky_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SKY_INGOT.get()))
                    .title(Component.translatable("creativetab.sky_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.SKY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SKY_ORE.get());
                        pOutput.accept(ModBlocks.SKY_BLOCK.get());

                        pOutput.accept(ModItems.SKY_INGOT.get());
                        pOutput.accept(ModItems.RAW_SKY.get());

                        pOutput.accept(ModItems.ELIXER_STICK.get());

                        pOutput.accept(ModItems.SKY_HELMET.get());
                        pOutput.accept(ModItems.SKY_CHESTPLATE.get());
                        pOutput.accept(ModItems.SKY_LEGGINGS.get());
                        pOutput.accept(ModItems.SKY_BOOTS.get());

                        pOutput.accept(ModItems.SKY_SWORD.get());
                        pOutput.accept(ModItems.SKY_PICKAXE.get());
                        pOutput.accept(ModItems.SKY_AXE.get());
                        pOutput.accept(ModItems.SKY_HOE.get());
                        pOutput.accept(ModItems.SKY_SHOVEL.get());

                    }).build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus);}
}

package net.emru.jjk_modding.datagen;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.emru.jjk_modding.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, JJKMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SKY_HELMET.get(),
                        ModItems.SKY_CHESTPLATE.get(),
                        ModItems.SKY_LEGGINGS.get(),
                        ModItems.SKY_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ELDER_LOG.get().asItem())
                .add(ModBlocks.ELDER_STRIPPED_LOG.get().asItem())

                .add(ModBlocks.ELIXER_LOG.get().asItem())
                .add(ModBlocks.ELIXER_STRIPPED_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.ELDER_PLANKS.get().asItem())

                .add(ModBlocks.ELIXER_PLANKS.get().asItem());
    }
}

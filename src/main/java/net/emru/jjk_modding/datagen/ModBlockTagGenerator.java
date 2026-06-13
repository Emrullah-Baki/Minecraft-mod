package net.emru.jjk_modding.datagen;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.emru.jjk_modding.item.ModItems;
import net.emru.jjk_modding.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JJKMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        this.tag(ModTags.Blocks.NAME)
//                .add(ModBlocks.STEEL_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.STEEL_ORE.get(),
                        ModBlocks.DEEPSLATE_STEEL_ORE.get(),

                        ModBlocks.SKY_BLOCK.get(),
                        ModBlocks.SKY_ORE.get(),
                        ModBlocks.DEEPSLATE_SKY_ORE.get()
                        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STEEL_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get(),

                        ModBlocks.SKY_ORE.get(),
                        ModBlocks.DEEPSLATE_SKY_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_SKY_TOOL)
                .add(ModBlocks.SKY_BLOCK.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ELDER_LOG.get())
                .add(ModBlocks.ELDER_STRIPPED_LOG.get())

                .add(ModBlocks.ELIXER_LOG.get())
                .add(ModBlocks.ELIXER_STRIPPED_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ELDER_PLANKS.get())

                .add(ModBlocks.ELIXER_PLANKS.get());
    }
}

package net.emru.jjk_modding.datagen;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JJKMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.STEEL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_STEEL_ORE);
        blockWithItem(ModBlocks.SKY_BLOCK);
        blockWithItem(ModBlocks.SKY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SKY_ORE);

        logBlock((RotatedPillarBlock) (ModBlocks.ELDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ELDER_STRIPPED_LOG.get()), blockTexture(ModBlocks.ELDER_STRIPPED_LOG.get()),
                ResourceLocation.fromNamespaceAndPath(JJKMod.MOD_ID, "block/elder_stripped_log_top"));
                blockTexture(ModBlocks.ELDER_STRIPPED_LOG.get());

        logBlock((RotatedPillarBlock) (ModBlocks.ELIXER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ELIXER_STRIPPED_LOG.get()), blockTexture(ModBlocks.ELIXER_STRIPPED_LOG.get()),
                ResourceLocation.fromNamespaceAndPath(JJKMod.MOD_ID, "block/elixer_stripped_log_top"));
                blockTexture(ModBlocks.ELIXER_STRIPPED_LOG.get());

        blockItem(ModBlocks.ELDER_LOG);
        blockItem(ModBlocks.ELDER_STRIPPED_LOG);

        blockWithItem(ModBlocks.ELDER_PLANKS);
        leavesBlock(ModBlocks.ELDER_LEAVES);

        blockItem(ModBlocks.ELIXER_LOG);
        blockItem(ModBlocks.ELIXER_STRIPPED_LOG);

        blockWithItem(ModBlocks.ELIXER_PLANKS);
        leavesBlock(ModBlocks.ELIXER_LEAVES);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.tryParse("minecraft:block/leaves"),
                "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(JJKMod.MOD_ID +
            ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

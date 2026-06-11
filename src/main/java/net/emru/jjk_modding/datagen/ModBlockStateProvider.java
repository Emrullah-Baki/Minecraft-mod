package net.emru.jjk_modding.datagen;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

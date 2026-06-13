package net.emru.jjk_modding.datagen.loot;

import net.emru.jjk_modding.block.ModBlocks;
import net.emru.jjk_modding.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.SKY_BLOCK.get());

        this.add(ModBlocks.STEEL_ORE.get(),
                block -> createSteelOreDrops(ModBlocks.STEEL_ORE.get(), ModItems.RAW_STEEL.get()));
        this.add(ModBlocks.DEEPSLATE_STEEL_ORE.get(),
                block -> createSteelOreDrops(ModBlocks.STEEL_ORE.get(), ModItems.RAW_STEEL.get()));
        this.add(ModBlocks.SKY_ORE.get(),
                block -> createSkyOreDrops(ModBlocks.SKY_ORE.get(), ModItems.RAW_SKY.get()));
        this.add(ModBlocks.DEEPSLATE_SKY_ORE.get(),
                block -> createSkyOreDrops(ModBlocks.DEEPSLATE_SKY_ORE.get(), ModItems.RAW_SKY.get()));

        this.dropSelf(ModBlocks.ELDER_LOG.get());
        this.dropSelf(ModBlocks.ELDER_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.ELDER_PLANKS.get());

        this.add(ModBlocks.ELDER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ELDER_LOG.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.ELIXER_LOG.get());
        this.dropSelf(ModBlocks.ELIXER_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.ELIXER_PLANKS.get());

        this.add(ModBlocks.ELIXER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ELIXER_LOG.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    protected LootTable.Builder createSteelOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createSkyOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

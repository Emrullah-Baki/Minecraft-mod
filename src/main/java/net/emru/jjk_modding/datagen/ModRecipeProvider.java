package net.emru.jjk_modding.datagen;


import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.block.ModBlocks;
import net.emru.jjk_modding.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> STEEL_SMELTABLE = List.of(ModItems.RAW_STEEL.get(),
            ModBlocks.STEEL_ORE.get());

    private static final List<ItemLike> SKY_SMELTABLE = List.of(ModItems.RAW_SKY.get(),
            ModBlocks.SKY_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, STEEL_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 200, "steel");
        oreBlasting(pWriter, STEEL_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 100, "steel");

        oreSmelting(pWriter, SKY_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 200, "steel");
        oreBlasting(pWriter, SKY_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 100, "steel");

//      STEEL BLOCKS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter);

//      STEEL ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

//      STEEL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_STICK.get(), 4)
                .pattern(" S ")
                .pattern(" S ")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

//      STEEL TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', ModItems.STEEL_STICK.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', ModItems.STEEL_STICK.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', ModItems.STEEL_STICK.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', ModItems.STEEL_STICK.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', ModItems.STEEL_STICK.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

//      SKY Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SKY_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SKY_INGOT.get(), 9)
                .requires(ModBlocks.SKY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SKY_BLOCK.get()), has(ModBlocks.SKY_BLOCK.get()))
                .save(pWriter);

//      SKY ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

//      SKY ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SKY_STICK.get(), 4)
                .pattern(" S ")
                .pattern(" S ")
                .define('S', ModItems.SKY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

//      SKY TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', ModItems.SKY_INGOT.get())
                .define('#', ModItems.SKY_STICK.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SKY_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SKY_INGOT.get())
                .define('#', ModItems.SKY_STICK.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SKY_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', ModItems.SKY_INGOT.get())
                .define('#', ModItems.SKY_STICK.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SKY_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SKY_INGOT.get())
                .define('#', ModItems.SKY_STICK.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SKY_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SKY_INGOT.get())
                .define('#', ModItems.SKY_STICK.get())
                .unlockedBy(getHasName(ModItems.SKY_INGOT.get()), has(ModItems.SKY_INGOT.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  JJKMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

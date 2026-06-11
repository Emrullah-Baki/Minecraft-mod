package net.emru.jjk_modding.item;

import net.emru.jjk_modding.JJKMod;
import net.emru.jjk_modding.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 14f, 3f, 25,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(JJKMod.MOD_ID, "steel"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier SKY = TierSortingRegistry.registerTier(
        new ForgeTier(6, 4000, 15f, 4f, 25,
                   ModTags.Blocks.NEEDS_SKY_TOOL, () -> Ingredient.of(ModItems.SKY_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(JJKMod.MOD_ID, "sky"), List.of(Tiers.NETHERITE), List.of());
}

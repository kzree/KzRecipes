package com.kzree.kzrecipes.recipes;

import com.kzree.kzrecipes.KzRecipes;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CrackedStoneBrickRecipe extends Recipe {

    public CrackedStoneBrickRecipe(String recipeKey, KzRecipes plugin) {
        super(recipeKey, plugin);
    }

    @Override
    protected void createRecipe() {
        ItemStack craftedItemStack = new ItemStack(Material.CRACKED_STONE_BRICKS, 1);
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(this.plugin, this.recipeKey), craftedItemStack);
        recipe.addIngredient(Material.STONE_BRICKS);
        recipe.addIngredient(Material.FLINT);
        Bukkit.addRecipe(recipe);
    }
}

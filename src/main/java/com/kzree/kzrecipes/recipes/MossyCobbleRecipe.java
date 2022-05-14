package com.kzree.kzrecipes.recipes;

import com.kzree.kzrecipes.KzRecipes;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class MossyCobbleRecipe extends Recipe {
    public MossyCobbleRecipe(String recipeKey, KzRecipes plugin) {
        super(recipeKey, plugin);
    }

    @Override
    protected void createRecipe() {
        ItemStack craftedItemStack = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(this.plugin, this.recipeKey), craftedItemStack);
        recipe.addIngredient(Material.COBBLESTONE);
        recipe.addIngredient(Material.WHEAT_SEEDS);
        recipe.addIngredient(Material.WHEAT_SEEDS);
        Bukkit.addRecipe(recipe);
    }
}

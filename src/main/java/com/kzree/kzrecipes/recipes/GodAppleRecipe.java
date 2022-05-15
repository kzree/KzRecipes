package com.kzree.kzrecipes.recipes;

import com.kzree.kzrecipes.KzRecipes;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class GodAppleRecipe extends Recipe {
    public GodAppleRecipe(String recipeKey, KzRecipes plugin) {
        super(recipeKey, plugin);
    }

    @Override
    protected void createRecipe() {
        ItemStack craftedItemStack = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this.plugin, this.recipeKey), craftedItemStack);
        recipe.shape("GGG", "GAG", "GGG");
        recipe.setIngredient('G', Material.GOLD_BLOCK);
        recipe.setIngredient('A', Material.APPLE);
        Bukkit.addRecipe(recipe);
    }
}

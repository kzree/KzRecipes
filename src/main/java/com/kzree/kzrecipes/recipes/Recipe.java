package com.kzree.kzrecipes.recipes;

import com.kzree.kzrecipes.KzRecipes;
import org.bukkit.Bukkit;

public abstract class Recipe {
    protected final String recipeKey;
    protected final KzRecipes plugin;

    public Recipe(String recipeKey, KzRecipes plugin) {
        this.recipeKey = recipeKey;
        this.plugin = plugin;
    }

    protected void createRecipe() {
        // Recipe logic here
    }

    public void initializeRecipe() {
        boolean isRecipeEnabled = this.plugin.getConfig().getBoolean("recipes." + recipeKey + ".enabled");
        boolean logEnabledRecipes = this.plugin.getConfig().getBoolean("log_enabled_recipes");
        if (isRecipeEnabled) {
            createRecipe();
            if (logEnabledRecipes) plugin.getLogger().info("Recipe " + this.recipeKey + " enabled");
        }
    }
}

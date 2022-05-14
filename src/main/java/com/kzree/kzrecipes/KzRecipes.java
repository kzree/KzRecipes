package com.kzree.kzrecipes;

import org.bukkit.plugin.java.JavaPlugin;

public final class KzRecipes extends JavaPlugin {
    private final RecipeInitializer recipeInitializer;

    public KzRecipes() {
        recipeInitializer = new RecipeInitializer(this);
    }

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        recipeInitializer.initializeRecipes();
    }
}

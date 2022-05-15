package com.kzree.kzrecipes;

import com.kzree.kzrecipes.recipes.*;

import java.util.ArrayList;
import java.util.List;

public class RecipeInitializer {
    private final List<Recipe> recipeList;
    private final KzRecipes plugin;

    public RecipeInitializer(KzRecipes plugin) {
        this.plugin = plugin;
        recipeList = new ArrayList<>();
        addRecipesToList();
    }

    private void addRecipesToList() {
        recipeList.add(new MossyCobbleRecipe("mossy_cobble", this.plugin));
        recipeList.add(new MossyStoneBrickRecipe("mossy_stone_brick", this.plugin));
        recipeList.add(new CrackedStoneBrickRecipe("cracked_stone_brick", this.plugin));
        recipeList.add(new GodAppleRecipe("god_apple", this.plugin));
    }

    public void initializeRecipes() {
        recipeList.forEach(Recipe::initializeRecipe);
    }
}

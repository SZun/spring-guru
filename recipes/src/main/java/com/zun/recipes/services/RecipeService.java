package com.zun.recipes.services;

import com.zun.recipes.commands.RecipeCommand;
import com.zun.recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

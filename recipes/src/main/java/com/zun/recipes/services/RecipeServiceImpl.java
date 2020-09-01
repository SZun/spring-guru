package com.zun.recipes.services;

import com.zun.recipes.domain.Recipe;
import com.zun.recipes.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");

        Set<Recipe> toReturn = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(toReturn::add);
        return toReturn;
    }
}

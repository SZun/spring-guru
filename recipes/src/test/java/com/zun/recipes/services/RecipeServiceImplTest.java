package com.zun.recipes.services;

import com.zun.recipes.domain.Recipe;
import com.zun.recipes.repositories.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RecipeServiceImplTest {

    @InjectMocks
    private RecipeServiceImpl recipeService;

    @Mock
    private RecipeRepository recipeRepository;

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipesData = new HashSet<>();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> fromService = recipeService.getRecipes();

        assertEquals(recipesData, fromService);
        verify(recipeRepository, times(1)).findAll();
    }
}
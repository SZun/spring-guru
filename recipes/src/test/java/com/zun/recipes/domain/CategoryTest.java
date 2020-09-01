package com.zun.recipes.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    private Category category;

    @BeforeEach
    void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        category.setId(4L);
        assertEquals(4L, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}
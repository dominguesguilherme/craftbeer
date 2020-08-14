package com.beerhouse.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTests {

    @Test
    public void testShouldCreateIngredient() {
        String description = "Cevada";
        double quantity = 10.5;
        Ingredient ingredient = Ingredient.create(description, quantity);

        assertEquals(description, ingredient.description());
        assertEquals(quantity, ingredient.quantity());

    }
}

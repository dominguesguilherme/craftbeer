package com.beerhouse.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeerTests {

    @Test
    public void testShouldCreateBeer() {
        String id = "d33b6733-3b2b-411e-9d0e-97c52951c0b6";
        String name = "Pale ale glamurosa";
        double amount = 7.5;
        Container container= Container.create("Bottle", "1L");
        List<Ingredient> ingredients= new ArrayList<Ingredient>();
        ingredients.add(Ingredient.create("Cevada", 10.5));

        Beer beer = Beer.create(id, name, amount, container, ingredients);

        assertEquals(id, beer.id());
        assertEquals(name, beer.name());
        assertEquals(amount, beer.amount());
        assertEquals(container, beer.container());
        assertEquals(ingredients, beer.ingredients());
    }
}

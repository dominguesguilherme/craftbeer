package com.beerhouse.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
    @Id
    private String id;
    private String description;
    private double quantity;

    protected Ingredient() {}

    private Ingredient(String description, double quantity) {
        this.description = description;
        this.quantity = quantity;
    }

    public static Ingredient create(String description, double quantity) {
        return new Ingredient(description, quantity);
    }

    public String description() {
        return this.description;
    }

    public double quantity() {
        return this.quantity;
    }
}

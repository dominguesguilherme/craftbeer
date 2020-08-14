package com.beerhouse.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Beer {
    @Id
    private String id;
    private String name;
    private double amount;
    private Container container;
    @OneToMany
    private List<Ingredient> ingredients;

    protected Beer() {}
    private Beer(String id, String name, double amount, Container container, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.container = container;
        this.ingredients = ingredients;
    }

    public static Beer create(String id, String name, double amount, Container container, List<Ingredient> ingredients) {
        return new Beer(id, name, amount, container, ingredients);
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public double amount() { return this.amount; }

    public Container container()
    {
        return this.container;
    }

    public List<Ingredient> ingredients() {
        return this.ingredients;
    }
}

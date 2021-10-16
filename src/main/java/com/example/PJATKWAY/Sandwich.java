package com.example.PJATKWAY;

import java.util.List;



public class Sandwich {
    private double basePrice;
    private List<Ingredient> ingredients;
    private int baseCalories;
    private Size size;

    public Sandwich(double basePrice, List<Ingredient> ingredients, int baseCalories, Size size) {
        this.basePrice = basePrice;
        this.ingredients = ingredients;
        this.baseCalories = baseCalories;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getBaseCalories() {
        return baseCalories;
    }

    public void setBaseCalories(int baseCalories) {
        this.baseCalories = baseCalories;
    }


}

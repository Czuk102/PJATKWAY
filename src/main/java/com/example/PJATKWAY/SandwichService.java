package com.example.PJATKWAY;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichService {
	public Sandwich prepareSandwich() {
		List<Ingredient> ingrediets = new ArrayList<>();
		Ingredient Bread = new Ingredient(null, "black bread", 50, 4);
		Ingredient Cheese = new Ingredient(null, "Cheddar", 100, 7.50);
		ingrediets.add(Bread);
		ingrediets.add(Cheese);
		return new Sandwich(null, "diabolo", ingrediets, 10, 200, 15, SandwichSize.BIG);

	}

	public Sandwich prepareSandwich(String name) {
		List<Ingredient> ingrediets2 = new ArrayList<>();
		Ingredient Bread = new Ingredient(null, "black bread", 50, 4);
		Ingredient Cheese = new Ingredient(null, "Cheddar", 100, 7.50);
		return new Sandwich(null, name, ingrediets2, 10, 200, 15, SandwichSize.LARGE);
	}
}

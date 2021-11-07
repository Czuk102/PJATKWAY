package com.example.PJATKWAY;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Sandwich")
 public class Sandwich {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
     private Integer id;
     private String name;
     @OneToMany
     private List<Ingredient> ingredients;
     private double BasePrice;
     private double BaseCalories;
     private double Price;
     private SandwichSize size;

    public Sandwich() {

    }


    public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public List<Ingredient> getIngredients() {
         return ingredients;
     }

     public void setIngredients(List<Ingredient> ingredients) {
         this.ingredients = ingredients;
     }

     public double getBasePrice() {
         return BasePrice;
     }

     public void setBasePrice(double basePrice) {
         BasePrice = basePrice;
     }

     public double getBaseCalories() {
         return BaseCalories;
     }

     public void setBaseCalories(double baseCalories) {
         BaseCalories = baseCalories;
     }

     public double getPrice() {
         return Price;
     }

     public void setPrice(double price) {
         Price = price;
     }



     public void setSize() {
         this.size = size;
     }

    public Sandwich(Integer id, String name, List<Ingredient> ingredients, double basePrice, double baseCalories, double price, SandwichSize size) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        BasePrice = basePrice;
        BaseCalories = baseCalories;
        Price = price;
        this.size = size;
    }


    public double CountPrice()
    {
        return 0;
    }
     @Override
     public String toString() {
         return "Sandwich{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", ingredients=" + ingredients +
                 ", BasePrice=" + BasePrice +
                 ", BaseCalories=" + BaseCalories +
                 ", Price=" + Price +
                 ", SandwichSize=" + size +
                 '}';
     }
 }

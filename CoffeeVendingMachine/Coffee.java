package CoffeeVendingMachine;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Coffee {
   private Map<CoffeeNames, List<CoffeeRecipe>> coffeeRecipe;
   private Map<CoffeeNames, Double> coffeeMenu;

   Coffee() {
     this.coffeeMenu = initialiseCoffeeMenu();
     this.coffeeRecipe = initialiseCoffeeRecipe();
   }

   private Map<CoffeeNames, Double> initialiseCoffeeMenu() {
     Map<CoffeeNames, Double> coffeeMenu =  new HashMap<>();
     coffeeMenu.put(CoffeeNames.Cappucino, 2.0);
     coffeeMenu.put(CoffeeNames.Espresso, 2.5);
     return coffeeMenu;
   }
   
   private Map<CoffeeNames, List<CoffeeRecipe>> initialiseCoffeeRecipe() {
       Map<CoffeeNames, List<CoffeeRecipe>> coffeeRecipe = new HashMap<>();
       List<CoffeeRecipe> CappucinoIngredients = new ArrayList<>();
       CappucinoIngredients.add(new CoffeeRecipe("Milk", 1));
       CappucinoIngredients.add(new CoffeeRecipe("Water", 1));
       CappucinoIngredients.add(new CoffeeRecipe("Coffee", 1));
       coffeeRecipe.put(CoffeeNames.Cappucino, CappucinoIngredients);
       List<CoffeeRecipe> EspressoIngredients = new ArrayList<>();
       EspressoIngredients.add(new CoffeeRecipe("Milk", 1));
       EspressoIngredients.add(new CoffeeRecipe("Water", 2));
       coffeeRecipe.put(CoffeeNames.Espresso, EspressoIngredients);
       return coffeeRecipe;
   }

   public Map<CoffeeNames, List<CoffeeRecipe>> getCoffeeRecipe() {
    return this.coffeeRecipe;
   }

   public Map<CoffeeNames, Double> getCoffeeMenu() {
    return this.coffeeMenu;
   }
   
}

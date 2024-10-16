package CoffeeVendingMachine;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class CoffeeMachine {
  private Coffee coffee;
 private Map<String, Integer> ingredientsInventory;

  CoffeeMachine() {
    this.coffee = new Coffee();
    this.ingredientsInventory = initialiseInventory();
  }

  private Map<String, Integer> initialiseInventory() {
     Map<String, Integer> inventory = new HashMap<>();
     inventory.put("Milk", 20);
     inventory.put("Water", 40);
     return inventory;
  }

  public void displayCoffeeMenu() {
     for(Map.Entry<CoffeeNames, Double> coffeeMenu : coffee.getCoffeeMenu().entrySet()) {
       System.out.println("Coffee"+ coffeeMenu.getKey().toString()+ "Value is"+ coffeeMenu.getValue().toString());
     }
  }
  
  public synchronized Double selectCoffee(CoffeeNames coffeeName) {
    return this.coffee.getCoffeeMenu().get(coffeeName);
  }

  public synchronized void dispenseProduct(CoffeeNames coffeeName, Double amount) {
     List<CoffeeRecipe> coffeeIngredients = this.coffee.getCoffeeRecipe().get(coffeeName);
      if(hasEnoughIngredients(coffeeIngredients)) {
         coffeeIngredients.forEach(coffeeIngredient -> {
            Integer updatedQuantity = ingredientsInventory.get(coffeeIngredient.getIngredientName())-coffeeIngredient.getQuantity();
            ingredientsInventory.put(coffeeIngredient.getIngredientName(), updatedQuantity);
         });
         boolean hasChange = amount - coffee.getCoffeeMenu().get(coffeeName) > 0.0;
         if (hasChange) System.out.println("Your change is dispensed ");
          else System.out.println("Dispense Completed");
        } else {
        System.out.println("Not enough quantity is present");
      }
  } 
  
  private boolean hasEnoughIngredients(List<CoffeeRecipe> coffeeIngredients) {
        for(CoffeeRecipe coffeeIngredient : coffeeIngredients) {
            if(ingredientsInventory.get(coffeeIngredient.getIngredientName()) < coffeeIngredient.getQuantity()) return false;
        }
       return true;
    }
}

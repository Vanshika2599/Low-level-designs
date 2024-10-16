package CoffeeVendingMachine;

public class CoffeeRecipe {
    private String ingredient;
    private Integer quantity;

    CoffeeRecipe(String ingredient, Integer quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public String getIngredientName() {
        return this.ingredient;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

}

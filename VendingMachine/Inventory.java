package VendingMachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private Map<Product, Integer> products;
    private final Integer maxProductLimit;

    public Inventory(int productLimit) {
        this.maxProductLimit = productLimit;
        this.products = new ConcurrentHashMap<>(); 
    }

   public void addProducts(Product product, Integer quantity) {
      if(quantity > maxProductLimit) System.out.println("The MaxLimit of products is "+ maxProductLimit);
      else products.put(product, quantity);
   }


   public void updateProduct(Product product, Integer bought) {
      int updatedQuantity = getQuantity(product) - bought;
      products.put(product, updatedQuantity);
   }

   public Integer getQuantity(Product product) {
    return products.getOrDefault(product, 0);
   }

   public void listAvaliableProducts() {
     for(Map.Entry<Product, Integer> entry : products.entrySet()){
        System.out.println("Proudct is"+ entry.getKey()+"it's quantity is"+entry.getValue());
     }
   }

   public boolean isAvailable(Product product) {
      return products.containsKey(product) && products.get(product) > 0;
   }
}

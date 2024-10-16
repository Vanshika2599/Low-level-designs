package VendingMachine;

public class Product {
   private String productName;
   private Integer serialNum;
   private Integer price;

   public Product(String productName, Integer serialNum, Integer price){
       this.productName = productName;
       this.price = price;
       this.serialNum = serialNum;
   }

}

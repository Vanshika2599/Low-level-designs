package VendingMachine;

public class IdleVendingMachineState implements VendingMachineState {
    private final VendingMachine vendingMachine;
    
    public IdleVendingMachineState(VendingMachine vendingMachine){
      this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        
    }

    @Override
    public void insertNotes(Note note) {
        System.out.println("Please select the product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select product and make payment first");
    }  
}

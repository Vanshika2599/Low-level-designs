package VendingMachine;

public class VendingMachine {

    private VendingMachine instance;
    private Product selectedProduct;
    private Inventory inventory;
    private VendingMachineState readyVendingMachineState; 
    private VendingMachineState idleVendingMachineState;
    private VendingMachineState dispenseVendingMachineState;
    private Integer totalPayment;
    private Integer insertedPayment;

    private VendingMachine(int productLimit){
        this.inventory = new Inventory(productLimit);
        this.selectedProduct = null;
        this.totalPayment = 0;
        this.insertedPayment = 0;
        this.readyVendingMachineState = new ReadyVendingMachineState(this);
        this.idleVendingMachineState = new IdleVendingMachineState(this);
       
    }

    public synchronized VendingMachine getInstance(int productLimit){
     if(instance ==  null) instance = new VendingMachine(productLimit);
     return instance;
    }

    
   
}

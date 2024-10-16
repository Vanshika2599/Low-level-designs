package VendingMachine;

public class DispenseVendingMachineState implements VendingMachineState{
    
    private VendingMachine vendingMachine;

    public DispenseVendingMachineState(VendingMachine vendingMachine){
     this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void insertNotes(Note note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertNotes'");
    }

    @Override
    public void dispenseProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }
}

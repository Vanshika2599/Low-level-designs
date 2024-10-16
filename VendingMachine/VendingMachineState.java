package VendingMachine;

public interface VendingMachineState {
    
    public void selectProduct(Product product);
    public void insertNotes(Note note);
    public void dispenseProduct();

}

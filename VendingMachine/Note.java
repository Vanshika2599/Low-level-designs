package VendingMachine;

public enum Note {
   ONE(1),
   FIVE(5),
   TEN(10),
   HUNDRED(100);

   private final int value;
   Note(int value){
    this.value = value;
   }
}

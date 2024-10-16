package ParkingLot;

public class Main {
   public static void main(String[] args){
      ParkingLot parkingLot = ParkingLot.getInstance(3);
      parkingLot.addFloor(4, 3, 2);
      parkingLot.addFloor(5, 2, 1);
      Vehicle carVehicle = new Car("HP40570");
      Vehicle truckVehicle = new Truck("JK4321");
      parkingLot.parkVehicle(truckVehicle);
      parkingLot.parkVehicle(carVehicle);
      parkingLot.unparkVehicle(truckVehicle);
   }
}
